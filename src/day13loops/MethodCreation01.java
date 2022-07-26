package day13loops;

public class MethodCreation01 {
	
	/*
	 	If a method is static everything inside the method must be static
	 	Eger bir method static ise onun govdesi icerisindeki hersey static olmalidir
	 */

	public static void main(String[] args) {
		
		System.out.println(add(3, 5));//8
		
		System.out.println(add(13, 15));//28
		
		System.out.println(add(31, 51));//82
		
		System.out.println(add(30, 25));//55
		
		//The values you used when you call a method are called "arguments"
		System.out.println(multiply(2,3,4));//24

	}

	/*
	 	If you want to create method whose names are same inside a class, you have to make parameters different.
	 	1)Make the data types of parameters different
	 	2)Make the number of parameters different
	 	3)If the data type of parameters are different, you can change the order of parameters
	 	
	 	Note: If you create methods whose a)names are same, b)parameters are different c)in the same class, this called
	 	      "Method Overloading".
	 	      
	 	Note: In method overloading
	 		  a)Using different return types does not work
	 		  b)Using different access modifiers does not work
	 		  c)Using different parameter names does not work
	 		  
	    Note: For Java, to make the methods different, just a)method name and b)parameters are important.
	          Because of that method name + parameters are called "Method Signature"

	Bir sınıf içinde isimleri aynı olan methodlar olusturmak istiyorsanız, parametreleri farklı hale getirmelisiniz.
		1) Parametrelerin veri tipini farklı yapın
		2) Parametre sayısını farklı yapın
		3) Parametrelerin data tipi farklıysa, parametrelerin sırasını değiştirebilirsiniz.

	Not1: Eğer a)isimleri aynı, b)parametreleri farklı c)aynı sınıfta metotlar olusturursaniz,
		buna "Method Overloading" denir.

	Not2:"Method Overloading" icin
		a) Farklı return tipleri kullanmak işe yaramaz
		b) Farklı erişim duzenleyici (access modifier) kullanmak işe yaramaz
		c) Farklı parametre isimleri kullanmak işe yaramaz

	Not3: Java için methodları farklı kılmak için sadece a)method adı ve b)parametreleri önemlidir.
		  Bundan dolayi method ismi + parametrelere "method signature" denir.
	 */
	
	//Create a method and use it inside the main method
	public static int add(int a, int b) {
		
		return a + b;	
		
	}
	
	//1)Make the data types of parameters different 
	public static int add(short t, int u) {
		
		return t + u + 4;
		
	}
	
	//2)Make the number of parameters different
	public static int add(int t, int u, int v) {
		
		return t + u + 4;
		
	}
	
	//3)If the data type of parameters are different, you can change the order of parameters
	public static int add(int u, short t) {
		
		return t + u + 4;
		
	}
	
	//Create a method which multiplies 3 integers, then call the method from main method
	//The variables created inside the method parenthesis like x, y, z are called "parameters"
	public static int multiply(int x, int y, int z) {

		return x*y*z;
	}

}
