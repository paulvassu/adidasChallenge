# Simple REST API

### Reference Documentation
For further reference on the stack components used, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Web Starter](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#boot-features-developing-web-applications)
* [Spring Boot Actuator](https://docs.spring.io/spring-boot/docs/{bootVersion}/reference/htmlsingle/#production-ready)

### Functionality
The service will only respond to one endpoint:
`/greeting` taking one parameter `?name=`, such as: `http://localhost:8080/greeting?name=World`. 
Expected response code is 200 and content: `Hello, World!`


### Guides
To run the application, execute:
`./gradlew build && java -jar build/libs/challenge-0.0.1.jar`

To trigger the unit tests:
`gradle test`

For the running service, you can get the status of the application from the management endpoints, such as:
* [Health Endpoint](http://localhost:8080/actuator/health)
* [Metrics Endpoint](http://localhost:8080/actuator/metrics), such as:
* [Memory Used](http://localhost:8080/actuator/metrics/jvm.memory.used)


### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

