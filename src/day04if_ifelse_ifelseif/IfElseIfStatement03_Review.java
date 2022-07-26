package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfStatement03_Review {

    public static void main (String[]args){

        /*
		 	A school has following rules for grading system:
			1. Below 50 - D   2. 50 to 59 - C     3. 60 to 79 - B.   4. From 80 to 100 - A
			Ask user to enter marks and print the corresponding grade.
		*/

        Scanner scan = new Scanner(System.in);
        System.out.println("enter your grade");
        double grade = scan.nextDouble();

        if (grade < 0) {
            System.out.println("please enter a positive number");
        } else if (grade < 50) {
            System.out.println("Your grade is D");
        } else if (grade < 60) {
            System.out.println("your grade is C");
        } else if (grade < 80) {
            System.out.println("your grade is B");
        } else if (grade < 101) {
            System.out.println("your grade is A");
        } else {
            System.out.println("please enter a number between 0-100");
        }


    }

}
