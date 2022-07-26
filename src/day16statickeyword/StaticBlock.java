package day16statickeyword;

public class StaticBlock {
	
	/*
	 	static variable: Class variable, it is attached to the class and you should use class name to access.
	 	static method: They belong to the class, you should use class name to access.
	 	
	 	static block: 1)It is used to initialize "class(static) variables"
	 	              2)static block is executed before everything(contructors, methods, main method) inside the class
	 	              3)If you have multiple static blocks, first one runs first


	 	  static  block : 1) class (static) degiskenlere deger atamak icin kullanilir
	 	  				  2) static block sinif icindeki butun kodlardan (constructor, methods, main method) once calisir
	 	  				  3) Eger birden fazla static block iniz varsa en bastaki en once calisir

	*/
	
	//I did not use "static block" to initialize
	static int age = 12;
	
	//I used "static block" to initialize
	static int year;	
	static {
		year = 2021;
	}
	
	static {
		System.out.println("Static block 1");
	}
	
	static {
		System.out.println("Static block 2");
	}
	
	static {
		System.out.println("Static block 3");
	}

	public static void main(String[] args) {
		
		StaticBlock obj1 = new StaticBlock();
		method1();
		System.out.println("Main");
		method2();

	}
	
	public static void method1() {

		System.out.println("Method 1");
	}
	
	public static void method2() {

		System.out.println("Method 2");
	}
	
	StaticBlock(){

		System.out.println("Constructor");
	}

}
