package day25encapsulationandinteviewquestions;

import java.util.Arrays;
import java.util.Scanner;

public class InterviewQuestions01 {

    public static void main(String[] args) {


		/*
		 Take an array from the user and get the sum of all elements

		 */

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the size of array");
        int size = scan.nextInt();

        int[] arr = new int[size];

        System.out.println("please enter " + size + " array elements");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();

        }
        System.out.println(Arrays.toString(arr));

        int sum = 0;
        for (int i : arr) {
            sum += i;

        }

        System.out.println(sum);

        //the difference between the biggest and smallest number
        System.out.println("the sum of all elements: " + sum);
        Arrays.sort(arr);
        int diffBiggestAndsmallest = arr[size - 1] - arr[0];
        System.out.println(diffBiggestAndsmallest);


        scan.close();
    }
}


