package day18arraysmultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays02 {

	public static void main(String[] args) {
		
		/*
		 	Create an array by using short way
		 	Type the code to find the sum of all array elements
		*/

		int arr[] = {11, 21, 32};
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];	
		}
		System.out.println(sum);
		
		/*
		 	1)Create a String array together with user.
		 	2)Find the multiplication of the lengths of the elements.

		 	Kullaniciyla beraber String Array olusturun
		 	Arrayin elementlerinin uzunluklarinin carpimini bulunuz
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of the array to create an integer array...");

		int len = scan.nextInt();
		String brr[] = new String[len];

		int elementSayisi =1;

		do {
			System.out.println(elementSayisi+ ". elementi giriniz");
			brr[elementSayisi-1] = scan.next();
			elementSayisi++;
		}while(elementSayisi<=len);

		System.out.println(Arrays.toString(brr));

		int carpim = 1;
		for (int i = 0;i< brr.length; i++){
			carpim = carpim* brr[i].length();
		}
		System.out.println(carpim);
	}

}
