package day21Listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	
	/*
	 	1)If you use a variable inside a method, Java does not use the original variable inside the method.
	 	  Java creates the copy of the variable the use the copy inside the method.
	 	  By using the copy, Java protects the original value from method updates.

	 	  This feature is called "Pass by value" in Java
	 	2)If you insist to update original value, you can do it by assigning method return to the variable like;
	 	  a = increase(a);

	  1) Eger bir method icindeki bir degiskeni kullanmak isterseniz, Java method icindeki original degiskeni kullanmaz
	 	  Java orijinal degiskenin bir kopyasini olusturur ve onu kullanir
	 	  Koypyasini kullanarak, Java method guncellemelerin de original degiskeni korur

	 	  Java da bu ozellige "Pass by value" denir
	  2) Eger degiskenin orijinal degeri guncellemek istiyorsaniz, deger atama islemi yapilir
	  orn. x = kitapOkuma(x)


	 */
	
	public static void main(String[] args) {
		
		/*
		 	For primitives, method call does not change the original value.
		 	If you want to change, original value you should do assignment like;
		 	a = increase(a);

		 	Primitiveler icin, method call original degeri degistirmez
		 	Eger original degeri degistirmek istiyorsaniz, eger atamasi yapilmali
		 	a = increase(a); gibi
	   */
		int a = 10;		
		System.out.println("Before method call: " + a); //10		
		increase(a);		
		System.out.println("After method call: " + a);//10
		
		/*
		 	For immutable objects, method call does not change the original value like in primitives.
		 	If you want to change, original value you should do assignment like;
		 	s = putQuestionMark(s);

		 	Immutable objectler icin, method call primitiveler gibi original degeri degistirmez
		 	Eger original degeri degistirmek istiyorsaniz, eger atamasi yapilmali
		 	s = putQuestionMark(s);
		*/
		String s = "Are you tired";
		System.out.println("Before method call: " + s);//Are you tired		
		putQuestionMark(s);
		System.out.println("After method call: " + s);//Are you tired
		
		/*
		 	For mutable objects Java copies the reference then use the copy of reference inside the method.
		 	Reference itsef and copy of reference points the same object, because of that when you call a method 
		 	for mutable objects, original value will be updated.

		 	Mutable objectler icin, Java referansi kopyalar sonra  methodun icerisinde bu kopyayi kullanir
		 	Referansin kendisi ve kopyasi da ayni object i isaret eder, bu nedenle mutable objectler icin method call
		 	yaptiginizda, original deger de guncellenir
		*/
		
		/*
		 	When you use list methods, original list will be updated.
		 	If you want to keep original list in your application, use List.copyOf() method

		 	list bir methodu kullandiginizda , original list de guncellenir
		 	Original list i de kodlarinizda  tutmak istiyorsaniz, List.copyOf() method unu kullanin
		 */
		List<String> list = new ArrayList<>();
		list.add("Hi");
		list.add("Wooow");
		list.add("Sorry");
		
		List<String> list1 = List.copyOf(list);
		
		System.out.println("Before method call: " + list);//
		
		putExclamationMark(list);
		System.out.println("After method call: " + list1);//[Hi, Wooow, Sorry]
		System.out.println("After method call: " + list);//[Hi!, Wooow!, Sorry!]
		
	}
	
	public static int increase(int x) {
		return x * 3;
	}
	
	public static String putQuestionMark(String str) {
		return str + "?";
	}
	
	public static List<String> putExclamationMark(List<String> list) {
		
		for(int i=0; i<list.size(); i++) {
			list.set(i, list.get(i)+"!");
		}
		return list;
	}

}
