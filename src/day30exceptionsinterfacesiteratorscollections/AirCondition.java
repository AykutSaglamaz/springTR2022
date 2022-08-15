package day30exceptionsinterfacesiteratorscollections;

public interface AirCondition {
	
	int price = 3000;
	
	void climate();
	
	void eat();
	
	/*
	 	Interview Question: What is the difference between "Abstract Class" and "Interfaces"?
	 	
	 						1) Abstract Class can have concrete methods without needing any keyword.
	 						   Interface can have concrete methods with "default" and "static" keywords. 
	 						2) In an inteface all methods are public and abstract, but in an abstract class
	 						   you can have every type of methods
	 						3) All variables are "public", "static", and "final" in interfaces, in abstract classes
	 						   we can have every type of variables
	 						4) Abstract classes have "constructors", interfaces do not have.
	 						5) Both cannot be instantiated (cannot create object from them)
	 						6) A concrete class can have just a single "abstract class" parent but it can have 
	 						   multiple interface parent.
	 						7) Class ====> Interface use "implements" keyword
	 						   Interface ====> Interface use "extends" keyword
	 						   Class ====> Class use "extends" keyword
	 */

}
