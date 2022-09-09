package day14methodoverloadingconstruction;

/*
	Java knows, classes are for Object Creation, to create objects we need "constructors", because of that
	when you create a class Java creates a constructor automatically.
	
	Java gives you a default constructor, which is invisible inside the class.
	If you want you can create your own constructor as well.
	
	Note: Constructors are not methods because they do not have return types.
	      In the interview, DO NOT use "constructor method"
	      Constructors are constructor
	      
	Note: Constructor names must be same with the class name.
	Interview Question:
	What is the difference between "constructor" and "method"?
	1)Constructors do not have return type but methdos have
	2)Methods may have any name as method name but constructors must have class name as constructor name
	Note: When you create a class Java gives you default constructor but if you create any constructor Java deletes the default one
	Note: Default constructor is constructor without parameters like "public Constructors01(){ }"


	Java, classlarin object olusturmak icin olugunu bilir, bu nedenle object olusturmak icin  bizim constructors lara ihtiyacimiz var
		***** kek yapmak icin kalip ve hamur var ise bizin bunu yapabilecek bir kisiye ihtiyacimiz var, anne veya es;
		bunun icin bir class olustururken Java otomatik olarak bir constructor olusturur.

		Java size default bir constructor olusturur bu sinif icinde gorulmez.
		Eger isterseniz  constructor larinizi kendiniz olusturabilirsiniz

		Not: constructorlar method degildir cunku return tipleri yoktur. (mulakatlarda 'constructor method' diye soylemeyin
		 *** constructorlar sadece constructors dir

	**mulakat sorusu
	method ile constructor arasindaki fark nedir
	1-Constructorslarin return typeleri yoktur, methodlarin var
	2-Methodlar herhangi bir isimi method name olarak kullanabilir, fakat constructorlarin ismi MUTLAKA class ismi ile ayni olmali

	not: bir class olusturuldugunda Java size otomatik bir default constructor verir,
		eger siz kendiniz bir constructor olusturursaniz Java default olani siler

	Not: Default constructor parametresi olmayan bir constructordir ==> "public Constructors01(){ }"

*/

public class Constructors01 {
	
	public static void main(String[] args) {
		
	}
	
	public int add(int a, int b) {
		return a + b;
	}
	
	//How can we create a constructor?
	//Access Modifier   +  Class Name() + { }
	public Constructors01() {
		
	}
	
	public Constructors01(int a) {
	
	}
	
	public Constructors01(int a, String s) {
		
	}
	
	public Constructors01(char a, double d, String s) {
		
	}

}
