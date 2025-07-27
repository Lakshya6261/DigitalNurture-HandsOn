# Cognizant Hands-on Exercise 2: Verifying Interactions with Mockito

This project demonstrates:

- Creating mock objects using Mockito.
- Verifying that a method is called with specific arguments.
- Testing interactions between components.

## Requirements
- Java
- Maven

## Steps to Run

1. Open terminal inside project folder.
2. Run the following command to execute the test:

   mvn test

## Project Files

ExternalApi.java: Interface representing an external API.
MyService.java : Service that depends on the external API.
MyServiceTest.java : Unit test using Mockito to verify method interactions.
pom.xml : Maven configuration with JUnit 5 and Mockito dependencies.

