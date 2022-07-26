package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseStatement02 {

	public static void main(String[] args) {
		
		//Get the day name from user, then tell to the user if it is week day or weekend day 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the day in lowercases...");
		String day = scanner.next();
		
		/*
		 	1)"==" ==> Checks a)values and b)addresses (references). If both are same it returns true otherwise it returns false
		 	2)"equals()" ==> Checks just the values by NOT Ignoring Cases.
		 	3)"equalsIgnoreCase()" ==> Checks just the values by ignoring cases
		*/
		if(day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")) {
			System.out.println(day + " is weekend day");
		}else {
			System.out.println(day + " is week day");
		}
	}
}
