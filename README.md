# User Registration System - UC5

## Problem Statement
As a user, I need to enter a valid password.

## Requirement
- Password should contain a minimum of 8 characters.

## Valid Examples
- Password
- Java1234
- abcdefgh

## Invalid Examples
- Pass
- Java12
- abc123

## Regex Used

```java
^.{8,}$
```

## Technologies Used
- Java
- Regular Expressions (Regex)
- Eclipse IDE
- Git & GitHub

## Project Structure

```
UserRegistrationSystem/
└── src/
    └── com.userregistration/
        ├── UserRegistration.java
        └── UserRegistrationMain.java
```

## How to Run
1. Clone the repository.
2. Open the project in Eclipse.
3. Run `UserRegistrationMain.java`.
4. Enter a password.
5. The application validates whether the password contains at least 8 characters.

## Author
Raju