package Practice1;

import java.util.Scanner;

public class A31 {
    public static void main(String[] args) {
        /*
        Kullanicidan bir 10'dan kucuk bir sayi alin ve carpim tablosu olusturun
        orn: sayi 4
                1   2    3    4
                2   4    6    8
                3   6    9    12
                4   8    12   16
         */

        Scanner carpim = new Scanner(System.in);
        System.out.println("Lutfen 10'dan kucuk bir sayi giriniz");
        int sayi = carpim.nextInt();


        if (sayi<10 && sayi>=0) {
            for (int i = 0; i <= sayi; i++) {

                for (int j = 0; j <= sayi; j++)

                    System.out.print((i + j) + "  ");

                System.out.println();

            }

        }else {
            System.out.println("Lutfen 0 ile 10 arasinda bir sayi giriniz");
        }
    }
}
