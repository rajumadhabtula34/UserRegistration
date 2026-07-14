package com.userregistration;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration user = new UserRegistration();

    // ------------------- First Name -------------------

    @Test
    void givenValidFirstName_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validateFirstName("Raju"));
    }

    @Test
    void givenInvalidFirstName_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validateFirstName("raju"));

        assertEquals("Invalid First Name", exception.getMessage());
    }

    // ------------------- Last Name -------------------

    @Test
    void givenValidLastName_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validateLastName("Kumar"));
    }

    @Test
    void givenInvalidLastName_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validateLastName("kumar"));

        assertEquals("Invalid Last Name", exception.getMessage());
    }

    // ------------------- Email -------------------

    @Test
    void givenValidEmail_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validateEmailAll("abc@yahoo.com"));
    }

    @Test
    void givenInvalidEmail_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validateEmailAll("abc@.com"));

        assertEquals("Invalid Email", exception.getMessage());
    }

    // ------------------- Mobile -------------------

    @Test
    void givenValidMobileNumber_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validatePhoneNumber("91 9919819801"));
    }

    @Test
    void givenInvalidMobileNumber_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validatePhoneNumber("919919819801"));

        assertEquals("Invalid Mobile Number", exception.getMessage());
    }

    // ------------------- Password Rule 1 -------------------

    @Test
    void givenValidPasswordRule1_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validatePasswordRule1("Password"));
    }

    @Test
    void givenInvalidPasswordRule1_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validatePasswordRule1("Pass"));

        assertEquals("Invalid Password: Minimum 8 Characters Required",
                exception.getMessage());
    }

    // ------------------- Password Rule 2 -------------------

    @Test
    void givenValidPasswordRule2_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validatePasswordRule2("Password"));
    }

    @Test
    void givenInvalidPasswordRule2_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validatePasswordRule2("password"));

        assertEquals("Invalid Password: At Least One Uppercase Letter Required",
                exception.getMessage());
    }

    // ------------------- Password Rule 3 -------------------

    @Test
    void givenValidPasswordRule3_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validatePasswordRule3("Password1"));
    }

    @Test
    void givenInvalidPasswordRule3_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validatePasswordRule3("Password"));

        assertEquals("Invalid Password: At Least One Numeric Value Required",
                exception.getMessage());
    }

    // ------------------- Password Rule 4 -------------------

    @Test
    void givenValidPasswordRule4_ShouldReturnTrue() throws UserRegistrationException {
        assertTrue(user.validatePasswordRule4("Password1@"));
    }

    @Test
    void givenInvalidPasswordRule4_ShouldThrowException() {

        UserRegistrationException exception = assertThrows(
                UserRegistrationException.class,
                () -> user.validatePasswordRule4("Password123"));

        assertEquals("Invalid Password: Exactly One Special Character Required",
                exception.getMessage());
    }
}