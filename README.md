# User Registration System - UC2

## Problem Statement

As a user, I need to enter a valid last name.

## Requirement

* Last name should start with a capital letter.
* Last name should contain a minimum of 3 characters.
* Only alphabetic characters are allowed.

## Example

### Valid Inputs

* Kumar
* Sharma
* Reddy

### Invalid Inputs

* kumar
* Ku
* K1mar

## Technologies Used

* Java
* Regular Expressions (Regex)
* Eclipse IDE
* Git & GitHub

## Project Structure

```text
UserRegistrationSystem/
└── src/
    └── com.userregistration/
        ├── UserRegistration.java
        └── UserRegistrationMain.java
```

## Regex Used

```java
^[A-Z][a-zA-Z]{2,}$
```

## How to Run

1. Clone the repository.
2. Open the project in Eclipse.
3. Run `UserRegistrationMain.java`.
4. Enter the last name.
5. The program displays whether the last name is valid or invalid.

## Author

Raju
