package com.company.java;

import com.company.model.Employee;
import com.cred.java.ICredentials;
import com.getCred.java.CredentialService;

import java.util.Scanner;
public class Company {
	
	public static void main(String[] args)
	{
		int choice;
		String firstName,lastName;
		Scanner scan1=new Scanner(System.in);

		
		//Input the department from the user
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		System.out.println("Please enter the department from the following:");
		choice=scan1.nextInt();
		//Input Taken


		//Input Names from the user
		System.out.println("Enter the first name:");
		firstName=scan1.next();
				
		System.out.println("Enter the last name:");
		lastName=scan1.next();
		//Input Taken
		
		
		
		Employee emp=new Employee(firstName,lastName);
		ICredentials ic=new CredentialService();
		
		String generatedEmail=null;
		String generatedPassword=null;
		
		
		switch(choice)
		{
		case 1: System.out.println("Welcome to Technical Department!");
				generatedEmail=ic.generateEmailAddress(firstName,lastName,"technical");
				generatedPassword=ic.generatePassword();				
				break;
				
		case 2: System.out.println("Welcome to Admin Department");
				generatedEmail=ic.generateEmailAddress(firstName,lastName,"admin");
				generatedPassword=ic.generatePassword();
				break;
		
		case 3: System.out.println("Welcome to Human Resource Department");
				generatedEmail=ic.generateEmailAddress(firstName,lastName,"human.resource");
				generatedPassword=ic.generatePassword();
				break;
				
		case 4: System.out.println("Welcome to Legal Department");
				generatedEmail=ic.generateEmailAddress(firstName,lastName,"legal");
				generatedPassword=ic.generatePassword();
				break;
		
		default:System.out.println("Invalid Input");
				break; 
				
		}
		
		emp.setEmail(generatedEmail);
		emp.setPassword(generatedPassword);
		
		ic.showCredentials(emp);
	}

}
