package com.userregistration;

public class EmailValidationTest {

    public static void main(String[] args) {

        UserRegistration user = new UserRegistration();

        String[] emails = {
                // Valid Emails
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com",

                // Invalid Emails
                "abc",
                "abc@.com.my",
                "abc123@gmail.a",
                "abc123@.com",
                "abc123@.com.com",
                ".abc@abc.com",
                "abc()*@gmail.com",
                "abc@%*.com",
                "abc..2002@gmail.com",
                "abc.@gmail.com",
                "abc@abc@gmail.com",
                "abc@gmail.com.1a",
                "abc@gmail.com.aa.au"
        };

        for (String email : emails) {
            System.out.println(email + " -> " + user.validateEmail(email));
        }
    }
}