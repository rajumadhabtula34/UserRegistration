# UC10 – JUnit Happy and Sad Test Cases

## Overview

This use case introduces automated testing using the **JUnit 5** framework. The application validates user registration fields by writing unit tests for both valid (Happy) and invalid (Sad) inputs.

The objective is to ensure that all validation methods work correctly and produce the expected results.

## Features

- Validate First Name
- Validate Last Name
- Validate Email Address
- Validate Mobile Number
- Validate Password
- Write Happy Test Cases (Valid Inputs)
- Write Sad Test Cases (Invalid Inputs)
- Use JUnit Assertions to verify expected results

## Technologies Used

- Java
- JUnit 5
- Eclipse IDE
- Git & GitHub

## JUnit Concepts Used

- `@Test` Annotation
- `assertTrue()`
- `assertFalse()`
- Unit Testing
- Happy Test Cases
- Sad Test Cases

## Test Cases Implemented

### First Name Validation
- Valid First Name → Pass
- Invalid First Name → Fail

### Last Name Validation
- Valid Last Name → Pass
- Invalid Last Name → Fail

### Email Validation
- Valid Email → Pass
- Invalid Email → Fail

### Mobile Number Validation
- Valid Mobile Number → Pass
- Invalid Mobile Number → Fail

### Password Validation
- Valid Password → Pass
- Invalid Password → Fail

## Project Structure

```
src
│
├── UserRegistration.java
├── UserRegistrationMain.java
└── UserRegistrationTest.java
```

## Expected Result

When the JUnit tests are executed:

- All valid inputs pass successfully.
- Invalid inputs fail validation.
- JUnit displays the execution report with the number of tests run, passed, and failed.
- A Green Bar indicates all tests passed.
- A Red Bar indicates one or more tests failed.

## Outcome

Successfully implemented automated unit testing using JUnit 5 for all user registration validations. Happy and Sad test cases ensure that the application correctly accepts valid user details and rejects invalid inputs, improving code reliability and reducing manual testing effort.