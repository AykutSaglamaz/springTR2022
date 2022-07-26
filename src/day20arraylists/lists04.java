package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class lists04 {

    public static void main(String[] args) {


        List<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(23);
        list1.add(12);
        list1.add(11);
        list1.add(13);
        list1.add(10);


        List<Integer> list2 = new ArrayList<>();
        list2.add(25);
        list2.add(2);
        list2.add(17);
        list2.add(18);
        list2.add(1);
        list2.add(115);

        List<Integer> list3 = new ArrayList<>();

        //Adding list2 into list1
        //"addAll()" all of the elements in the specified collection to the end of this list

        System.out.println(list1.addAll(list2));
        System.out.println(list1);

        // Adding an empty list into the list1

        System.out.println(list1.addAll(list3));//false
        //return true if this list changed as a result of the call, otherwise false

        List<Integer> list4 = new ArrayList<>();
        list4.add(12);
        list4.add(121);
        list4.add(125);

        //Adding list4 into the index 2

        list1.addAll(2, list4);
        System.out.println(list1);



        //To delete/remove all the elements from the list, use "clear()"

        list1.clear();
        System.out.println(list1);













    }

}
