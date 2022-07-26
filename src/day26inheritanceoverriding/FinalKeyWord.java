package day26inheritanceoverriding;


public class FinalKeyWord {

	/*
	 	"final" keyword can be used for 
	 	a)Variables: It means you have to initialize the variable
	 	             It means you cannot update the value after initializing
	    b)Methods: It means you cannot change the body of the method
	    c)Class: Cannot have child classes, it means you cannot "extends" to final classes
	             Note: final classes can be child class but cannot be parent class
	             i)All wrapper classes are final classes
	             ii)All immutable classes are final classes, so String Class is a final class

	   				'final' anahtar kavrami asagidaki durumlar icin kullanilabilir:
	   a) Variables (degiskenler): Mutlaka assign (deger atama) islemi yapilmali
	   							   Deger atama isleminden sonra degiskende guncelleme islemi yapamazsiniz
	   b) Mehtod : Methodun icindekileri degistiremezsiniz
	   c) Class (sinif): Sinif alt siniflara sahip olamaz. Final siniflara "extends" yapamazsiniz
	   		Not: final class (siniflar) alt (child) sinif olabilir fakat parent(ust) sinif olamaz
	   		i) Butun wrapper siniflar final class'tir
	   		ii) Butun immutable siniflar final class'tir, Yani String Class'lar final class'tir
	*/
	
	public final String name = "Ali Can";
	
	
	public static void main(String[] args) {
		
		FinalKeyWord obj = new FinalKeyWord();

	}

}
