package day25encapsulationandinteviewquestions;

import java.util.Scanner;

public class InterviewQuestions03 {


    public static void main(String[] args) {

        // String s = "ab3 sfr1 de ddr ff";


		/*
		 Get a String from user and create a method to print the String without space
		 Call the method from the method
		 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a String");
        String s = scanner.nextLine();
        removeSpace(s);
    }
    public static void removeSpace (String s) {
        System.out.println(s.replaceAll("\\s", ""));
        //	System.out.println(s.replaceAll(" ", ""));

    }
}
