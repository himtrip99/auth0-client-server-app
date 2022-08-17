API: Spring Boot + Java Sample

This repository contains a Sprint Boot project that defines an API server using Java and Gradle. 

## Configuration

To configure the application, add a `.env` file to the root of the project. The `.env` file should contain the following environment variables:

* `PORT:`: The port number in which the API server should start.
* `CLIENT_ORIGIN_URL`: The client origin URL (including port) that will be allowed by the CORS configuration.
* `AUTH0_DOMAIN`: Your Auth0 domain name. It follows the pattern `tenant-name.region.auth0.com`.
* `AUTH0_AUDIENCE`: Your Auth0 API Audience value. Also refered as the API identifier.

Here's an example of how your `.env` file could look:

```sh
PORT=6060
CLIENT_ORIGIN_URL=http://localhost:4040
AUTH0_DOMAIN=tenant-name.region.auth0.com
AUTH0_AUDIENCE=https://hello-world.example.com
```

Also update audience, clientId, clientSecret, domain in application.yml



##  Starting the server

You can start the server in a terminal using the command:

```sh
./gradlew bootRun
```
