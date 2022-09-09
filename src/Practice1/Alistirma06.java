package Practice1;

/*
Kullanicidan ucgenin uzunlugunu girmesini isteyin ve eskenar bir ucgen olusturun
    onr: kenar uzunlugu : 3
            *
            *  *
            *  *  *
 */

import java.util.Scanner;

public class Alistirma06 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Ucgenin bir kenarini giriniz");

        int kenar = scan.nextInt();

        for (int i=1; i<=kenar; i++){


            for (int j =1;j<=i; j++ ){



                System.out.print("* ");
            }

            System.out.println();
        }







    }
}
