package day17arrays;

import java.util.Arrays;

/*
	 	1)Arrays are used to store multiple data in a single container.
	 	2)In an array all elements must be in same data type.
	 	3)Arrays accept just "primitives" and "references" as data type, 
	 	  you cannot store "non-primitive" data types in an array theoritecally
	 	4)Arrays are non-primitive


	 	1) Arrays ayni container icinde cok sayida datayi depolamamiz icin vardir
	 	2) Arrays de butun elementler MUTLAKA ayni data type de olmasi lazim
	 	3) Arrays sadece "primitives" leri ve refereranslari data type olarak kabul eder.
	 		teorik olarak "non-primitive" data typlerini bir Array icinde depolayamayiz
	 	4) Arrays lerin data type non-primitive'dir
	 */

public class Array01 {

	public static void main(String[] args) {
		
		//How to create an array
		int a[] = new int[5];
		System.out.println(Arrays.toString(a));//[0, 0, 0, 0, 0]
		//How to add elements into an array
		a[2] = 11;
		System.out.println(Arrays.toString(a));//[0, 0, 11, 0, 0]
		a[4] = 22;
		System.out.println(Arrays.toString(a));//[0, 0, 11, 0, 22]
		a[0] = 7;
		System.out.println(Arrays.toString(a));//[7, 0, 11, 0, 22]
		a[1] = 9;
		System.out.println(Arrays.toString(a));//[7, 9, 11, 0, 22]
		a[3] = 99;
		//How to print an array on the console
		System.out.println(Arrays.toString(a));//[7, 9, 11, 99, 22]
		
		//How to print a specific element from an array
		System.out.println(a[2]);//11
		System.out.println(a[4]);//22
		// var olmayan bir indexi bulmak istedigimizde ne olur
		//System.out.println(a[5]);//ArrayIndexOutOfBoundsException
		
		//How to get the number of elements in an array
		//Note: We use "length()" in Strings, but we use "length" in array
		System.out.println(a.length);//5

	}

}
