package Practice1;

import java.util.*;

public class A19 {
    public static void main(String[] args) {
        // Her elementi 2 artiran bir method yaziniz

        List<Integer> list1 = new ArrayList<>();

        list1.add(3);
        list1.add(45);
        list1.add(12);
        list1.add(25);
        list1.add(16);
        System.out.println(list1);// [3, 45, 12, 25, 16]
         herElemaniIkiArtir(list1);

    }

    public static void herElemaniIkiArtir( List<Integer> list1) {
        for (int i =0 ; i<list1.size(); i++){


            list1.set(i, list1.get(i)+2);


        }
        System.out.println(list1);// [5, 47, 14, 27, 18]
    }


}
