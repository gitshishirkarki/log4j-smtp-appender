# Log4j2 SMTP appender
## Project Description 
This is a sample project that uses Log4j SMTP appender feature to send email as per the provided configuration. 
The email is sent whenever there occurs log level as ERROR. 

## Requirements
1. Java 11

## Dependencies
1. Log4j API 

		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-api</artifactId>
			<version>2.13.0</version>
		</dependency>

2. Log4j Core

		<dependency>
			<groupId>org.apache.logging.log4j</groupId>
			<artifactId>log4j-core</artifactId>
			<version>2.13.0</version>
		</dependency>

3. Javax Mail

		<dependency>
			<groupId>javax.mail</groupId>
			<artifactId>javax.mail-api</artifactId>
			<version>1.5.2</version>
		</dependency>

## Running the project
There are several ways to run a Spring Boot application on your local machine. One way is to execute the main method in the com.shishir.smtpappender.SmtpAppenderApplication class from your IDE.

Alternatively you can use the Spring Boot Maven Plugin.
