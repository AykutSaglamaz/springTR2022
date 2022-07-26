package day10loops;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/*
		 	Ask use to enter firstname and lastname under given conditions;
		 	Asagidaki sartlar altinda kulanicinin ad ve soyadini girsin
		 	
		 	1)If user uses space characters at the beginning or at the end remove them.
		 	2)If user enters nothing or just space character, give a message like
		 	  "Just space characters or nothing is not valid"
		    3)If user does not use space character between first and last name 
		      give a message like "One of the lastname and first name is not entered 
		      or space is not used between firstname and lastname"
		    4)If user uses multiple space characters between firstname and lastname 
		      make it single  
		    5)Initials of firstname and lastname should be uppercase, 
		      other characters should be lowercases.
		      If user does not enter the name in this format fix it.
	   */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your firstname and lastname...");
		String name = scanner.nextLine();
		
		//System.out.println("Before:" + name);
		/*
		 Note: Just by using String methods, you cannot change the original String.
		       Because of that Strings are called "Immutable"
		       If you want to change the original String, you have to do assignment like below
		*/
		
		//1.Step:
		name = name.trim();
		
		//2.Step:
		if(name.isBlank()) {
			System.out.println("Just space characters or nothing is not valid");
		}
		
		//3.Step:
		if(!name.contains(" ")) {
			System.out.println("One of the lastname and firstname is not entered or space is not used between firstname and lastname");
		}
		
		//4.Step:
		if(name.indexOf(" ")!=name.lastIndexOf(" ")) {
			
			int firstIdx = name.indexOf(" ");
			int lastIdx = name.lastIndexOf(" ");
			name = name.substring(0, firstIdx) + " " + name.substring(lastIdx+1);
		}

		//5.Step:
		
		/*
		 	When you create a variable between any curly braces, the variable can be used just inside the curly brace.
		 	If you try to use the variable outside the curly brace, Java will give Compile Time Error.
		 	This is called "Scope" in Java
		*/
		
		int idxOfSpace = name.indexOf(" ");
		String firstNameFormatted = "";
		String lastNameFormatted = "";

		if(idxOfSpace!=-1) {
			firstNameFormatted = name.substring(0, 1).toUpperCase() + name.substring(1, idxOfSpace).toLowerCase();
			lastNameFormatted = name.substring(idxOfSpace + 1, idxOfSpace + 2).toUpperCase() + name.substring(idxOfSpace + 2).toLowerCase();
		}
		name = firstNameFormatted + " " + lastNameFormatted;
		
		System.out.println(name);

	}

}
