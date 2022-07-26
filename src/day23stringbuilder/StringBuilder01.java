package day23stringbuilder;

public class StringBuilder01 {

    public static void main(String[] args) {


        //String is immutable and Java create Stringbuilder to handle it.
        //Stringler immutable'dir bu nedenle Java bu sorunu asmak icin Stringbuilder ' olusturmustur

        //How to create a String by using "StringBuilder Class"
        //"StringBuilder Class" kullanarak String olusturmak

        //1. way
        StringBuilder sb = new StringBuilder();
        System.out.println("The defauld value of the capacity is: "+ sb.capacity());

        // if you will add new characters constantly into your String use 1st way

        //To add something into the Stringbuilder
        sb.append("Umit");
        System.out.println(sb);

        sb.append(" Guler");

        System.out.println("The value of capacity after appending something: " + sb.capacity());

        String name = "Serhat";
        name.toUpperCase();
        System.out.println(name);//Serhat

        System.out.println(name.toUpperCase());//SERHAT

        //When we update Stringbuilder, we print the updated version
        sb.append(" is one of the best qa Engineer");
        System.out.println(sb);

        //2. way to create StringBuilder with parameter

        StringBuilder sb1 = new StringBuilder("Ali");

        //if you will create an ordinary String use 2nd way

        System.out.println(sb1);
        System.out.println(sb1.capacity());

        sb1.append(" and Veli will find the job");

        System.out.println(sb1);
        System.out.println(sb1.capacity());// it returns the capacity of the StringBuilder field
        System.out.println(sb1.length()); // it returns the number of characters

        //3. way to create StringBuilder with capacity
        System.out.println(">>>>>>>>");

        StringBuilder sb3 = new StringBuilder(3);

        // if you sure about the length of the String use 3rd way

        sb3.append("Alper");
        System.out.println(sb3);

        //Stringbuilders are flexible for the capacity, it is not fixed. We can update them
        //Stringbuilders capacity bakimindan esnektir, capacity gundelenebilir

        sb3.append(" Yusuf");
        System.out.println(sb3);


        //Chaining with append method// append method zinciri

        StringBuilder sb4 = new StringBuilder("Java");
        sb4.append("+").append("Selenium").append("+").append("SQL");
        System.out.println(sb4);//Java+Selenium+SQL


        System.out.println("=========");

        //To append some chars between specific indexes
        // specific indexler arasindaki karakterleri eklemek icin

//		sb4.append("xxx", 0, 3);// if you want to add some characters from a String use append() method like this
//		System.out.println(sb4);
//
//		sb4.append(" $12.99", 1, 7);//
//		System.out.println(sb4);

        sb4.append(sb4, 4, 13);
        System.out.println(sb4);//Java+Selenium+SQL+Selenium




        StringBuilder sb5 = new StringBuilder("Ayse");
        System.out.println(sb5);
        sb5.append(" Ozipek", 0, 3);
        System.out.println(sb5);//Ayse Oz


        //To get the character in a specific index

        System.out.println(sb5.charAt(5));//O


        // To delete some character between specific indexes
        // specific indexler arasindaki karakterleri silmek icin

        System.out.println("sb4 before delete: "+ sb4);//Java+Selenium+SQL+Selenium
        sb4.delete(0, 5);
        System.out.println("sb4 after delete: "+ sb4);//Selenium+SQL+Selenium


        //To delete a specific character from a specific index
        sb4.deleteCharAt(10);
        System.out.println(sb4);



    }

}