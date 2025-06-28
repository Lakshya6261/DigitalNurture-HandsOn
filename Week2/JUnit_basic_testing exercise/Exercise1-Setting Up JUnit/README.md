# Cognizant Hands-on Exercise 1: Setting Up JUnit

This project demonstrates how to set up JUnit in a basic Java project for unit testing.

## Requirements
- Java
- Maven

## Steps to Run

1. Open terminal inside project folder.
2. Run the following command to execute the test:

   mvn test

## Project Files

- App.java : Contains a simple method to add two numbers.
- AppTest.java : Contains a JUnit test for the add method.
- pom.xml : Maven configuration with JUnit dependency.

## JUnit Dependency (Already Added in pom.xml)

<dependency>
    <groupId>junit</groupId>
    <artifactId>junit</artifactId>
    <version>4.13.2</version>
    <scope>test</scope>
</dependency>


