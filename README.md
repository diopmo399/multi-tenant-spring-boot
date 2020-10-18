# Dynamic-Multi-Tenancy-Using-Java-Spring-Boot-Security-JWT-Rest-API-MySQL-Postgresql-full-example
I wanted a solution where multi-tenancy is achieved by having a database per tenant and all user information (username, password, client Id etc) for authentication and authorization stored in a user table in the respective tenant databases. It meant that not only did I need a multi-tenant application, but also a secure application like any other web application secured by Spring Security. I know how to use Spring Security to secure a web application and how to use Hibernate to connect to a database. The requirement further dictated that all users belonging to a tenant be stored in the tenant database and not a separate or central database. This would allow for complete data isolation for each tenant.

What is multi-tenancy ?

Multi-tenancy is an architecture in which a single instance of a software application serves multiple customers. Each client is called a tenant. Tenants may be given the ability to customize some parts of the application.

A multi-tenant application is where a tenant (i.e. users in a company) feels that the application has been created and deployed for them. In reality, there are many such tenants and they too are using the same application but get a feel that its built just for them.

Technology and Project Structure :

    Java 8
    Spring Boot
    Spring Security
    Spring AOP
    Spring Data JPA
    Hibernate
    JWT
    MySQL
    IntliJ

You can do that by using : https://start.spring.io/
