# Spring OAuth Resource Server

This is the resource server which will provide the resources to be accessed after successful OAuth login.

## Description
1. Add dependencies for Database and JDBC as well as OAuth
2. Configure `application.properties` file to store the DB config information.
3. Setup  test endpoint by creating controller.
4. Add configuration for the ResourceServer in `ResourceServerConfig` file.
5. Use annotation `@EnableResourceServer` which configures the application as OAuth Resource server
6. Use `TokenStore()` to validate token by connecting via the `JDBC`.

## Usage

Use the following command with token received from OAuth Server to successfully access the resource endpoints.

```curl
curl -H "Authorization:bearer 34a93e12-792e-4242-a7bf-6bba81b7dcc4" "http://localhost:9090/hello"
```
This will display the message from the `/hello` endpoint as 
`Hello World!!`
