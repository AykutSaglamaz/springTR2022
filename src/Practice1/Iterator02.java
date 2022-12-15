package Practice1;

import java.util.*;

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
        // hasPrevious() ve previous() kullanarak ben listin en sonuna gidebilirim, elemanalari tersten yazdirabilirim
        while (itr.hasPrevious()){
            String elaman = itr.previous();
            itr.set(elaman+"? ");
        }
        Collections.reverse(list2);
        System.out.println(list2);


        List<String> list03 = new ArrayList<>();
        list03.add("A");
        list03.add("B");
        list03.add("C");

        // ListIterator kullanarak bir elemani listeden kaldirmak istiyorum

        ListIterator<String> i01 = list03.listIterator();
        System.out.println("Eleman silinmeden once " + list03); // [A, B, C]

        i01.hasNext();
        i01.next();
        i01.remove();

        System.out.println("Eleman silindiktan sonra "+ list03);

//   ListIterator kullanarak eleman ekleme

        List<String> list04 = new ArrayList<>();
        list04.add("X");
        list04.add("Y");
        list04.add("Z");

        ListIterator<String> i2 = list04.listIterator();// [      X,      Y,      Z]

        // eger loop kullanirsaniz, eklediginiz eleman en sonra eklenir
        //Eger loop kullanmazsaniz elemani basa ekler
        while (i2.hasNext()){
        i2.next();
    }
        i2.add("T");
        i2.add("V");
        System.out.println(list04); //[X, Y, Z]

        //ListIterator ile Iterator farki

        List<String> list05 = new ArrayList<>();
        list05.add("XX");
        list05.add("YY");
        list05.add("ZZ");
/*
    Iterator'da hasPrevious() ile previous() yoktur, tek-boyutludur
    Iterator'da , add() yoktur bu nedenle yeni elaman eklenemez
    Iterator'da set() yoktur bu nedenle elemanlar guncellenmez
    Her ikisinde remove() kullanilabilir
    Iterator, collectionlardan (Map, Set ve List) calisabilir, ListIterator'da sadece List'ler calisabilir

 */
        Iterator <String> it2 = list05.iterator(); //[   XX,    YY,     ZZ]












    }
}
