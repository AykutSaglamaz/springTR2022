package day10loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		/*
		 	Ask user to enter a String
		 	Print the characters whose indexes are even in the same line with a space between the characters
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		//1.Way:
//		for(int i=0; i < s.length(); i++) {			
//			if(i%2==0) {
//				System.out.print(s.charAt(i) + " ");
//			}			
//		}
//		
//		System.out.println();
		
		//2.Way:
//		for(int i=0; i < s.length();i+=2) {
//			System.out.print(s.charAt(i) + " ");
//		}
		
		/*
		  Ebay Interview Question:
		  Type code to print non-repeated characters of any given String
		  verilen bir String de tekrar edilmeyen karakterleri yazdiran bir program yaziniz
		*/		
//		for(int i=0; i<s.length(); i++) {
//			if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))) {
//				System.out.print(s.charAt(i));	
//			}		
//		}
		
		/*
		 	Very common interview Question
		 	Ask user to enter a String
		 	Print the String in reverse order
		 	Ali ==> ilA
		*/
//		for(int i=s.length()-1; i>=0; i--) {
//			System.out.print(s.charAt(i));	
//		}
		
	}

}
