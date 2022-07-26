package day24multithreadsyncencapsulation;

public class Varargs01 {
	
	/*
	  1) Behind the "varargs", Java uses arrays. Because of that, varargs behaves like arrays with some differences 
	  2) You cannot use more than 0ne varargs in a method parenthesis
	  3) Varargs must be the last parameter everytime
	  4) "..." can be put just after data type(int... a) or just before varargs name(int ...a). Others do not work
	  
	  Note: If you need same method to use with different number of parameters, use "varargs"

	  1) "varargs" larin arka planinda, Java Arrays'leri kullanir. Bu nedenle, "varargs"lar bazi farkliliklarla Arrays'ler gibi calisir
	  2) Method parentezinin icinde bir "varargs" dan daha fazlasi kullanilamaz
	  3) Varargs her zaman en son parametre OLMALI
	  4) "..." data type ten hem sonra (int... a) veya varargs isminden once kullanilablir (int ...a). Diger durumlar calismaz

	  Not: Eger parametre sayilari farkli olan ayni isimli methodlar kullanmak istiyorsaniz, "varargs" en iyi secenektir


	 */

	public static void main(String[] args) {
		
		System.out.println(add());
		
		System.out.println(add(5));
		
		System.out.println(add(5, 7));
		
		System.out.println(add(5, 7, 8, 9, 12));

	}
	
//	public static int add() {
//		return 3 + 5;
//	}
//	
//	public static int add(int a, int b) {
//		return a + b;
//	}
//	
//	public static int add(int a, int b, int c) {
//		return a + b + c;
//	}
	
	
	public static int add(int... a) {
		
		int sum = 0;
		for(int w : a) {
			sum = sum + w;
		}
		return sum;
	}

}
