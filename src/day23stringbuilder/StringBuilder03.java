package day23stringbuilder;

public class StringBuilder03 {

    public static void main(String[] args) {


        StringBuilder sb1 = new StringBuilder("I love Java");
        StringBuilder sb2 = new StringBuilder("I love Java");

        //How to handle this
        // How to convert them into the String

        System.out.println((sb1.toString()).equals(sb2.toString()));//true

        // CompareTo()

        System.out.println(sb1.compareTo(sb2));
        // 0 >>> it will return '0' if StringBuilder have same chars
        // It will return -1 if them are not same

        // 1ST CONDITION
        // when you provide a string at initiation it is 16+length
        StringBuilder sb4 = new StringBuilder("Learn");
        System.out.println(sb4.capacity());  //  capacity 21


        // 2ND CONDITION
        // when you create StringBuilder without any value => capacity 16
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Learn");

        // after you append less than 16 characters, capacity is still 16
        System.out.println(sb5.capacity()); // capacity 16


    }

}
