package Practice1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {
    public static void main(String[] args) {
        List<String > list01 = new ArrayList<>();

        list01.add("Tom");
        list01.add("Ali");
        list01.add("Canan");

        System.out.println(list01); //[Tom, Ali, Canan]

        for (String w:list01){
            w = w+ "*";
        }

        System.out.println(list01); // [Tom , Ali , Canan ]
        // loop (dongu kullanrak , collection'larin elemanalrini GUNCELLEYEMEYIZ.

        ListIterator<String> listItr = list01.listIterator(); //[    Tom ,     Ali ,       Canan ]

        while (listItr.hasNext()){
            String element = listItr.next();
//            System.out.print(element);
            listItr.set(element+ "* ");

        }
        System.out.println(list01);



        List<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Samsung");
        list2.add("Huawei");
        System.out.println(list2);

        // Elemanlari guncelle ve tersten yazdir
        ListIterator<String> itr = list2.listIterator(); //[   Apple,   Samsung,   Huawei]
        // pointeri sonra tasimak icin once "hasNext()" sonra "Next()"

        while (itr.hasNext()){
            itr.next();
        }
        while (itr.hasPrevious()){
            String elaman = itr.previous();
            itr.set(elaman+"? ");
        }
        Collections.reverse(list2);
        System.out.println(list2);






    }
}
