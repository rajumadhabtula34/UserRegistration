# User Registration System - UC1

## Problem Statement

As a user, I need to enter a valid first name.

## Requirement

* First name should start with a capital letter.
* First name should contain a minimum of 3 characters.
* Only alphabetic characters are allowed.

## Example

### Valid Inputs

* Ram
* John
* Naveen

### Invalid Inputs

* ram
* Ra
* R1m

## Technologies Used

* Java
* Regular Expressions (Regex)
* Eclipse IDE
* Git & GitHub

## Project Structure

```text
UserRegistrationSystem/
└── src/
    └── com.bridgelabz.userregistration/
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
4. Enter the first name.
5. The program displays whether the first name is valid or invalid.

## Author

Raju
