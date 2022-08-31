## Java Spring Security OAuth2 Resource Server Plugin

The **java-spring-security-oauth2-resourceserver-plugin** is a plugin to enable and configure Spring Security OAuth2 Resource Server in Spring Boot Java applications.

Applying this plugin into a Spring Boot project will prepare and configure it for all those features:

1. Enables and configures Spring Security OAuth2 Resource Server;
2. Configures an instance of `WebSecurityConfigurerAdapter` following good practices for REST API applications;
3. Configures an error handler for Spring Security exceptions using the Problem-Spring-Web library;
4. Generates production and test sample codes so that you have a starting point for writing good integration tests for protected REST API;
5. Configures Docker Compose with Keycloak Authorization Server so that you can run you application locally;

## How to use

The following steps show how to apply the plugin to an existing Java Spring Boot application.

1. First, import our stack if you haven't done it yet:
```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

2. Now, in the project directory, apply the plugin and answer all the questions:
```sh
stk apply plugin java-springboot-restapi-stack/java-spring-security-oauth2-resourceserver-plugin
```

3. Still inside the project directory, you can verify whether the plugin was applied or not by checking the updated and created files:
```sh
git status
```

Nice! You're ready for production I guess 🥳

## Support

If you need any help, please open an [issue on Plugin's Github repository](https://github.com/zup-academy/java-spring-security-oauth2-resourceserver-plugin). 
