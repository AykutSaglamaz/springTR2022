package Practice1;

import java.util.Scanner;

public class Alistirma04 {

/*
    Kullanicidan satir ve column boyutlarini alin ve * kullanarak bir diktorgen ciziniz
        orn: satir = 3, kolon =4
            * * * *
            * * * *
            * * * *
    */
    public static void main(String[] args) {

        Scanner dikdortgen = new Scanner(System.in);
        System.out.println(" Luften dikdorgenin satir ve Kolon sayisini giriniz");
        int satir = dikdortgen.nextInt();
//        System.out.println(" Luften dikdorgenin colon sayisini giriniz");
        int kolon = dikdortgen.nextInt();

        for (int i =1; i<=satir; i++ ){
            for (int j= 1; j<=kolon; j++){
                System.out.print("* ");
            }
            System.out.println();

        }



    }
}
