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
}
