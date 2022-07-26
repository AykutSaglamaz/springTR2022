package day19Arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class Lists03 {

    public static void main(String[] args) {

        ArrayList<Character> list1= new ArrayList<>();

        list1.add('B');
        list1.add('E');
        list1.add('A');
        list1.add('S');
        list1.add('F');


        System.out.println(list1);


        //How to check an arrayList contains a specific element
        // Bir ArrayList'in spesifik bir elementi icerdigini nasil check ederiz

        System.out.println(list1.contains('B'));//true, return boolean / If this list contains the specified element

        System.out.println(list1.contains('C'));//false

        ArrayList<Character> list2= new ArrayList<>();

        list2.add('B');
        list2.add('E');
        list2.add('A');
        list2.add('S');
        list2.add('F');


        System.out.println(list2);

        //How to check two lists equal or not
        //Iki list'in esit olup olmadigini nasil check ederiz

        System.out.println(list1.equals(list2)); // true =>> if the specified object is equal to this list
	/*
		  Ask user to enter a letter
        If the letter exist in list1 convert it to "$"
        otherwise add the element which user entered to the list1

        Kullanicidan bir harf girmesini isteyin, eger harf list1 de var ise onu "$" isaretine cevirin
        aksi durumda kullanicinin girdigi harfi (element) list1'e ekleyin
		 */


        Scanner scan = new Scanner (System.in);
        System.out.println("Please enter a letter");

        //String str = scan.next.toUpperCase().substring(0, 1);
        //char c = str.charAt(0);

        char c = scan.next().toUpperCase().charAt(0);


        if (list1.contains(c)) {
            list1.set(list1.indexOf(c), '$');

        }else {
            list1.add(c);
        }
        System.out.println(list1);

        scan.close();


    }

}
