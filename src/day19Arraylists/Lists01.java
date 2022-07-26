package day19Arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {


		/*
		  Arraylists is resizable or are flexible with their size
		  Arraylists can store non-primitives
		  Arraylists can not store multiple data types

		  Arraylist'lerin boyutlari esnektir, degistirilebilir
		  Arraylist'ler non-primitiveleri depolayabilir
		  Arraylist'ler birden fazla data type depolayamaz, sadece bir data type depolayabilir

		 */


        //How to create an arraylist
        //Bir ArrayList nasil olusturulur

        ArrayList<Integer> list1 = new ArrayList<Integer>();

        ArrayList<Integer> list2 = new ArrayList<>();

        List<Integer> list3 = new ArrayList<Integer>();

        // How to add elements on Arraylist
        //ArrayList'e element nasil eklenir

        list1.add(33);
        list1.add(4);
        list1.add(15);
        list1.add(6);
        list1.add(7);
        list1.add(8);
        list1.add(9);

        //How to print all elements
        //ArrayList'in elementleri nasil yazdirilir
        System.out.println(list1);//[33, 4, 15, 6, 7, 8, 9]


        //How to add elements into specific index
        //Bir element belli bir indexe nasil eklenir

        list1.add(3, 8);

        System.out.println("Add 8 into index third: " + list1);//[33, 4, 15, 8, 6, 7, 8, 9]



        //How to sort ArrayList in ascending order
        // ArrayList'in elementleri kucukten buyuye (a-z veya 0-9) nasil siralanabilir

        Collections.sort(list1);// we use collections to sort in ascending order
        System.out.println("After sorting: "+ list1);//[4, 6, 7, 8, 8, 9, 15, 33]


        //How to sort ArrayList in descending order
        // ArrayList'in elementleri buyukten kucuge (z-a veya 9-0) nasil siralanabilir

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println("After sorting in descending order: "+ list1);//[33, 15, 9, 8, 8, 7, 6, 4]


        //How to print specific element from ArrayList
        //ArrayList'in spesifik bir elementi nasil yazdirilabilir

        System.out.println(list1.get(2));//9
        System.out.println(list1.get(4));//8
        // if index is out of list, you will get index out of bounds exception error
        //Eger girdigimiz index List disi ise, index out of bounds exception hatasi alinir

        // How to get number of elements inside an ArrayList
        //ArrayList icindeki elementlerin sayisi nasil bulunur

        System.out.println("The number of elements: " + list1.size());//8

		/*
		  Create listnum
        add the numbers 17,23, 11,17,3,5,8, -5,-3
        Please find and print the min and max elements in the list

        Listnum adinda bir List olusturun ve 17,23, 11,17,3,5,8, -5,-3 sayilarini ekleyin
        List icindeki en buyuk ve en kucuk elementi bulun
		 */


        ArrayList<Integer> listnum = new ArrayList<Integer>();

        listnum.add(17);
        listnum.add(23);
        listnum.add(11);
        listnum.add(17);
        listnum.add(3);
        listnum.add(5);
        listnum.add(8);
        listnum.add(-5);
        listnum.add(-3);



        Collections.sort(listnum);
        System.out.println(listnum);

        System.out.println("minimum: " +listnum.get(0));
        System.out.println("Maximum: " + listnum.get(listnum.size()-1));


        minMax(listnum);
        Maxmin(listnum);

    }




    public static void Maxmin(List<Integer> listnum) {
        int l =	listnum.stream().sorted(Comparator.reverseOrder()).reduce(Integer.MIN_VALUE, (t, u)->u);
        System.out.println(l);
    }

    public static void minMax(List<Integer> listnum) {

        int k=	listnum.stream().sorted().reduce(Integer.MAX_VALUE, (t,u)->u);
        System.out.println(k);

    }

}
