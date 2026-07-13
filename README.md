# UC8 - Password Validation (Rule 4)

## Objective
Validate the user password by ensuring it satisfies all the previous password rules and contains exactly one special character.

## Requirements
The password must:

- Have a minimum of 8 characters.
- Contain at least one uppercase letter.
- Contain at least one numeric digit.
- Contain exactly one special character.

## Regex Used

```java
^(?=.*[A-Z])(?=.*[0-9])(?=(?:.*[^A-Za-z0-9]){1})(?!.*[^A-Za-z0-9].*[^A-Za-z0-9]).{8,}$
```

## Examples

### Valid Passwords

```
Password@1
Abcdef1#
Java123$
MyPass1!
```

### Invalid Passwords

```
password@1      // No uppercase letter
Password@       // No digit
Pass1           // Less than 8 characters
Password@@1     // More than one special character
PASSWORD1       // No special character
```

## Outcome

The program successfully validates passwords based on all four password rules:
- Minimum 8 characters
- At least one uppercase letter
- At least one numeric digit
- Exactly one special character