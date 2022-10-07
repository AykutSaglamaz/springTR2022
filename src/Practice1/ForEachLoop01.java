package Practice1;
import java.util.*;

public class ForEachLoop01 {
    public static void main(String[] args) {

        List<Character> list1 = new ArrayList<>();

        list1.add('a');
        list1.add('b');
        list1.add('c');
        list1.add('d');
        list1.add('e');
        list1.add('g');
        list1.add('t');

        System.out.println(list1);//[a, b, c, d, e, g, t]

        //1.yol for-loop
        for (int i =0; i<list1.size(); i++){
            System.out.print(list1.get(i) + "" + list1.get(i) +" ");

        }
        System.out.println();
        //2.for-Each loop

        for(Character w:list1){
            System.out.print(w + "!!! ");

        }
        System.out.println();
       // listedi sadece unsuz olan karakterleri yazdirin

        for (Character w:list1){
            if (w=='a' || w=='e' || w=='i'|| w=='o'||w=='u'){
                continue;
            }
            System.out.print(w+ "? ");

        }
        System.out.println();
        // listeki tum karakterlerin ASCII degerlerini yazdiralim a:97, b:98

        for (Character asciideger:list1){
            System.out.print(asciideger+":"+ (int)asciideger+ " ");

        }
        System.out.println();
        // listeki tum elemanlarin ASCII degerlerini toplayan bir kod yazalim

        int toplam =0;
        for (Character asciideger:list1){
            toplam += asciideger;
        }
        System.out.println(toplam);

        // for-Each loop Array'lerde kullanilabilir
         String s [] = {"Ahmet", "Mehmet", "Olcay", "Fatma"};

         for (String w:s){
             if (!w.endsWith("cay")){
                 System.out.println(w+ " ");
             }

         }

    }
}
