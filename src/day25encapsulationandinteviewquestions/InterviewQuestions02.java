package day25encapsulationandinteviewquestions;

import java.util.Iterator;

public class InterviewQuestions02 {

    public static void main(String[] args) {




        // Print 1 to 100 without using any number in your code


        //1st way
        int x = 'a' / 'a'; // 1, ( a divide by a = 1 )
        String s ="##########";
        for (int i = x; i<s.length()*s.length()+1; i++) {
            System.out.print(i+ " ");

        }
        System.out.println("================");

        //2nd way ASCII

        // a=97, b = 98, cc=99, d=100

        for (int j = x; j<='d'; j++) {
            System.out.print(j+ " ");
        }


    }

}
