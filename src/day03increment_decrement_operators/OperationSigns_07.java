package day03increment_decrement_operators;

public class OperationSigns_07 {
	
	public static void main(String[] args) {
		
		/*
	 	"=" ==> Assignment operator: It takes the value on the right and puts it into the container on the left
	 	
	 	"==" ==> Means equal, returns boolean
	 	
	 	"!=" ==> Means not equal, returns boolean
	 	
	 	">", ">=", "<", "<=" ==> All returns boolean
	 	
	 	"&&" ==> And operator. If you have at least a false the result will be false 
	 	"||" ==> Or operator. If you have a single true the result will be true
	   */
	
	   int a = 12;
	   
	   System.out.println(5 == 2 + 3);//true
	   System.out.println(5 == 2 * 3);//false
	   
	   System.out.println(5 != 3*4);//true
	   System.out.println(5 != 2+3);//false
	   
	   System.out.println(5 >= 2+3);//true
	   
	   boolean b1 = 5>2;
	   boolean b2 = 5==2+3;
	   boolean b3 = 5==2;
	   boolean b4 = 5<2;
	   
	   //To get true from &&, everything must be true. && is perfectionist.
	   System.out.println(b1 && b2);//true
	   System.out.println(b1 && b2 && b3);//false
	   System.out.println(b4 && b3);//false
	   
	   //To get false from ||, everything must be false
	   System.out.println(b1 || b2 || b3);//true
	   System.out.println(b4 || b2 || b3 || b3 || b4);//true
		
	}
	
	

}
