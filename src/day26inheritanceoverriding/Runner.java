package day26inheritanceoverriding;

public class Runner {
	
	/*
	 	If you use variables whose names are same in inheritance, to understand which variables will be able to see
	 	by using objects, remember the following rule;
	 		Look at the data type which you used in object creation, the variables will be displayed from the 
	 		class which you used as data type.
	 		
	    If you use variables whose names are different in inheritance, to understand which variables will be able to see
	 	by using objects, remember the following rules;
	 	1)Look at the data type which you used in object creation, you will be able to see all variables whose names 
	 	  are different in the class which you used as data type and in all parents.
	 	2)It is not possible to see variables whose names are different from the child classes of 
	 	  the class which you used as data type.

  ** Inheritance'da isimleri aynı olan değişkenler kullanıyorsanız, nesneleri (obje) kullanarak hangi değişkenlerin görebileceğini anlamak için
	 	 aşağıdaki kuralı unutmayın:
	 * Nesne (obje) oluşturmak icin kullandığınız data type'e bakilir, yalnizca data type'i olarak kullandığınız sınıftan değişkenler görüntülenecektir.

  ** Inheritance'da isimleri farkli olan değişkenler kullanıyorsanız, nesneleri (obje) kullanarak hangi değişkenlerin görebileceğini anlamak için
	 	 aşağıdaki kuralı unutmayın:
	 1) Nesne (obje) oluşturmak icin kullandığınız data type'e bakilir, data type olarak kullandığınız sınıfta ve  parents (ebeveyn) sinifinda
	     isimleri farklı olan tüm değişkenleri görebileceksiniz.
	 2) Data type olarak kullandığınız sınıfın alt (cocuk-child) sınıflarında isimleri farklı olan değişkenleri görmeniz mümkün değildir.



	 */

	public static void main(String[] args) {
		
		Mammal b1 = new Bird();

	//	Bird b1 = new Bird();

	}

}
