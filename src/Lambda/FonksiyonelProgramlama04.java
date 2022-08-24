package Lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class FonksiyonelProgramlama04 {

    public static void main(String[] args) {

        List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        System.out.println(l);
        toplam (l);
        yedidenYuzeSayilarinToplami ();
        yedidenYuzeSayilarinToplami2 ();
        yedidenYuzeSayilarinToplami3 (5, 10);

        rakamlarinCarpimi ();

        faktoriyelBulma (5);

        ikiSayiArasindakiCiftToplamlari(5, 12);

        rakamlariToplami (13, 17);
    }
    //1- Bir List'teki butun elemanlarin toplamini bulan bir method yaziniz
    public static void toplam (List<Integer> l){
        Integer toplam = l.stream().reduce(0, Math::addExact);
        System.out.println(toplam);
    }
//2- 7'den 100'e kadar olan sayilarin toplamlarini bulan bir method yaziniz
    public static void yedidenYuzeSayilarinToplami (){
        //1.yol
      Integer toplam =  IntStream.range(7, 101).reduce(0, Math::addExact);
        System.out.println(toplam);
    }
    //2.yol
    public static void yedidenYuzeSayilarinToplami2 (){
        Integer toplam = IntStream.rangeClosed(7, 100).reduce(0, Math::addExact);
        System.out.println(toplam);
    }
    //3.yol
    public static void yedidenYuzeSayilarinToplami3 (int x, int y) {
        Integer toplam = IntStream.rangeClosed(x, y).reduce(0, Math::addExact);
        System.out.println(toplam);
    }
//3- 2'den 11'e kadar olan sayilarin carpimlarini bulan bir method yaziniz
 public static void rakamlarinCarpimi (){
       Integer carpma=  IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact);
     System.out.println(carpma);
 }
//4- Verilen bir sayinin faktoriyelini hesaplayan bir method yaziniz
    // 5! ==> 5*4*3*2*1 =120

    public static void faktoriyelBulma (int x) {
        if (x < 0) {
            System.out.println("negatif sayilarin faktoryelleri yoktur");
        } else{
            Integer faktoriyel = IntStream.rangeClosed(1, x).reduce(1, Math::multiplyExact);
        System.out.println(faktoriyel);
    }
    }
//5- Verilen iki sayi arasindaki cift sayilarin toplamini hesaplayan bir method yaziniz
    public static void ikiSayiArasindakiCiftToplamlari(int x, int y){
      Integer toplam =  IntStream.rangeClosed(x,y).filter(Utils::ciftSayiAl).sum();
        System.out.println(toplam);
}
//6- Verilen iki sayi arasindaki her bir cift sayinin rakamlari toplamini hesaplayan bir method yaziniz
    public static void rakamlariToplami (int x, int y){
    Integer toplam =IntStream.rangeClosed(x, y).map(Utils::rakamlarToplami).sum();
        System.out.println(toplam);

    }



}
