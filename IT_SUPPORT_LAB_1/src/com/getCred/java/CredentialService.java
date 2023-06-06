package com.getCred.java;

import java.util.Random;
import com.company.model.Employee;
import com.cred.java.ICredentials;

public class CredentialService implements ICredentials {
	
	
	public String generateEmailAddress(String firstName,String lastName,String department)
	{
		System.out.print("Hi "+firstName+" "+lastName);
		return firstName+lastName+"@"+department+".innowave.com";
	}
	
	public String generatePassword()
	{	
		String password="";
		String capitalLetters="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String numbers="0123456789";
		String specialChar="!@#$%^&*()</.>?_";
		
		String values=capitalLetters+smallLetters+numbers+specialChar;
		
		Random random=new Random();
		
			for(int i=0;i<8;i++)
			{
				int index=random.nextInt(values.length());
				char c=values.charAt(index);
			
				password+=String.valueOf(c);
			}	
			return password;
				
	}
		
	
	public void showCredentials(Employee emp)
	{
		System.out.println("\nFollowing are the Credentials. \nEmail:"+emp.getEmail());
		System.out.println("Password:"+emp.getPassword());
	}


}
