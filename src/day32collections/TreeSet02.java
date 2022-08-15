package day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {


    public static void main(String[] args) {

        //We need to store unique elements in natural order

        //1.Way:Using TreeSet works for that task but TreeSet is very slow because of that we do not prefer to use first way


        //2.Way:Use HashSet to add elements, then convert HashSet to TreeSet to put the elements in natural order
        HashSet<String> hs1 = new HashSet<>();

        hs1.add("Apple");
        hs1.add("Mango");
        hs1.add("Orange");
        hs1.add("Palm");
        hs1.add("Apricot");

        System.out.println(hs1);//[Apple, Palm, Mango, Apricot, Orange]

        TreeSet<String> ts1 = new TreeSet<>(hs1);

        System.out.println(ts1);// in ascending order : [Apple, Apricot, Mango, Orange, Palm]
    }

}
