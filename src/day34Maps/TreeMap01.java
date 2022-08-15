package day34Maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
	/*
	 	1) TreeMap puts the elements in natural order by using keys
	 	2) TreeMap is not thread-safe and is not synchronized
	 	3) TreeMap does not accept "null" as key
	 	4) TreeMap accepts multiple "null" in values
	 	5) TreeMap is the slowest map
	 */

    public static void main(String[] args) {


        TreeMap<Integer, String> tm1 = new TreeMap<>();

        tm1.put(105, "Ali");
        tm1.put(101, "Veli");
        tm1.put(103, "Kaan");
        tm1.put(102, "Eric");
        tm1.put(104, "Jonhn");
//		tm1.put(null, "XX"); //Throws NullPointerException
        tm1.put(106, null);
        tm1.put(107, null);

        System.out.println(tm1);//{101=Veli, 102=Eric, 103=Kaan, 104=Jonhn, 105=Ali}


// add elements by using HashMap then convert it to TreeMap

        HashMap<Integer, String> hm2 = new HashMap<>();

        hm2.put(13, "AAA");
        hm2.put(13, "CCC");
        hm2.put(12, "KKK");
        hm2.put(11, "BBB");
        System.out.println(hm2);

        TreeMap<Integer, String> tm2 = new TreeMap<>(hm2);
        System.out.println(tm2);

        System.out.println(tm2.ceilingEntry(12));// for existing key, it return itself-> 12=KKK
        System.out.println(tm2.ceilingEntry(15));//null

        System.out.println(tm2.ceilingKey(12));//12
        System.out.println(tm2.ceilingKey(15));//null


    }

}
