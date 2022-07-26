package day05nestedif;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		
		/*
		 	Ask user to enter year
			Type java code by using if-else if() statement.
			Write a program to check if a year is leap year or not.
			if the year is divisible by 100 then it must be divisible by 400.
			If a year is not divisible by 100 then it must be divisible by 4.

			Kullanicidan bir yil alin ve java programi yazarak bu yilin artik yil olum olmadigini soyleyin
			eger girilen yil 100 ile bolunuyorsa, 400 ile mutlaka bolunmesi lazim
			eger girilen yil 100 ile bolunmuyorsa ,  mutlaka 4 ile bolunmesi lazim
	    */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a year to check if it is 'Leap Year' or not");
		int year = scanner.nextInt();
		
		/*
		  & and && have similar functionality.
		  If you use &, Java checks all conditions everytime
		  If you use &&, Java does not check the second condition if the first condition is false
		 */
		
		if(year%100==0 && year%400==0) {
			
			System.out.println(year + " is leap year.");
			
		}else if(year%100!=0 && year%4==0) {
			
			System.out.println(year + " is leap year.");
			
		}else {
			
			System.out.println(year + " is not leap year.");
			
		}
		
		scanner.close();

	}

}
