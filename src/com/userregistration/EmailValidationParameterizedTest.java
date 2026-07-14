package com.userregistration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class EmailValidationParameterizedTest {

    UserRegistration user = new UserRegistration();

    @ParameterizedTest
    @CsvSource({
        "abc@yahoo.com,true",
        "abc-100@yahoo.com,true",
        "abc.100@yahoo.com,true",
        "abc111@abc.com,true",
        "abc-100@abc.net,true",
        "abc.100@abc.com.au,true",
        "abc@1.com,true",
        "abc@gmail.com.com,true",
        "abc+100@gmail.com,true",

        "abc,false",
        "abc@.com.my,false",
        "abc123@gmail.a,false",
        "abc123@.com,false",
        "abc123@.com.com,false",
        ".abc@abc.com,false",
        "abc()*@gmail.com,false",
        "abc@%*.com,false",
        "abc..2002@gmail.com,false",
        "abc.@gmail.com,false",
        "abc@abc@gmail.com,false",
        "abc@gmail.com.1a,false",
        "abc@gmail.com.aa.au,false"
    })
    void givenEmail_WhenValidated_ShouldReturnExpectedResult(String email, boolean expected) {

        assertEquals(expected, user.validateEmail(email));
    }
}