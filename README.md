# User Registration System - UC6

## Problem Statement
As a user, I need to enter a valid password.

## Requirement
The password should:
- Contain a minimum of 8 characters.
- Contain at least one uppercase letter.

## Valid Examples
- Password
- Java1234
- Welcome1

## Invalid Examples
- password
- java1234
- pass

## Regex Used

```java
^(?=.*[A-Z]).{8,}$
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
5. The application checks whether the password contains at least 8 characters and one uppercase letter.

## Author
Raju