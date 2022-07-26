package day25encapsulationandinteviewquestions;

import java.util.Scanner;

public class InterviewQuestions04 {


    public static void main(String[] args) {
        //Create a program checks if a string is palindrome or not

        Scanner scanner= new Scanner(System.in);
        System.out.println("Please enter a string");
        String string = scanner.nextLine().replace(" ", "").toLowerCase();
        isPalindrome(string);

    }

    public static void isPalindrome(String string) {
        String revString="";
        for (int i=string.length()-1;i>=0;i-- ) {
            revString+=string.charAt(i);
        }
        if(string.equals(revString)) {
            System.out.println("it is a palindrome");
        }else {
            System.out.println("It is not a palindrome");
        }
    }
}

