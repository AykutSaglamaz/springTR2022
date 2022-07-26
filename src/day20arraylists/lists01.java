package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lists01 {

    public static void main(String[] args) {


        List <Integer> listnum = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();


        listnum.add(17);
        listnum.add(23);
        listnum.add(11);
        listnum.add(17);
        listnum.add(3);
        listnum.add(5);
        listnum.add(8);
        listnum.add(-5);
        listnum.add(-3);


        System.out.println(listnum.isEmpty());// false

        System.out.println(list2.isEmpty());//true

        System.out.println("Removing from specific index : "+ listnum.remove(3));//17

        listnum.remove(listnum.indexOf(5));// indexOf(x)>> find the element x and remove
        System.out.println("Removing specific element: "+ listnum);



        //From an integer list find the minimum difference

        List<Integer> list1 = new ArrayList<>();

        list1.add(27);
        list1.add(15);
        list1.add(312);
        list1.add(28);
        list1.add(14);
        list1.add(162);
        list1.add(61);
        list1.add(39);
        list1.add(121);
        list1.add(16);
        list1.add(18);

        List<Integer> listdiff = new ArrayList<>();

        for (int i = 0; i <list1.size(); i++) {
            for(int j = i+1; j<list1.size() ; j++)  {
                listdiff.add(Math.abs(list1.get(i) - list1.get(j)));
            }
        }
        System.out.println(listdiff);

        Collections.sort(listdiff);
        System.out.println(listdiff);

        System.out.println(listdiff.get(0));




    }

}
