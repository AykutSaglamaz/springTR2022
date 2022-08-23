package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FonksiyonelProgramlama02 {
    /*
    Method Referansi : Class ismi :: Method ismi ( bu methodun parantezleri olmayacak ())
    Orn: ==> String :: Length
             ArrayList :: size
     */

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(7);
        l.add(12);
        l.add(15);

        elYazdirFunctional (l);
        System.out.println();
        CiftSayiYazdir (l);
        System.out.println();
        ciftSayilarinKaresi (l);
        System.out.println();
        farkliTekSayilarinKupuAl (l);
        System.out.println();
        farkiCiftSayilarinKareleriToplami (l);
        System.out.println();
        farkiCiftSayilarinKupleriCarpimi (l);
        System.out.println();
        minSayiBul (l);
        maxSayiBul (l);
        yedidenBuyukEnKucukCiftSayiBul  (l);
        farkliOlanBestenBuyukSayininYarisiniAl (l);



    }

//1-List elemanlarini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public static void elYazdirFunctional (List<Integer> l){
        l.
        stream().
         forEach(Utils::ayniSatirdaBirBoslukBirakYazdir);
    }

//2-List elemanlarindan cift olanlari bir bosluk birakarak ayni satirda yazdiran bir method olusturun
    public static  void CiftSayiYazdir (List<Integer> l){

        l.
          stream().
          filter(Utils::ciftSayiAl).
          forEach(Utils::ayniSatirdaBirBoslukBirakYazdir);

    }
//3-Cift sayilarin karesini bir bosluk birakarak ayni satirda yazdiran bir method olusturun
    public static void ciftSayilarinKaresi (List<Integer> l) {
        l.stream().filter(Utils::ciftSayiAl).map(Utils::sayininKaresiniAl).forEach(Utils::ayniSatirdaBirBoslukBirakYazdir);
    }

//4-Birbirinden farkli olan tek sayilarin kuplerini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public static void farkliTekSayilarinKupuAl (List<Integer> l){
        l.stream().distinct().filter(Utils::tekSayiAl).map(Utils::sayininKupunuAl).forEach(Utils::ayniSatirdaBirBoslukBirakYazdir);
    }
//5- List elemanlarindan birbirinden farkli olan cift sayilarin karelerinin toplamini bulan bir method olusturun
        public static void farkiCiftSayilarinKareleriToplami (List<Integer> l){
       Integer toplam = l.stream().distinct().filter(Utils::ciftSayiAl).map(Utils::sayininKaresiniAl).reduce(0,Math::addExact);
            System.out.println(toplam);

}
// 6- List elemanlarindan birbirinden farkli olan cift sayilarin kuplerinin carpimini bulan bir method olusturun

    public static void farkiCiftSayilarinKupleriCarpimi (List<Integer> l){
       Integer carpma= l.stream().distinct().filter(Utils::ciftSayiAl).map(Utils::sayininKupunuAl).reduce(1,Math::multiplyExact);
        System.out.println(carpma);
    }

// 7-List'in elemanlarindan en kucuk degeri bulan bir method olusturun

    public static void minSayiBul (List<Integer> l){
        Integer minEl = l.stream().reduce(Integer.MAX_VALUE, Math::min);
        System.out.println(minEl);
    }

// 8-List'in elemanlarindan en buyuk degeri bulan bir method olusturun
    public static void maxSayiBul (List<Integer> l){
        Integer maxEl = l.stream().reduce(Integer.MIN_VALUE, Math::max);
        System.out.println(maxEl);
    }

//9- List'den 7'den buyuk ve cift olan en kucuk degeri bulan bir method olusturun
    public static void yedidenBuyukEnKucukCiftSayiBul (List<Integer> l){

     Integer mincift  = l.stream().distinct().filter(Utils::ciftSayiAl).filter(t->t>7).reduce(Integer.MAX_VALUE, Math::min);


        System.out.println(mincift);
    }
 // 10-Elemanlarin yarisini alan birbirinden farkli ve 5'ten buyuk olan bir List icinde buyukten kucuge siralanan bir method olusturun
    public static void farkliOlanBestenBuyukSayininYarisiniAl (List<Integer> l){
      List<Double> sonucList=  l.stream().distinct().filter(t->t>5).map(Utils::sayininYarisiniAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonucList);
    }


}
