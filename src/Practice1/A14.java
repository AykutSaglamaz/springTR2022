package Practice1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {

     //Orn 8: Kullanicidan bir cumle alan ve bu cumlede kac tane kelime kullanildigini yazdiran bir kod yaziniz.

        Scanner cumle = new Scanner(System.in);
        System.out.println("Luften bir cumle giriniz");

        String metin = cumle.nextLine(); //Daha fazla Java; ogrenmek? icin' kursa gitmem gerekli mi

            String ar[]=  metin.replaceAll("[\\p{Punct}]", "").split(" ");

        System.out.println(Arrays.toString(ar)); // [Daha, fazla, Java, ogrenmek, icin, kursa, gitmem, gerekli, mi]
        System.out.println("Bu cumlede kullanilan kelime sayisi " + ar.length);

    //Orn 9: Cumledeki en uzun kelimeyi bulan bir kod yaziniz
        String s = "Daha fazla Java ogrenmek, icin kursa? gitmem gerekli mi";

        String kelime [] = s.replaceAll("[\\p{Punct}]", "").split(" ");
//        System.out.println(Arrays.toString(kelime)); //[Daha, fazla, Java, ogrenmek, icin, kursa, gitmem, gerekli, mi]
//        Arrays.sort(kelime);
//        System.out.println(Arrays.toString(kelime));// [Daha, Java, fazla, gerekli, gitmem, icin, kursa, mi, ogrenmek]

        Arrays.sort(kelime, Comparator.comparingInt(String::length));// method referansi denir
        System.out.println(Arrays.toString(kelime)); //[mi, Daha, Java, icin, fazla, kursa, gitmem, gerekli, ogrenmek]
        System.out.println(kelime[kelime.length-1]);// ogrenmek








    }
}
