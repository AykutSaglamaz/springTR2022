package day34Maps;

import java.util.Hashtable;

public class HashTable01 {

	/*
	 	1) Hashtable is thread-safe and synchronized
	 	2) Hashtable does not put the elements in any order
	 	3) Hashtable does not allow to use "null" in keys and in values
	 	4) Hashtable works with being thread-safe and synchronization, and checking to be null
	 		because of that is slower than HashMap.
	 */

    public static void main(String[] args) {

        Hashtable<Integer, String> ht1 = new Hashtable<>();
        ht1.put(100, "A");
        ht1.put(101, "B");
        ht1.put(102, "C");
//		ht1.put(null, "CC");// throws NullPointerException
//		ht1.put(103, null);// throws NullPointerException


        System.out.println(ht1);

    }

}
