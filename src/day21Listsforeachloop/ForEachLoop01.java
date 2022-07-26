package day21Listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop01 {

	public static void main(String[] args) {
		
		List<Character> list1 = new ArrayList<>();
		list1.add('x');
		list1.add('z');
		list1.add('a');
		list1.add('m');
		System.out.println(list1);
		
		//Use for-loop
		for(int i=0; i<list1.size(); i++) {
			System.out.print(list1.get(i) + "! ");//x! z! a! m!
		}
		
		System.out.println();
		
		//Use for-each loop
		for(Character w : list1) {
			System.out.print(w + "! ");//x! z! a! m!
		}
		
		System.out.println();
		
		//If the characters are not vowel in the list print them on the console.
		// Unsuz olan karakterleri yaziniz
		for(Character w : list1) {
			
			if(w=='a' || w=='e' || w=='i' || w=='o' || w=='u') {
				continue;
			}
			System.out.print(w + "! ");//x! z! m!
			
		}
		
		System.out.println();
		
		//Print the ASCII values of all characters on the console
		//Tum karakterlerin ASCII degerlerin yazdiriniz
		for(Character w : list1) {
			System.out.print(w + ":" + (int)w + " - ");
		}
		
		System.out.println();
		
		//Find the sum of all ASCII values of the characters inside the list
		// Sayilarin tum ASCII degerlerinin toplamini yazdiriniz
		int sum = 0; 
		for(Character w : list1) {
			sum = sum + w;
		}
		System.out.println("The sum of the ASCII values: " + sum);
		
		//Print the characters whose ASCII values are even
		//ASCI degeri cift olan karakterlerini yazdiriniz
		for(Character w : list1) {		
			if(w%2==0) {
				System.out.print(w + " ");
			}			
		}
		
		System.out.println();
		
		//If you see any character whose ASCII value is less than 100 stop printing and give an error message
		// ASCII degeri 100 den kucuk olan bir karakter gordugunuzde, Java calismayi durdursun
		
		Character flag = ' ';
	
		for(Character w : list1) {			
			if(w<100) {				
				flag = w;				
				break;
			}			
			System.out.println(w);
		}
		System.out.println(flag + " has ASCII less than 100");
		
		//Arrays can use for-each loop as well
		
		//Print the list elements which does not end with "n"
		//List elementlerinden sonu 'n' ile bitmeyenleri yazdirin

		String s[] = {"Ali", "Can", "Hasan", "Ekrem"};		
		for(String w : s) {
			if(!w.endsWith("n")) {
				System.out.print(w + " ");
			}
		}
	}
}
