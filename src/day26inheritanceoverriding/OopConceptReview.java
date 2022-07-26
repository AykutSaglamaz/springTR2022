package day26inheritanceoverriding;

public class OopConceptReview {

}
	
	/*
	 	OOP Concept has 4 main rules in Java
	 	
	 	1)Encapsulation:
	 		a)Data hiding
	 		b)By using "private" access modifier, we can hide data
	 		c)After hiding if you want to read data from other classes, create "getters"
	 		d)After hiding if you want to update data from other classes, create "setters"
	 		e)To create objects from classes in Java we have many ways;
	 			i)A obj1 = new A(); ==> Fixed object
	 			
	 			ii)A obj2 = new A("Veli Han", 13);
	 			   A obj3 = new A("Ayse Tan", 23);
	 			   
	 			iii)A obj4 = new A();
	 				obj4.setName("Ayse Tan");
	 				obj4.setAge(43);
	 				.
	 				.
	 				.
	 				obj4.setName("Mark Stone");
	 				obj4.setAge(23);
	 				.
	 				.
	 				.
	 	 	
	 	2)Polymorphism: Overloading + Overriding 
	 		a)Overloading:....

	 		b)Overriding:....

	 		c)What is the difference between "Overloading" and "Overriding"?
	 		
	 			i)Overloading does not need "inheritance", but inheritance is must for "Overriding".
	 			ii)private and static methods can be overloaded but private and static methods cannot be overridden
	 			iii)final methods can be overloaded, but final methods cannot be overridden.
	 			iv)Overloading happens in Compile Time, but Overriding happens in Run Time 
	 			v)Overloading is faster than Overriding
	 	
	 	3)Inheritance:...
	 	
	 	4)Abstraction:
	 */



    	/*

 	OOP Concept has 4 main rules in Java

 	1)Encapsulation:
 		a)Data hiding
 		b)By using "private" access modifier, we can hide data
 		c)After hiding if you want to read data from other classes, create "getters"
 		d)After hiding if you want to update data from other classes, create "setters"
 		e)To create objects from classes in Java we have many ways;
 			i)A obj1 = new A(); ==> Fixed object

 			ii)A obj2 = new A("Veli Han", 13);
 			   A obj3 = new A("Ayse Tan", 23);

 			iii)A obj4 = new A();
 				obj4.setName("Ayse Tan");
 				obj4.setAge(43);
 				.
 				.
 				.
 				obj4.setName("Mark Stone");
 				obj4.setAge(23);
 				.
 				.
 				.

 	2)Polymorphism: Overloading + Overriding

 		a)Overloading:....

        b)Overriding:

 		1) When you override a method, you can use same access modifiers
 		2) When you override a method,
 	 		Access modifier in child class cannot have narrower access modifier
 		3) private methods cannot be overridden, because overriding means
 	 		you want to use the method in another class but private class members
 	 		cannot be used in other classes


 	 		final methods cannot be overridden, because final method's body cannot be updated
 	 	 	but in overriding, we update the method body

 	 	static methods cannot be overridden, because static methods are
 	 		common methods for all child classes. If any child updates it,
 	 		the other classes will be affected, it can create problems
 	 		because of that Java does not let overriding for static methods.

 		4) @Override annotation checks the overriding rules, if there is any
 	 		missed or used wrongly overriding rule, it will give CTE.

 	 	5) In overriding, return types of "overridden" and "overriding" can be same

 	 	6) In overriding, from "overriding" method return type to "overridden" method return type,
 	 		you must have "IS-A" relationship.

 	  	Note: If there is “IS-A” relationship between return types,
 	  	 		return types are called “Covariant Return Types”

 	  	7) In overriding, if the return type is "primitive"
 	  		return types of "overridden" and "overriding" methods must be same
 	   	8) In overriding, if the return type is “void”,
 	   		return types of “overridden” and “overriding” methods must be “void”



 		c)What is the difference between "Overloading" and "Overriding"?

 			i)Overloading does not need "inheritance", but inheritance is must for "Overriding".
 			ii)private and static methods can be overloaded but private and static methods cannot be overridden
 			iii)final methods can be overloaded, but final methods cannot be overridden.
 			iv)Overloading happens in Compile Time, but Overriding happens in Run Time
 			v)Overloading is faster than Overriding

 	3)Inheritance:...

	1) In Java, there is parent-child relationship

	2) A parent can have infinitely many child classes
	  A child can have just a single parent Java.
	  It means, Java does not support multiple inheritance.

	3) Inheritance means; child classes can use class members from parent class

	4) Inheritance is so beneficial in
	  a) Ending repetition
	  b) Maintenance
	  c) Reusability

	5) A child class may have grandparents as well



	 There different types of inheritance

	 1) Single Inheritance: Child can have just a single parent
	 2) Hierarchical Inheritance: A parent will have multiple child classes
	 3) Multi-level Inheritance: If a child has parent, grandparent, grand-grandparent .... etc



 	4)Abstraction:

 	1) Abstract methods can be stored in "Abstract Classes".
	2) To create an abstract method,
		a) Do not put method body
		b) Put "abstract" keyword between access modifier and return type
	3) For abstract methods "public", "protected" and "default" access modifiers can be used
		but "private" cannot. Because we create "abstract methods" to access from child classes
	4) Abstract classes can have concrete methods as well, but "concrete classes" can have just
		concrete methods.
	5) Abstract methods must be overridden by child classes, other wise you get CTE.

		Note: Because of that, if we think something is must for every child class, we make them
			abstract then child classes have to override them
	6) Just concrete child classes must override "abstract methods", it is not must to override
		abstract methods for abstract child classes.
	7) If an abstract method is overridden by class x, child classes of the class x
	 	may or may not override the method
	 8) you can not create object from abstract classes, it will give CTE
	 9) Abstract classes are classes because of that they have constructors, but constructors are not used
	 	 to create objects, they can be used to initialize variables
	//abstract classes can have abstract and concrete methods

	 * Mandatory means that method should be abstract with different content


*/
