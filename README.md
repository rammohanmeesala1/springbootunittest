# Unit-Tests

## Application.class

Java file that runs the application with Spring-Boot (@SpringBootApplication)

## Employee.class

Pojo

## HomeController.class

RestController (*@RestController*) returns a JSON format represanting the Employee object.

*@RequestMapping* is an annotation that defines the address to runs the method. (Supports REST templates)

## HomeTest.class

This class show some methods whit annotations that defines the life cycle of tests with Junit.

In the *running* method theres a snippet using Mock and Hamcrest that validates the return of service (/home) seeking for a string containing "Dev".

:)

