package com.userregistration;

public class UserRegistrationTest {

    public static void main(String[] args) {

        UserRegistration ur = new UserRegistration();

        String[] validEmails = {
                "abc@yahoo.com",
                "abc-100@yahoo.com",
                "abc.100@yahoo.com",
                "abc111@abc.com",
                "abc-100@abc.net",
                "abc.100@abc.com.au",
                "abc@1.com",
                "abc@gmail.com.com",
                "abc+100@gmail.com"
        };

        String[] invalidEmails = {
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

        System.out.println("Valid Emails");

        for (String email : validEmails) {
            System.out.println(email + " : " + ur.validateEmail(email));
        }

        System.out.println("\nInvalid Emails");

        for (String email : invalidEmails) {
            System.out.println(email + " : " + ur.validateEmail(email));
        }
    }
}
