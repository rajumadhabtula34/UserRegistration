# UC12 – Refactor Code to Throw Custom Exceptions

## Overview

This use case enhances the User Registration System by implementing **Custom Exception Handling**. Instead of returning `false` for invalid user details, the application throws a custom exception with an appropriate error message. JUnit test cases are also updated to verify the thrown exceptions using `assertThrows()`.

## Features

- Create a custom exception class.
- Throw custom exceptions for invalid user details.
- Validate:
  - First Name
  - Last Name
  - Email Address
  - Mobile Number
  - Password Rules
- Rewrite JUnit test cases using `assertThrows()`.
- Verify exception messages using `assertEquals()`.

## Technologies Used

- Java
- JUnit 5
- Exception Handling
- Regular Expressions (Regex)
- Eclipse IDE
- Git & GitHub

## JUnit Concepts Used

- `@Test`
- `assertTrue()`
- `assertThrows()`
- `assertEquals()`
- Custom Exception Handling

## Implementation

- Created a custom exception class named `UserRegistrationException`.
- Modified all validation methods to throw `UserRegistrationException` whenever the input validation fails.
- Valid inputs return `true`.
- Invalid inputs throw a custom exception with an appropriate error message.
- JUnit test cases verify both successful validations and expected exceptions.

## Project Structure

```
src
│
├── UserRegistration.java
├── UserRegistrationException.java
├── UserRegistrationMain.java
├── UserRegistrationTest.java
└── EmailValidationParameterizedTest.java
```

## Validation Rules

### First Name
- Starts with a capital letter.
- Minimum 3 characters.

### Last Name
- Starts with a capital letter.
- Minimum 3 characters.

### Email
- Must follow a valid email format.

### Mobile Number
- Country code followed by a space and a 10-digit mobile number.

### Password
- Minimum 8 characters.
- At least one uppercase letter.
- At least one numeric digit.
- Exactly one special character.

## Expected Result

- Valid user details pass all validation checks.
- Invalid user details throw `UserRegistrationException`.
- JUnit verifies that the correct exception is thrown.
- JUnit also verifies the exception message using `assertEquals()`.
- A Green Bar indicates all test cases passed successfully.
- A Red Bar indicates one or more failed test cases.

## Outcome

Successfully refactored the User Registration System to use custom exception handling for invalid user details. Updated JUnit test cases validate both successful inputs and exception scenarios, making the application more robust, maintainable, and easier to debug.