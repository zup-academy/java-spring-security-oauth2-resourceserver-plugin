# **Java Spring Open Feign Plugin**

Java Spring Open Feign Plugin is a set of technologies and development methodology that together assist in building HTTP Clients in Java Spring Boot Applications.

This Plugin has support for projects created with Stack Java Spring Boot REST API. And given that it also supports Java Spring Boot projects that use **Maven** as a dependency manager and have their property settings in the **YAML** pattern.


In the next sections you will find detailed information on how to use Spring Open Feign Java Plugin to enable the ability to build HTTP clients in your projects.

Below is a summary of each section of this documentation.

1. [Plugin Core Technologies](#plugin-core-technologies)
2. [Capabilities Enabled when using the Plugin](#what-are-the-capabilities-enabled)
3. [Benefits of using the Plugin](#what-are-the-benefits-of-using-java-spring-open-feign-plugin)
4. [Applying Java Spring Open Feign Plugin](#applying-java-spring-open-feign-plugin)


## **Plugin core technologies**

The purpose of this session is to inform which technologies are part of the Java Spring Open Feign Plugin.

By applying this plugin to a Java Spring Boot project, your application can benefit from the entire infrastructure of the Spring Cloud Open Feign tool, which will allow you to create HTTP Clients declaratively using the Spring Web mapping API.


### **Technological Composition**

The definition of this Plugin was designed aiming at the greatest pains in the use of HTTP Clients in Java Spring Boot applications.

We understand that quality is non-negotiable, and we look to technologies and methodologies as a means to obtain the much-desired software quality. This premise was the guide for choosing each technology detailed below.


- Production environment
    - Spring Cloud Open Feign
    - Spring Web
- Test environment
    - Spring Cloud Contract WireMock
    - JUnit



## **What are the capabilities Enabled**

By applying the Java Spring Open Feign Plugin to your Java Spring Boot project, your project will be able to:

1. Create HTTP Clients declaratively
2. Explicitly configure resiliency defaults
3. Create MocksServers using WireMock
4. Create an automated integration test suite with WireMock


## **What are the benefits of using Java Spring Open Feign Plugin**

1. Ease of configuring Spring Cloud Open Feign in your project through the StackSpot CLI.
2. Create HTTP Clients declaratively
3. Custom Default Configuration for Feign Clients
4. Custom Configuration for Clients
5. Sample Codes for Creating Feign HTTP Clients based on good practices.
6. Sample Codes for Creating MocksServers with WireMock based on good practices.
5. Kafka Consumer Creation example codes based on best practices.
6. Integration Testing Sample Codes for Feign Clients based on best practices.

[Watch this video to see the benefits of using Java Spring Open Feign Plugin in your project](https://youtu.be/JhG3LjNhggA)


## **Applying Java Spring Open Feign Plugin**

To apply the Java Spring Open Feign Plugin to your projects and enjoy its benefits, you must have the StackSpot CLI installed on your machine. [If not, follow this tutorial to install](https://docs.stackspot.com/docs/stk-cli/installation/).

### 1. Import the Stack on your machine

```sh
stk import stack https://github.com/zup-academy/java-springboot-restapi-stack
```

### 2. Now check if the Stack was successfully imported

```sh
stk list stack | grep java-springboot
```

### 3. Apply the Plugin, in your project directory, execute

```sh
stk apply plugin java-springboot-restapi-stack/java-spring-open-feign-plugin
```

### 4. Check the changes in your project

```sh
git status
```



## Support

If you need help, please open an [issue in Stack's Github repository](https://github.com/zup-academy/java-spring-open-feign-plugin/issues).