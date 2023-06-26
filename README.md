## Description of ms-limits-service
Microservices with Spring Boot and Spring Cloud, ms-limits-service is a simple service designed to provide data that can be centrally configured on [ms-config](https://github.com/Adhito/learning-springboot-ms-config). ms-limits-service has two configurable profile that can be switched according to the needs

## Running ms-limits-service locally
ms-limits-service is a [Spring Boot](https://spring.io/guides/gs/spring-boot) application built using [Maven](https://spring.io/guides/gs/maven/). You can build/package the jar file and run it from the command line (The app uses Java 17 or newer):


```
git clone https://github.com/Adhito/learning-springboot-ms-limits-service.git
cd learning-springboot-ms-limits-service
./mvnw package
java -jar target/*.jar
```

You can then access petclinic at http://localhost:8080/

Or you can run it from Maven directly using the Spring Boot Maven plugin. If you do this, it will pick up changes that you make in the project immediately (changes to Java source files require a compile as well - most people use an IDE for this):

```
./mvnw spring-boot:run
```

> NOTE: If you prefer to use Gradle, you can build the app using `./gradlew build` and look for the jar file in `build/libs`.


## Running ms-limits-service on container

_Description are work still in progress_

```
docker run
```


## Configuration files

|Spring Boot Configuration | Class or Java property files  |
|--------------------------|---|
|The Main Class | [LimitsServiceApplication.java](https://github.com/Adhito/learning-springboot-ms-limits-service/blob/main/src/main/java/com/learningspringbootms/limitsservice/LimitsServiceApplication.java) |
|Properties Files | [application.properties](https://github.com/Adhito/learning-springboot-ms-limits-service/blob/main/src/main/resources/application.properties) |
|Pom XML | [pom.xml](https://github.com/Adhito/learning-springboot-ms-limits-service/blob/main/pom.xml) |



