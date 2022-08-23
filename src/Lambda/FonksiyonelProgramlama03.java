package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class FonksiyonelProgramlama03 {

    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("Ali");
        l.add("Ali");
        l.add("Mert");
        l.add("Aleyna");
        l.add("Christopher");
        l.add("Jackson");
        l.add("Mariano");
        l.add("Alberto");
        l.add("Tucker");
        l.add("Bunyamin");

        buyukHarfeCevir(l);
        System.out.println();
        elemanalariUzunlugaGoreSirala (l);
        System.out.println();
        elemaninSonKarakterineGoreSirala (l);
        System.out.println();
        onceUzunlukSonraIlkKaraktereGoreSirala(l);
        System.out.println();
//        uzunlukBestenBuyukseSil (l);

        belliBirHarfIleBarlarveBiter (l);


    }

//1-Butun String elemanlari buyuk harfe ceviren bir method olusturun

    public static void buyukHarfeCevir(List<String> l){
        l.stream().map(String::toUpperCase).forEach(Utils::ayniSatirdaBirBoslukBirakYazdir);

        //2.yol
//        l.replaceAll(String::toUpperCase);
//        System.out.print(l);
    }
// 2- String'leri uzunluklarina gore siraladiktan sonra yazdiran bir method olustur
    public static void elemanalariUzunlugaGoreSirala (List<String> l){
        l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);

    }
// 3-Farkli String elemanlarini en son karaktere gore siralayan bir method olusturun
    public static void elemaninSonKarakterineGoreSirala (List<String> l){
        l.stream().
                distinct().
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                forEach(System.out::println);

    }
//4-String elemanlarini once uzunluklarina daha sonra ilk karaktere gore siralayan bir method olusturun

    public static void onceUzunlukSonraIlkKaraktereGoreSirala(List<String> l){
        l.stream().
                sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).
                forEach(System.out::println);
    }

//5- Elemanlardan uzunlugu 5 karakterden fazla olani silen bir method olusturun

//    public static void uzunlukBestenBuyukseSil (List<String> l){
//        l.removeIf(t->t.length()>5);
//        System.out.println(l);
//    }

 //6- Elemanlarindan 'B', 'b' ile baslayan  ve 'N', 'n' biten elemanlari silen bir method olusturun
    public static void belliBirHarfIleBarlarveBiter (List<String> l){
        l.removeIf(t->t.charAt(0) == 'B' || t.charAt(0) == 'b' ||   t.charAt(t.length()-1) == 'N'|| t.charAt(t.length()-1) == 'n' );
        System.out.println(l);

    }




}
