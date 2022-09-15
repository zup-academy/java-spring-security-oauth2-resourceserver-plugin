### Operations

- Determining access rules
            
    Determining that only clients that have the Write Scope in the Books resource are allowed to access the endpoint: `HTTP POST /api/books`.
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
    For more information see the [official documentation](https://docs.spring.io/spring-security/reference/servlet/exploits/index.html)

- Getting Token information
    
    The `@AuthenticationPrincipal` annotation takes care of invoking the Authentication.getPrincipal() method and populating the annotated principalUser attribute of the controller method.

    ```java
    @GetMapping("/user/info")
    public Map<String, Object> getUserInfo(@AuthenticationPrincipal Jwt principalUser) {
        return Collections
                .singletonMap("jwt", principalUser);
    }
    ```

    For more details on using the `@AuthenticationPrincipal` annotation or how to take better advantage of it in your code, you can refer to the [Spring Security official documentation](https://docs.spring.io/spring-security/reference/servlet /integrations/mvc.html#mvc-authentication-principal).