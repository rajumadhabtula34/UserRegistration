package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validateFirstName(String firstName)
	        throws UserRegistrationException {

	    if(firstName.matches("^[A-Z][a-zA-Z]{2,}$")) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid First Name");
	}
	public boolean validateLastName(String lastName)
	        throws UserRegistrationException {

	    if(lastName.matches("^[A-Z][a-zA-Z]{2,}$")) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Last Name");
	}
	public boolean validateEmail(String email)
	        throws UserRegistrationException {

	    if(email.matches("^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$")) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Email");
	}
	public boolean validatePhoneNumber(String number)throws UserRegistrationException {
		if(number.matches("^[0-9]{2}\\s[6-9][0-9]{9}$")){
			  return true;
		}
		
		 throw new UserRegistrationException("Invalid phonenumber");
	}
	public boolean validatePasswordRule1(String password)
	        throws UserRegistrationException {

	    String regex = "^.{8,}$";

	    if (Pattern.matches(regex, password)) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Password: Minimum 8 Characters Required");
	}
	public boolean validatePasswordRule2(String password)
	        throws UserRegistrationException {

	    String regex = "^(?=.*[A-Z]).{8,}$";

	    if (Pattern.matches(regex, password)) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Password: At Least One Uppercase Letter Required");
	}
	public boolean validatePasswordRule3(String password)
	        throws UserRegistrationException {

	    String regex = "^(?=.*[A-Z])(?=.*\\d).{8,}$";

	    if (Pattern.matches(regex, password)) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Password: At Least One Numeric Value Required");
	}
	public boolean validatePasswordRule4(String password)
	        throws UserRegistrationException {

	    String regex = "^(?=.*[A-Z])(?=.*\\d)(?=[^!@#$&*]*[!@#$&*][^!@#$&*]*$).{8,}$";

	    if (Pattern.matches(regex, password)) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Password: Exactly One Special Character Required");
	}
	public boolean validateEmailAll(String email)
	        throws UserRegistrationException {

	    String regex = "^[A-Za-z0-9]+([._+-][A-Za-z0-9]+)*@[A-Za-z0-9]+\\.[A-Za-z]{2,}(\\.[A-Za-z]{2})?$";

	    if (Pattern.matches(regex, email)) {
	        return true;
	    }

	    throw new UserRegistrationException("Invalid Email");
	}
	}
