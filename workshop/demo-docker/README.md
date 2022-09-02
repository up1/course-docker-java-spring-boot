# Workshop with Spring Boot and Docker

## Building a Spring Boot with Apache Maven
```
$./mvnw clean package

$./mvnw spring-boot:run
```

List of URLs
* http://localhost:8080/hello
* http://localhost:8080/actuator


## Building docker image
* Copy JAR file
* Multistage build
* Use cached in Docker
* Create image for dependecy
```
$docker image build -t demo:1.0 -f Dockerfile_01

$docker image build -t demo:2.0 -f Dockerfile_02

$docker image build -t demo:3.0 -f Dockerfile_03
```

Run with Docker compose
```
$docker-compose build
```
