package com.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public boolean validateFirstName(String name) {
		  String regex="^[A-Z][A-Z a-z]{2,}$";
		  return Pattern.matches(regex, name);
		  
	}
	public boolean validateLastName(String name) {
		  String regex="^[A-Z][A-Z a-z]{2,}$";
		  return Pattern.matches(regex, name);
		  
	}
	public boolean validateEmail(String email) {
		   String regex="^[0-9 A-z a-z]+([-_+.][a-z 0-9 A-Z]+)?@[0-9 a-z A-Z]+\\.[a-z A-Z]{2,}(\\.[a-z A-Z]{2})?$";
		   return Pattern.matches(regex, email);
	}
}
