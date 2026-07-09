# User Registration System - UC3

## Problem Statement
As a user, I need to enter a valid email address.

## Requirement
- Email should follow the standard email format.
- Email contains:
  - Username
  - '@' symbol
  - Domain name
  - Domain extension
- Optional username extension and optional country extension are allowed.

## Valid Examples
- abc@bl.co
- abc.xyz@bl.co
- abc@bl.co.in
- abc.xyz@bl.co.in

## Invalid Examples
- abcbl.co
- abc@
- @bl.co
- abc@bl
- abc@.co

## Regex Used

```java
^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$
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
4. Enter the first name, last name, and email address.
5. The application validates the email and displays whether it is valid or invalid.

## Author
Raju