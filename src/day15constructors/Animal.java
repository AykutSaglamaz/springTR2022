package day15constructors;

/*
	We use instance variables in constructors as parameters, because constructors create objects
	and they use object related variables which are instance variables.
	
	We do not use class variables inside the constructors, because class variables are related with class
	not with objects

	Instance (object) degiskeni constructor icinde parametre olarak kullanilir, cunku constructorlar object olusturur ve
	 constructorlar object baglantili degiskenleri yani instance (object) degiskenleri kullanirlar

	 Constructorlarin icinde class(static) degiskenlerini kullanmayiz, cunku class degiskenleri sinifla baglantilidir
	 fakat objectlerle degil
*/

public class Animal {
	
	String name;
	int age;
	boolean isCarnivorous;
	String specy;
	char gender;
	
	static int counter;

	public Animal() {
		counter++;
	}

	public Animal(String name, int age, boolean isCarnivorous, String specy, char gender) {
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}

	public Animal(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;
	}

	public Animal(String specy) {
		/*
		 	1) this() is used for constructor call
		 	2) this() must be in the first line inside the constructor
		 	3) In a constructor, how many times can "this()" be used? 
		 	   Answer: At most once. Because this() must be in the first line, if you use 
		 	           more than once where will you put it? You need to put it into second, third, .. etc
		 	           lines but it is not allowed.
		 	           
		 	What is the difference between "this()" and "this"?           
		 	1)"this()" is used for constructor call, "this" is used for variable call.          
		 	2)"this()" can be used just once, "this" can be used many times.



	   */
		this("Bobby", 5, 'M'); 	
		this.specy = specy;		
		counter++;
	}
}
