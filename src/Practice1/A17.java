package Practice1;

import java.util.ArrayList;
import java.util.List;

public class A17 {
    public static void main(String[] args) {
        /*
         * Bir Integer ArrayList olusturun, bu sayilari ekleyin: 3, 45, 12, 3, 6, 45, 7, 8
         * Bu List'e tekrarlanmis elementleri List'en silen, sadece tekrarlanmamis elementlere sahip List'i yazdiran bir kod yaziniz
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
        System.out.println(list1); //[3, 45, 12, 3, 6, 45, 7, 8]

        List<Integer> list2 = new ArrayList<>();

        for (int i =0; i< list1.size(); i++){

            if (!list2.contains(list1.get(i))){

                list2.add(list1.get(i));

            }else{
                continue;
            }

        }
        System.out.println(list2);//3, 45, 12, 6, 7, 8]





    }
}
