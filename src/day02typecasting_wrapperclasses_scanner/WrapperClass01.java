package day02typecasting_wrapperclasses_scanner;

public class WrapperClass01 {

	public static void main(String[] args) {
		
		/*
		   Primitive    Wrapper Class(Non-Primitive)
		      byte         Byte
		      short        Short
		      int          Integer *****
		      long         Long
		      float        Float
		      double       Double
		      
		      boolean      Boolean
		      char         Character *****	      
		*/
		
		int a = 11;
		
		Integer b = 12;
		System.out.println(b.MAX_VALUE);//2147483647
		System.out.println(b.MIN_VALUE);//-2147483648
		System.out.println(b.min(120, 23));//23
		System.out.println(b.compare(25, 64));//-1 because the first is smaller
		System.out.println(b.compare(64, 25));//1 because the second is smaller
		System.out.println(b.compare(64, 64));//0 because they are equal
		
		//Create a Short Wrapper Class variable
		//a)Print the max and min values of short data type on the console
		//b)Use any method and try to understand the logic of the method
		Short c = 123;
		Short d = 123;
		System.out.println(c.MAX_VALUE);//32767
		System.out.println(c.MIN_VALUE);//-32768
		System.out.println(c.SIZE);//16 ==> Means c is used 16 bits in the memory
		System.out.println(c.hashCode());//24533 ==> It returns the address of the 
		                                 //          non-primitive data
		System.out.println(c.equals(d));//true
		
		
		//Autoboxing
		int x = 12;
		Integer y = x;
		System.out.println(x);
		System.out.println(y);
		
		//Unboxing
		Integer z = 23;
		int t = z;
		System.out.println(z);
		System.out.println(t);
	}
}
