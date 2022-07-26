package day14methodoverloadingconstruction;

	/*
	 	There are 3 main variable types in Java
		 	a)Local Variables: They are created inside a method body
		 	                   You have to initialize(Assigning a value) local variables
		 	                   When you create a variable, Java uses default values for the variables, but
		 	                   if the variable is local variable Java does NOT use default values. 
		 	                   You have to assign a value for local variables, 
		 	                   otherwise when you try to use local variable Java complains
		 	
		 	b)Instance(Object) Variables: If you create a variable outside the methods and inside the class WITHOUT using "static"
		 	                              keyword, it is called "instance(object) variable"
		 	                              
		 	                              Instance variables may initialize or not. 
		 	                              If you initialize, Java uses the value which you assigned for the variable.
		 	                              If you do not initialize, Java uses default value for the variable.
		 	                              
		 	c)Class Variables: If you create a variable outside the methods and inside the class WITH using "static"
		 	                   keyword, it is called "instance(object) variable"

		Java'da 3 ana değişken türü vardır

			a)Local Variables (yerel degisken): Bir method body (govdesi) icerisinde olusturulur
		 	                `` Yerel değişkenlere bir değer atamanız gerekir
							   Bir değişken oluşturduğunuzda Java, değişkenler için varsayılan değerleri kullanır,
							   ancak değişken yerel değişken ise Java varsayılan değerleri KULLANMAZ.
							   Yerel değişkenler için bir değer atamanız gerekir,
							   aksi takdirde yerel değişkeni kullanmaya çalıştığınızda Java şikayet eder

		 	b)Instance(Object) Variables: "static" anahtar sözcüğünü KULLANMADAN, methodlarin dışında ve sınıfın içinde bir değişken oluşturursanız
		 					buna "Instance (nesne) değişkeni" denir.
		 					Instance degiskene deger atanabilir de atanmayabilir de
		 					Eger deger atarsaniz Java atadiginiz degeri kullanir,
		 					Eger deger atamazsaniz Java default (varsayilan degeri kullanir)

		 	c)Class Variables: Eger "static" anahtar sözcüğünü KULLANARAK, methodlarin dışında ve sınıfın içinde bir değişken oluşturursanız
		 					buna "Class (Sinif) değişkeni" denir.

	 */

public class VariableTypes01 {

	//Instance variables created outside the methods, inside the class
	//To initialize is optional
	String name = "Ali Can";
	char c;

	//Class variables use "static" keyword
	//Class variables created outside the methods, inside the class
	//To initialize is optional
	/*
	 	class variables(static variables) are attached to the class, not to the object
	 */
	static String address = "Miami USA";
	
	public static void main(String[] args) {
		
		//Local variable
		int y = 11;
		//Local variable without initializing
		int z;
		//When you try to use non-initialized local variable Java complains.
		//System.out.println(z);
		
		/*
		 	When you try to use instance variable inside the main method, it complains.
		 	Because, main method is static and static methods do not accept non-static things in it.
		*/
		//System.out.println(c);
		
		//No complain, because address is static variable
		System.out.println(address);
	}
	
	
	public int add(int a, int b) {
		
		//Local variable
		int x = 12;
		
		/*
		 	When you try to use instance variable inside any non-static method, it is fine.
	    */
		System.out.println(c);
		
		return a+b;
	}

}
