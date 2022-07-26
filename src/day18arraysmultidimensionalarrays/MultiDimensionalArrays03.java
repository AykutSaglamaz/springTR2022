package day18arraysmultidimensionalarrays;

import java.util.Arrays;

public class MultiDimensionalArrays03 {

	public static void main(String[] args) {
		
		//How to convert 2 dimensional array to 1 dimensional array
		// 2 boyutlu arrayi tek boyutlu array e nasil ceviririz
		
		int arr[][] = { {1,2}, {3,4,5}, {6, 7, 9, 10} };
		
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i].length;
		}

		int brr[] = new int[sum];
		int idx = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			for(int k=0; k<arr[i].length; k++) {
				
				brr[idx] = arr[i][k];
				idx++;
				
			}
		}
		
		System.out.println(Arrays.toString(brr));

	}

}
