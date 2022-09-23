package Practice1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class A15 {

    /*
    ArrayList'lerin boyutlari esnektir, degistirilebilir
    ArrayList'ler sadece non-primitiveleri (Wrappper class veya String) depolayabilir
     */

    public static void main(String[] args) {
        // Bir list =ArrayList nasil olusturulur

        //1. yol
        ArrayList <Integer> list1 = new ArrayList<Integer>();
        //2. yol
        ArrayList <Integer> list2 = new ArrayList<>();
        //3. yol
        List<String> list3 = new ArrayList<String>();
        //4. yol
        List<String> list4 = new ArrayList<>();
        list3.add("Zeynep");
        list3.add("Fatma");

        list4.add("Ali");
        list4.add("Veli");
        list4.add("Ayse");
        list4.add("Yilmaz");

        System.out.println(list4); //[Ali, Veli, Ayse, Yilmaz]

        list4.add(1, "Ahmet");//[Ali, Ahmet, Veli, Ayse, Yilmaz]
        System.out.println(list4);
        list4.addAll(1, list3);

        System.out.println(list4); //[Ali, Zeynep, Fatma, Ahmet, Veli, Ayse, Yilmaz]

        Collections.sort(list4);//[Ahmet, Ali, Ayse, Fatma, Veli, Yilmaz, Zeynep]
        System.out.println(list4);

        Collections.sort(list4, Collections.reverseOrder()); //[Zeynep, Yilmaz, Veli, Fatma, Ayse, Ali, Ahmet]

        System.out.println(list4);

// Spesifik bir elemani yazdirmak
        System.out.println(list4.get(1));//Yilmaz

        System.out.println(list4.size());//7

/*	 List adinda bir List olusturun, ve 17, 23,11,17,3,5,8,-5, -15 degerlerini List e ekleyin
		 Bunu yaptiktan sonra List icindeki en buyuk ve en kucuk elementi bulun

		 */

        List<Integer> list = new ArrayList<>();
        list.add(17);
        list.add(23);
        list.add(111);
        list.add(17);
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(-35);
        list.add(-15);

        System.out.println(list); //[17, 23, 111, 17, 3, 5, 8, -35, -15]
        Collections.sort(list);
        System.out.println(list); //[-35, -15, 3, 5, 8, 17, 17, 23, 111]

        System.out.println("en kucuk deger "+ list.get(0)); // -35
        System.out.println(" en buyuk deger "+ list.get(list.size()-1)); // 111

    }
}
