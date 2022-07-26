package day11loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		
		/*
		 	Type program to find the sum of the integers from 1 to 100
		*/
		int sum = 0;
		for(int i=1; i<101;i++) {
			sum = sum + i;		
			//If you want to see sum value for every loop, put System.out.println("sum: " + sum); inside the loop body	
		}		
		//If you want to see just the final sum, put System.out.println("sum: " + sum); outside the loop body
		System.out.println("sum: " + sum);
		
		
		/*
		 	Ask user to enter starting and ending value, then find the sum of all integers from the starting to the ending value.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter starting value...");
		int x = scanner.nextInt();
		System.out.println("Enter ending value...");
		int y = scanner.nextInt();
		
		int s = 0;
		
		if(x>y) {
			
			System.err.println("Starting value should be smaller than ending value");
			
		}else {
		
			for(int i=x; i<y+1; i++) {
				s = s + i;
			}
			
			System.out.println("Sum from user: " + s);
			
		}

	}

}
