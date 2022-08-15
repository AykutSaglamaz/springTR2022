package day33collections;

import java.util.LinkedHashSet;

public class LinkedHashSet01 {
	/*
	 1) LinkedHashSet puts the elements in insertion order
	 2) LinkedHashSet spends time on ordering element, because of that it is slower than HashSet
	 */


    public static void main(String[] args) {

        LinkedHashSet<String> lhs1 = new LinkedHashSet<>();

        lhs1.add("A");
        lhs1.add("YZ");
        lhs1.add("N");
        lhs1.add("P");
        lhs1.add("C");
        lhs1.add("ABC");




        System.out.println(lhs1);

    }

}
