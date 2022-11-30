# **Java Spring Security OAuth2 Resource Server Plugin**

Plugin Java Spring Security OAuth2 Resource Server é um conjunto de técnologias e metodologia de desenvolvimento que juntos auxiliam na definição de regras de autorização e authenticação com Spring Security e OAuth2 em Aplicações Java Spring Boot. 

Este Plugin possui suporte para projetos criados junto a Stack Java Spring Boot REST API. E Dado a isso também suporta projetos Java Spring Boot que utilizem **Maven** como gerenciador de dependencias e tenham suas configurações de properties no padrão **YAML**.


Nas proximas sessões você encontrará em detalhes informações sobre como utilizar Plugin Java Spring Security OAuth2 Resource Server para habilitar a capacidade da sua aplicação se comportar como Resource Server OAuth2. 

Abaixo esta de forma sumariazada cada sessão desta documentação.

1. [Técnologias base da Plugin](#tecnologias-base-da-plugin)
2. [Capacidades Habilitadas ao uso da Plugin](#quais-são-as-capacidades-habilitadas)
3. [Beneficio de utilizar a Plugin](#quais-os-beneficios-de-utilizar-java-spring-security-oauth2-resourceserver-plugin)
4. [Aplicando Java Spring Security OAuth2 Resource Server Plugin](#aplicando-java-spring-security-oauth2-resourceserver-plugin)


## **Tecnologias base da Plugin**

Objetivo desta sessão é informar quais são as técnologias que fazem parte do Java Spring Security OAuth2 Resource Server Plugin.

Ao aplicar este plugin em um projeto Java Spring Boot, sua aplicação poderá se beneficiar de toda infraestrutura da ferramenta Spring Security OAuth2 Resource Server, que lhe permitirá trabalhar com OAuth2, se conectando a Authorization Servers como KeyCloack, delegando apenas a responsabilidade da sua aplicação de trabalhar como Resourcer Server.


### **Composição Técnologica**

A definição deste Plugin foi pensada visando as maiores dores no uso do Spring Security e OAuth2 em aplicativos Java Spring Boot.

Entendemos que a qualidade é inegociavel, e olhamos para as técnologias e metodologias como meio para obter a tão desejada qualidade no software. Essa premissa foi o guia para escolha de cada técnologia detalhada abaixo.


- Ambiente de produção
    - Spring Security OAuth2 Resource Server
- Ambiente de testes
    - JUnit
- Ambientye de desenvolvimento
    - Docker Compose
        - KeyCloack Authorization Server



## **Quais são as capacidades Habilitadas**

Ao aplicar em seu projeto Java Spring Boot, o Java Spring Security OAuth2 Resource Server Plugin, seu projeto será capaz:

1. Configurar regras de Acesso com Spring Security
2. Criar testes de integração considerando o contexto de segurança
3. Configurar e Habilitar o KeyClock Authorization Server para desenvolvimento Local 


## **Quais os Beneficios de Utilizar Java Spring Security OAuth2 Resource Server Plugin**

1. Facilidade na configuração do Spring Security OAuth2 Resource Server em seu projeto através da StackSpot CLI.
2. Configura uma instância do `WebSecurityConfigurerAdapter` seguindo boas práticas para aplicações REST API;
3. Configura as regras de acesso para os terminais Spring Actuator e OpenAPI;
4. Configura um manipulador de erros para exceções do Spring Security usando a biblioteca Problem-Spring-Web;
5. Gera código de amostra de produção e teste para que você tenha um ponto de partida para escrever bons testes de integração para API REST protegida pelo protocolo OAuth2;
6. Configura o Docker Compose com Keycloak Authorization Server para que você possa executar seu aplicativo localmente;


[Assita este video para ver os beneficios de utilizar Java Spring Security OAuth2 Resource Server Plugin em seu projeto](https://youtu.be/hlZUwmPGxh0)


## **Aplicando Java Spring Security OAuth2 Resource Server Plugin**

Para Aplicar o Java Spring Security OAuth2 Resource Server Plugin em  seus projetos e desfrutar de seus beneficios é necessário que você tenha a CLI da StackSpot instalada em sua maquina. [Caso você não tenha siga este tutorial para fazer a instalação](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Importe a Stack em sua maquina

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Agora verifique se a Stack foi importada com sucesso

```sh
stk list stack | grep java-springboot
```

### 3. Aplique o Plugin, no diretorio do seu projeto, execute

```sh
stk apply plugin java-springboot-restapi-stack/java-spring-security-oauth2-resourceserver-plugin
```   

### 4. Verifque as modificações em seu projeto

```sh
git status
```   



## Suporte

Caso precise de ajuda, por favor abra uma [issue no repositorio do Github da Stack](https://github.com/zup-academy/java-spring-security-oauth2-resourceserver-plugin/issues).