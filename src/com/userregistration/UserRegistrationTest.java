package com.userregistration;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    // ---------- First Name ----------

    @Test
    void givenValidFirstName_ShouldReturnTrue() {
        assertTrue(user.validateFirstName("Raju"));
    }

    @Test
    void givenInvalidFirstName_ShouldReturnFalse() {
        assertFalse(user.validateFirstName("raju"));
    }

    // ---------- Last Name ----------

    @Test
    void givenValidLastName_ShouldReturnTrue() {
        assertTrue(user.validateLastName("Kumar"));
    }

    @Test
    void givenInvalidLastName_ShouldReturnFalse() {
        assertFalse(user.validateLastName("kumar"));
    }

    // ---------- Email ----------

    @Test
    void givenValidEmail_ShouldReturnTrue() {
        assertTrue(user.validateEmail("abc.xyz@bl.co.in"));
    }

    @Test
    void givenInvalidEmail_ShouldReturnFalse() {
        assertFalse(user.validateEmail("abc@.com"));
    }

    // ---------- Mobile Number ----------

    @Test
    void givenValidMobileNumber_ShouldReturnTrue() {
        assertTrue(user.validatePhoneNumber("91 9919819801"));
    }

    @Test
    void givenInvalidMobileNumber_ShouldReturnFalse() {
        assertFalse(user.validatePhoneNumber("919919819801"));
    }

    // ---------- Password ----------

    @Test
    void givenValidPassword_ShouldReturnTrue() {
        assertTrue(user.validatePasswordRule1("Abcd@123"));
    }

    @Test
    void givenInvalidPassword_ShouldReturnFalse() {
        assertFalse(user.validatePasswordRule1("abcd123"));
    }
}