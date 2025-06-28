# Cognizant Hands-on Exercise 5: Mocking and Stubbing with Mockito

This project demonstrates:

- Using Mockito to mock dependencies.
- Stubbing methods to return predefined values.
- Writing test cases that rely on mocked external APIs.

## Requirements
- Java
- Maven

## Steps to Run

1. Open terminal inside project folder.
2. Run the following command to execute the test:

   mvn test

## Project Files

ExternalApi.java : Interface simulating an external API.
MyService.java : Service that depends on the external API.
MyServiceTest.java : Unit test using Mockito to mock and stub the external API.
pom.xml : Maven configuration with JUnit 5 and Mockito dependencies.

