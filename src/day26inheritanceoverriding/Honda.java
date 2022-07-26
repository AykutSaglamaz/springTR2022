package day26inheritanceoverriding;

public class Honda extends Car{

/*
 	1)When you override a method, you can use same access modifiers
 	2)When you override a method, Access modifier in child class cannot have narrower access modifier
 	3)private methods cannot be overridden, because overriding means
 	  you want to use the method in another class but private class members
 	  cannot be used in other classes
 	  
 	  final methods cannot be overridden, because final method's body 
 	  cannot be updated but in overriding, we update the method body.
 	  
 	  static methods cannot be overridden, because static methods are 
 	  common methods for all child classes. If any child updates it, 
 	  the other classes will be affected, it can create problems
 	  because of that Java does not let overriding for static methods. 
 	    
 	4)@Override annotation checks the overriding rules, if there is any
 	  missed or used wrongly overriding rule, it will give CTE.	 	  
 	5)In overriding, return types of "overridden" and "overriding" methods can be same
 	6)In overriding, form "overriding" method return type to 
 	  "overridden" method return type you must have "IS-A" relationship.
 	  Note: If there is "IS-A" relationship between return types, 
 	  return types are called "Covariant Return Types"
 	7)In overriding, if the return type is "primitive"
 	  return types of "overridden" and "overriding" methods must be same
 	8)In overriding, if the return type is "void"
 	  return types of "overridden" and "overriding" methods must be "void"

	1) Bir methodu override yaptiginizda, ayni access modifier'i kullanabilirsiniz
	2) Bir methodu override yaptiginizda,alt (child) siniftaki access modifier ust (parent) siniftaki access modifier'in
		kapsamindan daha dar olamaz
	3) private access modifier overriden edilemez, cunku overriden bir methodu baska bir sinifta kullanmak istediginiz
		anlamina gelir, fkat private sinif uyeleri baska siniflarda kullanilamaz.

		**Final method'lar overriden edilemez cunku final methodlarin icindeki kodlar guncellenemez fakat overriding de,
			method icindeki kodlar guncellenebilir.
		**Static method'lar overriden edilemez cunku static methodlar butun alt siniflar icin ortaktir. Eger herhangi bir
			alt sinif guncelleme yaparsa diger alt siniflar da etkilenier, bu problem yaratabilir bu nedenle Java Static
			methodlar icin overriding'e izin vermez
	4) @Override annotation overriding kurallarini check eder. eger herhangi bir kural ihlal edilirsa yada yanliz yazilirsa
		CTE hatasi verir
	5) Overriding'de 'overridden ve overriding'in her ikisinin return type'i ayni olabilir
	6) Overriding'de overriding'in return type'den overridden'in return type'ina mutlaka "IS-A" iliskisi olmali
		not: Eger 'IS-A' iliskisi var ise buna "Covariant Return Type" denir
	7) Overriding'de, eger return type 'primitive' ise, 'overridden ve overriding'in her ikisinin de return type'i ayni OLMALI
	8) Overriding'de, eger return type 'VOID' ise, 'overridden ve overriding'in her ikisinin de return type'i 'VOID' OLMALI

 */
	@Override
	public void move() {
		System.out.println("Honda moves fast...");
	}

}


















