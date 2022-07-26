package day18arraysmultidimensionalarrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		
		/*
		 	arr = { {1,2}, {3,4,5}, {6} }  and brr = { {7,8,9}, {10,11} }
		 	Find the sum of elements whose indexes are same in arr and brr
		 	arr ve brr List'lerinde indexleri ayni olan elementlerin toplamini bulun
		 	
		 	(1+7) + (2+8) + (3+10) + (4+11) + (6+12) = 64


		*/
		int arr[][] = { {1,2}, {3,4,5}, {6} };
		
		int brr[][] = { {7,8,9}, {10,11}};
		
		int outerLen = arr.length < brr.length ? arr.length : brr.length;
		
		int sum = 0;

		for(int i=0; i<outerLen; i++) {
			
			int innerLen = arr[i].length < brr[i].length ? arr[i].length : brr[i].length;
			
			for(int k=0; k<innerLen; k++){
	
				sum = sum + arr[i][k] + brr[i][k];
				
			}
			
		}
		
		System.out.println(sum);
	}
	
}
