# User Registration System

## Overview

The User Registration System validates user details using Java Regular Expressions (Regex). It ensures that the user enters valid information according to predefined rules.

## Features

### UC1 – First Name Validation

* First name should start with a capital letter.
* Minimum length should be 3 characters.

### UC2 – Last Name Validation

* Last name should start with a capital letter.
* Minimum length should be 3 characters.

### UC3 – Email Validation

* Validates email addresses in the required format.
* Example: `abc.xyz@bl.co.in`

### UC4 – Mobile Number Validation

* Accepts country code followed by a space and a 10-digit mobile number.
* Example: `91 9919819801`

### UC5 – Password Rule 1

* Password must contain a minimum of 8 characters.

### UC6 – Password Rule 2

* Password must contain at least one uppercase letter.

### UC7 – Password Rule 3

* Password must contain at least one numeric digit.

### UC8 – Password Rule 4

* Password must contain exactly one special character.

### UC9 – Email Sample Validation

* Validates multiple valid and invalid email samples using test cases.

## Technologies Used

* Java
* Regular Expressions (Regex)
* Eclipse IDE
* Git & GitHub
* JUnit (for test cases)

## Project Structure

UserRegistrationSystem/

```
src/
└── com.bridgelabz.userregistration/
    ├── UserRegistration.java
    ├── UserRegistrationMain.java
    └── UserRegistrationTest.java
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse.
3. Run `UserRegistrationMain.java`.
4. Enter the required user details.
5. The program displays whether the input is valid or invalid.

## Author

Raju
