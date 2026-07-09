package com.userregistration;

import java.util.Scanner;

public class UserRegistrationMain {
	
             public static void main(String[]args) {
            	   Scanner sc=new Scanner(System.in);
            	   System.out.println("Enter the first name: ");
            	   String name=sc.nextLine();
            	   UserRegistration user=new UserRegistration();
            	   if(user.validateFirstName(name)) {
            		     System.out.println("name is valid..");
            	   }
            	   else {
            		     System.out.println("name is invalid..");
            	   }
            	   
            	   System.out.println("Enter the last name: ");
            	   String lastname=sc.nextLine();
            	   
            	   if(user.validateLastName(lastname)) {
            		     System.out.println("name is valid..");
            	   }
            	   else {
            		     System.out.println("name is invalid..");
            	   }
            	   System.out.println("Enter the email: ");
            	   String email=sc.nextLine();
            	   
            	   if(user.validateEmail(email)) {
            		     System.out.println("email is valid..");
            	   }
            	   else {
            		     System.out.println("email is invalid..");
            	   }
            	   
            	   
             }

}
