package day12loops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		
		/*
			 Ask user to get the number of the rows to create the following image
			 For example; if user enters 5 the image is
					     							*1
					 								**2
					 								***3
					 								****4
					 								*****5
	    */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(scanner.nextInt());
		
		int i = 1;
		while(i<=n) {
			for(int j=1; j<=i; j++) {				
				System.out.print("*");				
			}			
			System.out.println(i);				
			i++;
		}
	}
}
