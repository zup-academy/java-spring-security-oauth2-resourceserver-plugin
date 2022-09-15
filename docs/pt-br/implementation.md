### Operações

- Determinando regras de acesso
            
    Determinando que apenas clientes que possuam o Scopo de  escrita no recurso Books tenha permissão para acessar o endpoint: `HTTP POST /api/books`.
    ```java
    @Configuration
    public class ResourceServerConfig extends WebSecurityConfigurerAdapter {

        @Override
        protected void configure(HttpSecurity http) throws Exception {
            http.authorizeRequests()
                    .antMatchers(HttpMethod.POST, "/api/books")
                    .hasAuthority("SCOPE_books:write")
                    .anyRequest()
                        .authenticated()
                .and()
                    .oauth2ResourceServer()  
                        .jwt();            
        }
    }
    ```
    Para mais informações consulte a [documentação oficial](https://docs.spring.io/spring-security/reference/servlet/exploits/index.html)

- Obtenhdo informações do Token
    
    A anotação `@AuthenticationPrincipal` se encarrega de invocar o método Authentication.getPrincipal() e preencher o atributo principalUser anotado do método do controller.

    ```java
    @GetMapping("/user/info")
    public Map<String, Object> getUserInfo(@AuthenticationPrincipal Jwt principalUser) {
        return Collections
                .singletonMap("jwt", principalUser);
    }
    ```

    Para mais detalhes sobre uso da anotação `@AuthenticationPrincipal` ou como tirar melhor proveito dela no seu código, você pode consultar a [documentação oficial do Spring Security](https://docs.spring.io/spring-security/reference/servlet/integrations/mvc.html#mvc-authentication-principal).
