package Practice1;

import java.util.ArrayList;
import java.util.Collections;

public class A18 {
    public static void main(String[] args) {

        //List'eki elementler arasi pozitif minimum farki bulunuz

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(45);
        list1.add(12);
        list1.add(25);
        list1.add(16);
        list1.add(48);
        list1.add(7);
        list1.add(128);
        System.out.println(list1); //[3, 45, 12, 25, 16, 48, 7, 128]

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int i =0; i<list1.size(); i++){

            for (int k =i+1; k< list1.size(); k++){

               list2.add(Math.abs(list1.get(i)-list1.get(k)));

            }

        }
        System.out.println(list2); //[42, 9, 22, 13, 45, 4, 125, 33, 20, 29, 3, 38, 83, 13, 4, 36, 5, 116, 9, 23, 18, 103, 32, 9, 112, 41, 80, 121]
        Collections.sort(list2);
        System.out.println(list2);//[3, 4, 4, 5, 9, 9, 9, 13, 13, 18, 20, 22, 23, 29, 32, 33, 36, 38, 41, 42, 45, 80, 83, 103, 112, 116, 121, 125]

        System.out.println(list2.get(0));//3
        System.out.println(list2.size()); //28



    }
}
