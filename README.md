# User Registration System - UC7

## Problem Statement
As a user, I need to enter a valid password.

## Requirement
The password should:
- Contain at least 8 characters.
- Contain at least one uppercase letter.
- Contain at least one numeric digit.

## Valid Examples
- Password1
- Java1234
- Welcome9

## Invalid Examples
- password1
- Password
- Pass12

## Regex Used

```java
^(?=.*[A-Z])(?=.*\\d).{8,}$
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
5. The application validates the password based on all three rules.

## Author
Raju