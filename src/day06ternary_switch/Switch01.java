package day06ternary_switch;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		
		/*
		 	Type a code to get the number of month whose name is entered by user
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the month...");
		String m = scanner.next().toLowerCase();
		
		/*
		 	Inside the switch() parenthesis, you can use String, char, byte, short, int
		 	But boolean, long, float, and double can not be used`
		*/
		
		switch(m) {
		
			case "january":
				System.out.println("1. month");
				break;
			case "february":
				System.out.println("2. month");
				break;
			case "march":
				System.out.println("3. month");
				break;
			case "april":
				System.out.println("4. month");
				break;
			case "may":
				System.out.println("5. month");
				break;
			case "june":
				System.out.println("6. month");
				break;
			case "july":
				System.out.println("7. month");
				break;
			case "august":
				System.out.println("8. month");
				break;
			case "september":
				System.out.println("9. month");
				break;
			case "october":
				System.out.println("10. month");
				break;
			case "november":
				System.out.println("11. month");
				break;
			case "december":
				System.out.println("12. month");
				break;
			default:
				System.out.println("I told you to enter month names, check what did you enter ....");
		}
	}
}
