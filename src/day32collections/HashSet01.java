package day32collections;

import java.util.HashSet;

public class HashSet01 {
    //Hash is a technique to create unique code
	/*
 	1)In HashSet, elements are sorted randomly. So HashSet is super fast.
 	2)In HashSet, elements are unique, if you try to add repeated elements, it does not give CTE or Run Time Error
 	  and Java overwrites
 	3) HashSet accepts a single null as elements

 	Note: If you need a collection for the given features use HashSet;
 	      a)Unique Elements
 	      b)Order is not important
 	      c)Using null is not problem
 	      d)Speed is important
 */

    public static void main(String[] args) {

        HashSet<String> hs1 = new HashSet<>();
        // Set<String> hs1 = new HashSet<>();

        hs1.add("Apple");
        hs1.add("Mango");
        hs1.add("Orange");
        hs1.add("Palm");
        hs1.add("Apricot");
        hs1.add("Palm");
        hs1.add(null);
        hs1.add(null);

        System.out.println(hs1);//[Apple, Palm, Mango, Apricot, Orange]

    }

}