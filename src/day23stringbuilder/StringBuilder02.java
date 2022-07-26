
package day23stringbuilder;

public class StringBuilder02 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("I love Java");
        StringBuilder sb2 = new StringBuilder("I love Java");


        //How to compare to StringBuilder
		/*
		 In Stringbuilder equals() method works like "=="
		 it checks the value and references 
		 */

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//true


        System.out.println(sb1.indexOf("e"));//5

        System.out.println(sb1.indexOf("a"));//8
        System.out.println(sb1.indexOf("s"));//-1 for non-exist
        System.out.println(sb1.indexOf("a", 5));// Start looking for "a" after character 5.

        //insert (offset, String)

        System.out.println(sb1.insert(7, "the "));//I love the Java

        //insert (to add part of a String into the specific index

        sb1.insert(1,  "and , Asyalar", 4 ,10);
        System.out.println(sb1); //I , Asya love the Java

        // reverse

        sb1.reverse();
        System.out.println(sb1); //avaJ eht evol aysA , I
        sb1.reverse();

        //replace

        sb1.replace(2, 8, "*");
        System.out.println(sb1);//I * love the Java

        sb1.replace(8, 13, "");

        System.out.println(sb1);//I * loveJava

        //set char

        sb1.setCharAt(7, '*' );

        System.out.println(sb1);//I,*love*ava

        System.out.println(sb1.capacity());//27


        //trim

        sb1.trimToSize();
        System.out.println(sb1.capacity());//12

        //trim.ToSize();

        sb1.trimToSize();// Attempts to reduce storage used for the character sequence

    }

}