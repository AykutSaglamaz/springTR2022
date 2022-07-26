package day03increment_decrement_operators;

public class OrderOfOperations01_03 {

	public static void main(String[] args) {
		
		/*
		 	Order of Operations
		 	1)Calculate exponents 
		 	2)Do the operations inside the parenthesis
		 	3)Do multiplications and divisions. Do them from left to right
		 	4)Do additions and subtractions. Do them from left to right		 	
		*/
		
		//38 / 2 - ( 4 + 3) * 2 = ?
		System.out.println(38/2-(4 + 3)*2);//5
		
		//8+2*(14-6/2)-12 = ?
		System.out.println(8+2*(14-6/2)-12);
	}
}
