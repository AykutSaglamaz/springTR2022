package day21Listsforeachloop;
import day24multithreadsyncencapsulation.AccessModifier01;

public class AccessModifierRunner01 extends AccessModifier01 {

    public static void main(String[] args) {

        AccessModifierRunner01 obj1 = new AccessModifierRunner01();
		/*
		 	1)By using obj1, you cannot access to "profession" because "profession" is
		 	  using private access modifier and you are in a different class.
		 	2)By using obj1, you cannot access to "school" because "school" is using
		 	  "default" access modifier and you cannot access "default" class members from any other "packages"
		 	3)By using obj1, you cannot access to "address" because "address" is using
		 	  "protected" access modifier and you cannot access "protected" class members
		 	  from any other "packages" if they are not "child class"
		 	4)By using obj1, you can access to "name" because it is public.

		 1) obj1 kullanarak "profession" ulasamayiz cunku "profession" private access modifier kullanmakta ve farkli siniftadir
		 2) obj1 kullanarak "okul"a ulasamayiz cunku "okul" default access modifier kullanmakta ve farkli paketlerdeki siniflara ulasamayiz
		    -default icin paket onemlidir
		 3) obj1 kullanarak "adres"e ulasamayiz cunku "adres" protected access modifier kullanmakta ve farkli paketlerdeki protected siniflara erisemeyiz
		    eger child class degilse
		 3) obj1 kullanarak,  name" e erisebiliriz cunku access modifier olarak public kullanmaktadir.

		*/
        System.out.println(obj1.name);
        System.out.println(obj1.address);


    }

}
