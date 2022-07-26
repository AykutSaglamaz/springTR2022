package day12loops;

import java.util.Scanner;

public class DoWhileLoop02 {

	public static void main(String[] args) {
		
		/*
		  Ask user to enter an integer.
		  If the integer is less than 100, tell user "Won!"
		  Otherwise tell user "Lost!"

		  Kullaniciya bir integer girmesini soyleyin,
		  eger kullanicinin girdigi integer 100'den kucukse, kullaniciya "kazandin"
		  aksi durumda "kaybettin" diyin.
		 */
		
		Scanner scanner = new Scanner(System.in);
		int n = 0;
		
		do {
			System.out.println("Enter an integer...");
			n = scanner.nextInt();
			
			if(n<100) {
				System.out.println("Won!");
			}
		}while(n<100);
		System.out.println("Lost!...");

	}

}
