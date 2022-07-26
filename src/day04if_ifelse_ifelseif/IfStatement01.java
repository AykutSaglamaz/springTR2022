package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement01 {

	public static void main(String[] args) {


        //Get an integer from user, then tell to the user if the number is even or odd		
		Scanner scanner = new Scanner(System.in);
//		System.out.println("Enter an integer...");
//		int num = scanner.nextInt();
//		
//		if(num % 2 == 0) {
//			System.out.println(num + " is even");
//		}		
//		if(num % 2 != 0) {
//			System.out.println(num + " is odd");
//		}
		
		//Get an integer from user, then check if it is negative or not.
//		System.out.println("Enter an integer...");
//		int num2 = scanner.nextInt();
//		
//		if(num2<0) {
//			System.out.println(num2 + " is negative");
//		}	
//		if(num2>=0) {
//			System.out.println(num2 + " is not negative");
//		}
		
		//Get the length and the height of a rectangle from user, if they equal to eachother
		//print "Square" on the console, otherwise print "Rectangle" on the console.
		System.out.println("Enter the width and length of the rectangle...");
		
		double w = scanner.nextDouble();
		double l = scanner.nextDouble();
		
		if(w<0 || l<0) {
			//When you want to print any message in red on the console use System.err.println()
			System.err.println("For width and length use positive values...");
		}
		
		if(w==l) {
			System.out.println("Square");
		}
		
		if(w!=l) {
			System.out.println("Rectangle");
		}
	}
}
