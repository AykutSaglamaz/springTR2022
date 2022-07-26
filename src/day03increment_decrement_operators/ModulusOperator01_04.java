package day03increment_decrement_operators;

import java.util.Scanner;

public class ModulusOperator01_04 {

	public static void main(String[] args) {
		
		/*
		 	Modulus operator(%) is used to find the reminder when you divide a number by the other.
		 	25:4 ==> The reminder will be 1.
		*/
		
		System.out.println(25%4);//1
		
		//Get a number from user and print the last digit of the number on the console.
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = scanner.nextInt();
		
		//To get the last digit of an integer use %10, to get the last 2 digits of an integer use %100 etc....
		System.out.println("The last digit of your number: " + num%10);
		
		//Get 3 digits integer from user the return the sum of the digits of the number
		//257 ==> 2 + 5 + 7 = 14
		
		int number = 0;
		int lastDigit = 0; 
		int midDigit = 0;
		int firstDigit = 0; 
		
		System.out.println("Give me a 3 digit integer...");
		number = scanner.nextInt(); 
		
		lastDigit = number%10;
		number = number/10;
		
		midDigit = number%10;
		number = number/10;
		
		firstDigit = number%10;
		
		System.out.println(lastDigit + midDigit + firstDigit);

	}
}
