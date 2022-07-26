package day19Arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lists05 {

    public static void main(String[] args) {
        /*
         * From an integer list, find the min difference of the elements
         *
         * Bir integer List'te elementler arasi minimum farki bulun
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(23);
        list.add(14);
        list.add(2);
        list.add(28);
        list.add(29);
        System.out.println(list);

        List<Integer> list2= new ArrayList<>();

        for(int i =0; i<list.size(); i++) {
            for(int k=i+1;k<list.size(); k++) {
                list2.add(Math.abs(list.get(i)-list.get(k)));

            }


        }
        System.out.println(list2);
        Collections.sort(list2);
        System.out.println(list2);
        System.out.println("=======");
        System.out.println(list2.get(0));

        System.out.println(list2.get(list2.size()-1));

        int m= list2.get(0)-list2.get(list2.size()-1);
        System.out.println(m);

    }

}
