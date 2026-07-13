# Email Validation - Test All Email Samples

## Objective

Validate all the email samples provided in the test case document using Java Regular Expressions (Regex). The program should correctly identify valid and invalid email addresses.

## Description

This program reuses the email validation method developed earlier and tests it against a predefined list of valid and invalid email samples.

## Valid Email Samples

* [abc@yahoo.com](mailto:abc@yahoo.com)
* [abc-100@yahoo.com](mailto:abc-100@yahoo.com)
* [abc.100@yahoo.com](mailto:abc.100@yahoo.com)
* [abc111@abc.com](mailto:abc111@abc.com)
* [abc-100@abc.net](mailto:abc-100@abc.net)
* [abc.100@abc.com.au](mailto:abc.100@abc.com.au)
* [abc@1.com](mailto:abc@1.com)
* [abc@gmail.com.com](mailto:abc@gmail.com.com)
* [abc+100@gmail.com](mailto:abc+100@gmail.com)

## Invalid Email Samples

* abc
* [abc@.com.my](mailto:abc@.com.my)
* [abc123@gmail.a](mailto:abc123@gmail.a)
* [abc123@.com](mailto:abc123@.com)
* [abc123@.com.com](mailto:abc123@.com.com)
* [.abc@abc.com](mailto:.abc@abc.com)
* abc()*@gmail.com
* abc@%*.com
* [abc..2002@gmail.com](mailto:abc..2002@gmail.com)
* [abc.@gmail.com](mailto:abc.@gmail.com)
* abc@[abc@gmail.com](mailto:abc@gmail.com)
* [abc@gmail.com.1a](mailto:abc@gmail.com.1a)
* [abc@gmail.com.aa.au](mailto:abc@gmail.com.aa.au)

## Implementation

* Created a separate test class to validate all email samples.
* Reused the `validateEmail()` method developed earlier.
* Displayed the validation result (`true` or `false`) for each email sample.

## Expected Result

* All valid email samples should be accepted.
* All invalid email samples should be rejected.

## Technologies Used

* Java
* Regular Expressions (Regex)
* Eclipse IDE

## Outcome

Successfully verified the email validation logic by testing multiple valid and invalid email samples.
