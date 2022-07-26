package day24multithreadsyncencapsulation;

public class Student {
	
	/*
	 	Data Hiding Process is called "Encapsulation"
	 	
	 	1)To hide class members, use "private" access modifier for them.
	 	  If you do not want anybody to see object details, do not create "toString()"
	 	2)To read the value of hidden variables, we create "getters", and by using "getters" we can read the values 
	 	3)To update value of a variable for a specific student, use "setters"
	 	
	 	Note: To create an "immutable class"
	 		a)Make the variables private
	 		b)Do not create any setters
	 		
	    Note: getter() and setter() methods are called "Java Beans" in Java
	    
        Note:Getter method names start with "get" followed by "variable name"
             int number = 11; ==> Getter: getNumber() -   Setter: setNumber()
             But if the variable is "boolean", getter method names start with "is" followed by "variable name"
             boolean old = true; ==> Getter:isOld()  -  Setter: setOld() 
             
       Note: a)The return type of getter is same with the return type of the variable
             b)The return type of setter is "void" everytime.
             c)Getters do not use "parameters" but setters must use parameters to update the existing value

	      Veri Gizleme İşlemine "Encapsulation" denir.
	      1) Sinif uyelerini gizlemek istiyorsak, "private" access modifier kullaniriz
	      	Eger baskasinin bu objelerin detaylarina ulasmasini istemiyorsak, "toString()" kullanilmaz
	      2) Gizlenmis degiskenlerin degerlerini okumak icin "getters" methodu olustururuz ve bu "getters"i kullanarak degiskenin degerini okuruz
	      3) Gizlenmis degiskenlerin degerlerini spesifik bir obje icin guncellemek istiyorsak, "setters" methodu olustururuz.

	    Not: "immutable class" olusturmak icin
	 		a) degiskenlerin access modifieri  "private" yap
	 		b) Herhangi bir setters methodu olusturma

	 	Not: getter() and setter() methodlarina "Java Beans" denir

	 	Not:Getter method isimleri "get" ile baslar ve "degisken ismi" ile devam eder
             int yas = 11; ==> Getter: getYas() -   Setter: setYas()
             fakat eger degisken "boolean" ise, getter method isimleri "is" ile baslar ve "degisken ismi" ile devam eder
             boolean yasli = true; ==> Getter:isYasli()  -  Setter: setYasli()

	    Not: a) getter'in return type degiskenin (variable) return type ile aynidir
             b) setter'in return type ise daima "void" dir.
             c) Getters methodu "parametre" kullanmaz fakat setters MUTLAKA parametre kullanmali ki degiskenin degerini guncellesin

	*/
	
	private String name = "Mark Stone";
	private int age = 33;
	private boolean isSuccessful = false;
	
	public Student(String name, int age, boolean isSuccessful) {
		this.name = name;
		this.age = age;
		this.isSuccessful = isSuccessful;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

}
