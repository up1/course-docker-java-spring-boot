# Workshop with Spring Boot and Docker

## Building a Spring Boot with Apache Maven
```
$./mvnw clean package

$./mvnw spring-boot:run
```

## Building docker image
* Copy JAR file
* Multistage build
* Use cached in Docker
```
$docker image build -t demo:1.0 -f Dockerfile_01

$docker image build -t demo:2.0 -f Dockerfile_02

$docker image build -t demo:3.0 -f Dockerfile_03
```

Run with Docker compose
```
$docker-compose build
```