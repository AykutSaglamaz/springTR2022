package day31iteratorscollections;

import java.util.LinkedList;

public class LinkedList01 {

    /*
     LinkedList is very fast in insertion and deletion operation...for other ArrayList is better
     */
    public static void main(String[] args) {

        LinkedList<String> ll1 = new LinkedList<>();
        //	List<String> ll1 = new LinkedList<>();
        //	Collection<String> ll1 = new LinkedList<>();

        ll1.add("Ali");
        ll1.add("Can");
        ll1.add("Mark");
        ll1.add("Tom");
        System.out.println(ll1);//[Ali, Can, Mark, Tom] --> ([Ali]-> Data, [.]-> pointer) -->> Node
//		[Ali, Can, Mark, Tom] -->> first node point by a head, last node point -> "null"

        ll1.add("Angie");
        ll1.add(1, "XXXX");//LinkedList does use index method actually
        ll1.addFirst("AAAA");// adding to "0" index
        ll1.addLast("CCCC");
        System.out.println(ll1.contains("Can"));//true
        System.out.println(ll1.contains("Mm"));//false
        System.out.println(ll1.element());//AAAA --> Returns the first element without removing (copy +past)
        //@throws NoSuchElementException if this list is empty

        System.out.println(ll1.getFirst());//AAAA  @throws NoSuchElementException if this list is empty
        System.out.println(ll1.getLast());//CCCC


        System.out.println(ll1.poll());//AAAA ->> Retrieves and removes the head (first element) of this list( cut +paste.
        // Returns null if this list is empty

        ll1.peek(); //Returns the first element without removing (copy +past).// Returns null if this list is empty
        ll1.removeFirstOccurrence("XXXX");
        ll1.removeLastOccurrence("CCCC");
        ll1.set(2, "!!!!");
        System.out.println(ll1.subList(2, 5)); // Note: first index is inclusive, second is exclusive

        System.out.println(ll1);


        // If you want to store unique element in a collections, you will set collection. unique == set collections

        // if first in first out is important for you, use Queue
        // If you need to store in ascending order, you will use tree keyword.
        // if collection will do insertion and deletion,  use linkedlist

    }

}