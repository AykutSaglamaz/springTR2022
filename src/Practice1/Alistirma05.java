package Practice1;

import java.util.Scanner;

public class Alistirma05 {
    /*
    Kullanicidan bir kelime girmesini isteyin, Eger kkelimenin karakter sayisi cift  ve 4 fazla ise ise,
    kelimenin ortasindaki 2  karakterleri yazdirin
    orn : Istanbul => an
     */

    public static void main(String[] args) {
        Scanner kelime = new Scanner(System.in);
        System.out.println("Lutfen bir String giriniz"); /// izmir
        String str = kelime.nextLine();

        if ( str.length()>=3 && str.length() % 2==1 ){

            String ortaHarfler = str.substring(str.length()/2-1,str.length()/2+1 );

            System.out.println(ortaHarfler);

        }else{
            System.out.println("Lutfen karakter sayisi cift ve 4'den fazla bir kelime giriniz");
        }




    }
}
