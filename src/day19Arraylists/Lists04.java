package day19Arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class Lists04 {

    public static void main(String[] args) {

        /*
         * Please create an Integer ArrayList
         * add the numbers : 3, 45, 12, 3, 6, 45, 7, 8
         * print your list
         * remove the repeated elements from your list
         * please print the unique list

         Bir interger ArrayList olusturun
         bu sayilari ekleyin : 3, 45, 12, 3, 6, 45, 7, 8
         tekrarlanmis elementleri list'ten silin
         Sadece tekrarlanmamis element list'ini yazdirin
         */

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(45);
        list1.add(12);
        list1.add(3);
        list1.add(6);
        list1.add(45);
        list1.add(7);
        list1.add(8);

        System.out.println("Before: "+ list1);//[3, 45, 12, 3, 6, 45, 7, 8]


        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i =0; i<list1.size(); i++) {
            if (!list2.contains(list1.get(i))) {
                list2.add(list1.get(i));
            }else {
                continue;
            }


        } System.out.println(list2);//[3, 45, 12, 6, 7, 8]


    }

}
