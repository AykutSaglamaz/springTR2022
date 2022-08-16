package Lambda;

import java.util.ArrayList;
import java.util.List;

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
        lt.add(131);
        lt.add(14);
        lt.add(9);
        lt.add(10);
        lt.add(4);
        lt.add(12);
        lt.add(15);
        System.out.println(lt);// [12, 9, 131, 14, 9, 10, 4, 12, 15]

        elYazdirStructured(lt);
        System.out.println();
       elYazdiFunctional(lt);
        System.out.println();
        ciftRakamStructured(lt);
        System.out.println();
        ciftRakamfunctional(lt);

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





}
