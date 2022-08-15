package day32collections;


import java.util.TreeSet;

public class TreeSet01 {
	/*
 	1)In TreeSet, all elements are unique and in ascending order
 	2)TreeSet spends too much time to put the elements in ascending order, because of that, TreeSet is very slow.
 	  Developers do not prefer to use TreeSet
 	3)If you try to add repeated elements, TreeSet will overwrite.
 */

    public static void main(String[] args) {

        TreeSet<String> ts1 = new TreeSet<>();

        ts1.add("Apple");
        ts1.add("Mango");
        ts1.add("Orange");
        ts1.add("Palm");
        ts1.add("Apricot");
        ts1.add("Palm");


        System.out.println(ts1.ceiling("Osa"));
        //Returns the least element in this set greater than or equal to the given element,
        //or null if there is no such element.


        System.out.println(ts1.floor("Anna"));//null
        //Returns the greatest element in this set less than or equal to the given element,
        //or null if there is no such element.

        System.out.println(ts1.descendingSet());//[Palm, Orange, Mango, Apricot, Apple]

        System.out.println(ts1.first());//Apple ==> Returns the first element

        //headSet() gives you all elements from the first element to the element(exclusive) you used as argument
        System.out.println(ts1.headSet("Mango"));//[Apple, Apricot]

        System.out.println(ts1.headSet("Mango", true));//[Apple, Apricot, Mango]

        //Returns a view of the portion of this set whose elements are greater than or equal to fromElement.
        System.out.println(ts1.tailSet("Mango"));//[Mango, Orange, Palm]

        System.out.println(ts1.higher("Mango"));//Orange
        System.out.println(ts1.lower("Mango"));//Apricot

        System.out.println(ts1);//[Apple, Apricot, Mango, Orange, Palm]

    }

}
