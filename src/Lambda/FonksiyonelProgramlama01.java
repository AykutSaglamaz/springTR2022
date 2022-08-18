package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FonksiyonelProgramlama01 {
    /*
    1) Lambda fonksiyonel bir programlamadir.
    2) Fonksiyonel Programlama, Java 8'den once yoktu. Java 8 ve sonraki versiyonlarda lambda kullanilabilir
        oncekilere structured programming (yapilandirilmis programlama) kullaniliyordu, Java 8'de hem structured programming
        hem de functional programming ( Fonksiyonel Programlama) kullanilabilir
    3) Structured programming (yapilandirilmis programlama) bize 'nasil yapilmasi gerektigi" fakat functional programming ( Fonksiyonel Programlama)
        bize "ne yapmamiz gerektigini" soyler
    4) functional programming ( Fonksiyonel Programlama) sadece Collections ve Arrays'le caliriz

     */

    public static void main(String[] args) {

        List<Integer> lt = new ArrayList<Integer>();
        lt.add(12);
        lt.add(9);
        lt.add(11);
        lt.add(6);
        lt.add(9);
        lt.add(145);
        lt.add(4);
        lt.add(12);
        lt.add(10);
        System.out.println(lt);// [12, 9, 131, 14, 9, 10, 4, 12, 15]

        elYazdirStructured(lt);
        System.out.println();
       elYazdiFunctional(lt);
        System.out.println();
        ciftRakamStructured(lt);
        System.out.println();
        ciftRakamfunctional(lt);
        System.out.println();
        sayiKareFunctional(lt);
        System.out.println();
        kupunuAlFarkliTekSayiYazdir (lt);
        System.out.println();
        farkliCiftSayiToplami (lt);
        System.out.println();
        farkliCiftSayiKupleriCarpimi (lt);
        System.out.println();
        enBuyukDeger(lt);
        enBuyukDeger2(lt);
        System.out.println();
        enKucukDeger (lt);
        System.out.println();
        enKucukDeger2 (lt);
        yedidenBuyukCiftSayi (lt);

        yedidenBuyukCiftSayi2 (lt);

        farkliOlanBestenBuyukRakaminyarisi(lt);

    }

    //1-1) List elemanlarini bir bosluk birakarak ayni satirda yazdiran bir method olusturun (Structured programming).
public static void elYazdirStructured ( List<Integer> lt){
    for (Integer w :lt) {
        System.out.print(w + " "); // 12 9 131 14 9 10 4 12 15
    }
}

    //1-2) List elemanlarini bir bosluk birakarak ayni satirda yazdiran bir method olusturun (functional programming).

public static void elYazdiFunctional (List<Integer> lt){
            lt.stream().forEach( t-> System.out.print(t + " "));
}

//2-1 List elemanlarindan cift olanlari bir bosluk birakarak ayni satirda yazdiran bir method olusturun (Structured programming).

    public static void ciftRakamStructured(List<Integer> lt){
        for (Integer w: lt) {
            if (w%2==0){
                System.out.print(w + " ");//12 14 10 4 12
            }
        }
    }
//2-2 List elemanlarindan cift olanlari bir bosluk birakarak ayni satirda yazdiran bir method olusturun (functional programming).

public static void ciftRakamfunctional(List<Integer> lt){

        lt.stream().filter(t-> t%2==0).forEach(t-> System.out.print(t + " "));

}

//3- Cift sayilarin karesini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public static void sayiKareFunctional (List<Integer> lt){

        lt.
                stream().
                filter(t->t%2==0).
                map(t->t*t).//map () elemanlari gunceller
                forEach(t-> System.out.print(t + " "));
    }

 //4- Birbirinden farkli olan tek sayilarin kuplerini bir bosluk birakarak ayni satirda yazdiran bir method olusturun

    public static void kupunuAlFarkliTekSayiYazdir (List<Integer> lt){
      //  lt.stream().filter(t->t%2!=0).distinct().map(t->t*t*t).forEach(t-> System.out.print(t + " "));
        lt.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t + " "));
    }

//5-List elemanlarindan birbirinden farkli olan cift sayilarin karelerinin toplamini bulan bir method olusturun

    public static void farkliCiftSayiToplami (List<Integer> lt){
       Integer toplam = lt.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0, (t, u)->t+u);
        System.out.println(toplam);
    }

//6- List elemanlarindan birbirinden farkli olan cift sayilarin kuplerinin carpimini bulan bir method olusturun

    public static void farkliCiftSayiKupleriCarpimi (List<Integer> lt){
        Integer carpma = lt.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1, (t,u)->t*u);
        System.out.println(carpma);
    }
//7- List'in elemanlarindan en buyuk degerini bulan bir method olusturun

    //1.yol
    public static void enBuyukDeger(List<Integer> lt){
        Integer enBuyukSayi = lt.stream().reduce(Integer.MIN_VALUE, (t, u)-> t>u ? t:u);
        System.out.println(enBuyukSayi);
    }
//2.yol
    public static void enBuyukDeger2(List<Integer> lt){
        Integer enBuyukSayi2 = lt.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t,u)->u);
        System.out.println(enBuyukSayi2);

    }
//8- List'in elemanlarindan en kucuk degeri bulan bir method olusturun
    //1.yol
    public static void enKucukDeger (List<Integer> lt){
       Integer enKucukSayi =  lt.stream().reduce(Integer.MAX_VALUE, (t,u)-> t<u ? t : u);
        System.out.println(enKucukSayi);
    }
    //2.yol
    public static void enKucukDeger2 (List<Integer> lt){
        Integer enKucukSayi2 = lt.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)->u);
        System.out.println(enKucukSayi2);
    }
 //9-List'ten 7'den buyuk en kucuk cift sayi degerini bulan bir method yaziniz
//1.yol
    public static void yedidenBuyukCiftSayi (List<Integer> lt){
     System.out.println(lt.stream().distinct().filter(t->(t%2==0 && t>7)).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t, u)->u));
    }
    //2.yol
    public static void yedidenBuyukCiftSayi2 (List<Integer> lt){
     Integer  yedidenBuyukCiftRakam =  lt.stream().distinct().filter(t->(t%2==0 && t>7)).sorted().findFirst().get();
        System.out.println(yedidenBuyukCiftRakam);
    }

 //10- Elemanlarin yarisini alan birbirinden farkli ve 5'ten buyuk olan bir List icinde buyukten kucuge siralanan bir method olusturun

    public static void farkliOlanBestenBuyukRakaminyarisi(List<Integer> lt){
       List<Double> sonuc = lt.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(sonuc);//[72, 6, 5, 5, 4, 3] -> [72.5, 6.0, 5.5, 5.0, 4.5, 3.0]
}



}
