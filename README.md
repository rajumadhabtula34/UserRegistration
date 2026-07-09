# User Registration System - UC4

## Problem Statement
As a user, I need to enter a valid mobile number.

## Requirement
- Mobile number should follow the format:
  - Two-digit country code
  - One space
  - Ten-digit mobile number

### Example
91 9919819801

## Valid Examples
- 91 9876543210
- 91 9919819801

## Invalid Examples
- 919876543210
- 91-9876543210
- 91 987654321
- 1 9876543210

## Regex Used

```java
^[0-9]{2}\\s[0-9]{10}$
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
4. Enter the mobile number in the required format.
5. The application displays whether the mobile number is valid or invalid.

## Author
Raju