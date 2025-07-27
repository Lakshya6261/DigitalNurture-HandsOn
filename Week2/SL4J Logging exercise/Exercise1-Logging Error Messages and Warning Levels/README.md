# Cognizant Hands-on Exercise: Logging with SLF4J

This project demonstrates how to log error and warning messages using SLF4J with Logback as the logging implementation.

## Requirements
- Java
- Maven

## Steps to Run

1. Open terminal inside project folder.
2. Compile and run the program using:

   mvn compile exec:java -Dexec.mainClass=LoggingExample

3. You should see error and warning messages printed in the console.

## Project Files

LoggingExample.java : Demonstrates logging error and warning messages.
pom.xml : Maven configuration with SLF4J API and Logback dependency.

## Dependencies Used

```xml
<dependency>
    <groupId>org.slf4j</groupId>
    <artifactId>slf4j-api</artifactId>
    <version>1.7.30</version>
</dependency>

<dependency>
    <groupId>ch.qos.logback</groupId>
    <artifactId>logback-classic</artifactId>
    <version>1.2.3</version>
</dependency>
