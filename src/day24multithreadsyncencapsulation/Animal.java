package day24multithreadsyncencapsulation;

	/*
	 	1)In Java, there is parent-child relationship
	 	2)A parent can have infinitely many child classes
	 	  A child can have just a single parent Java.
	 	  It means, Java does not support multiple inheritance.
	 	3)Inheritance means; child classes can use class members from 
	 	  parent class
	 	4)Inheritance is so beneficial in
	 	  a)Ending repetation
	 	  b)Maintenance
	 	  c)Reusability
	 	5)A child class may have grandparents as well

	 	1)Single Inheritance: Child can have just a single parent
	 	2)Hierachical Inheritance: A parent will have mutliple child classes
	 	3)Multi-level Inheritance: If a child has parent, grandparent, grand-grandparent,...
	*****************************************************************
	 	1) Java'da ebeveyn-cocuk (parent-child) iliskisi vardir
	 	2) Bir Ebeveyn sinirsiz sayida cocuk sinifina sahip olabilir
	 		Java'da Bir cocuk (alt sinif) yalnizca tek bir ebeveyn'e sahip olabilir
	 		Yani Java coklu kalitimi (inheritance) desteklemez
	 	3) Inheritance demek alt (cocuk) siniflar ebeveyn siniflarin uyelerini kullanabilir
	 	4) Inheritance faydalidir cunku
	 		a) code tekrarini onler (repetation)
	 		b) codelarin bakimini kolaylastirir (Maintenance)
	 		c)	Codelarin tekrar kullanimina izin verir (Reusability)
	 	5) Bir alt (cocuk) sinif dede siniflara da sahip olabilir
	 		a) Single Inheritance: Alt (cocuk) sinif sadece bir ebeveyn sahiptir
	 		b) Hierachical Inheritance: Ebeveyn birden fazla alt (cocuk) sinifina sahiptir
	 		c) Multi-level Inheritance: Eger alt sinif ebeveyn, dede, onun dedesine sahiptir


	 */

public class Animal {
	
	public void move() {
		System.out.println("Animals move...");
	}
	
	public void eat() {
		System.out.println("Animals eat...");
	}

}
