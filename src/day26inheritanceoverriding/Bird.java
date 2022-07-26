package day26inheritanceoverriding;

/*
 	super()
 	1)super() is used to call a specific constructor from parent class.
 	2)Typing "super()" or not typing "super()" have same meaning.
 	3)super() must be used in the first line inside the constructor.
 	4)super() can be used just once inside a constructor.
 	5)super() can call constructors just from "parent class" not from "grand parent classes"

 	// 	Java does not support multiple inheritance

	//If you use this. then you will be able to see all variables whose names are different from the class
		// it self and from all parent classes
		// If you want to see variables whose names are same from parent classes do not use this. because
		// you cannot see same named variables by using this.

	super()
 	1) super() parent (ust sinif) class'dan spesifik bir constructor cagirmak icin kullanilir.
 	2) "super()" yazmak ile "super()" yazmamamak arasinda fark yoktur.
 	3) super() MUTLAKA ilk satirda ve constructor icinde olmali.
 	4) super() constructor icinde YALNIZCA bir kez kullanilabilir.
 	5) super() constructor'i sadece "parent class" tan cagirabilir, "grand parent classes"dan cagiramaz.

 	# Eger this. kullaniyorsaniz, isimleri farkli olan degisklenlerin tamamina (alt veya ust (ebeveyn) siniflardan) erisebilirsiniz

 	# Eger parent classlardaki isimleri ayni olan degiskenlere erismek istiyorsaniz, this. 'yi kullanmayiniz cunku ayni isimli degiskenlere this.
 		kullanilarak erisilmez.

	# super.' yi kullanarak hem variable call hemde method call yapabiliriz
 */

public class Bird extends Mammal{
	
	String name = "Bird";
	int height = 11;
	byte ageOfBird = 1;
	
	public Bird() {
		super(3);

		System.out.println(super.ageOfAnimal);
		System.out.println(super.ageOfMammal);
		System.out.println(super.height);
		System.out.println(super.name);
		
		super.move();//Mammals move

		//this.
		
		System.out.println("Child constructor ran...");
	}
	
	public void move() {
		System.out.println("Birds move...");
	}
	
	public void fly() {
		System.out.println("Birds fly...");
	}
}











