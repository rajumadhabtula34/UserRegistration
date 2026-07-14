# UC11 – JUnit Parameterized Test for Email Validation

## Overview

This use case enhances the User Registration System by implementing **JUnit Parameterized Tests** to validate multiple email addresses. Instead of writing separate test methods for each email, a single parameterized test executes multiple times using different input values and expected results.

## Features

- Validate multiple email addresses using a single test method.
- Test both valid and invalid email formats.
- Reduce duplicate test code.
- Improve test readability and maintainability.
- Use JUnit 5 Parameterized Testing.

## Technologies Used

- Java
- JUnit 5
- Eclipse IDE
- Git & GitHub

## JUnit Concepts Used

- `@ParameterizedTest`
- `@CsvSource`
- `assertEquals()`
- Parameterized Testing

## Implementation

- `@ParameterizedTest` executes the same test method multiple times.
- `@CsvSource` supplies different email addresses along with their expected results.
- `assertEquals()` compares the expected result with the actual validation result returned by the application.

## Sample Test Data

| Email Address | Expected Result |
|---------------|-----------------|
| abc@yahoo.com | true |
| abc-100@yahoo.com | true |
| abc.100@yahoo.com | true |
| abc111@abc.com | true |
| abc-100@abc.net | true |
| abc.100@abc.com.au | true |
| abc@1.com | true |
| abc@gmail.com.com | true |
| abc+100@gmail.com | true |
| abc | false |
| abc@.com | false |
| abc123@gmail.a | false |
| abc123@.com.com | false |
| .abc@abc.com | false |
| abc()*@gmail.com | false |
| abc@%*.com | false |
| abc..2002@gmail.com | false |
| abc.@gmail.com | false |
| abc@abc@gmail.com | false |
| abc@gmail.com.1a | false |
| abc@gmail.com.aa.au | false |

## Project Structure

```
src
│
├── UserRegistration.java
├── UserRegistrationMain.java
├── UserRegistrationTest.java
└── EmailValidationParameterizedTest.java
```

## Expected Result

- The parameterized test executes once for every email entry provided in `@CsvSource`.
- Valid email addresses pass the validation.
- Invalid email addresses fail the validation.
- JUnit displays the total number of test executions along with pass/fail status.
- A Green Bar indicates all tests passed successfully.
- A Red Bar indicates one or more test failures.

## Advantages of Parameterized Testing

- Eliminates duplicate test methods.
- Improves code readability.
- Easier to maintain.
- Increases test coverage.
- Executes multiple test cases with a single test method.

## Outcome

Successfully implemented JUnit Parameterized Testing to validate multiple email addresses using `@ParameterizedTest` and `@CsvSource`. The application efficiently verifies both valid and invalid email formats while reducing code duplication and improving test maintainability.