package Practice1;

import java.util.Arrays;
import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
        /*
        Boyutunu ve elemanlarini kullanicidan alacaginiz bir array olusturun ve
        Bu array'in elemanlarinda kac karakter kullanildigini bulan bir kod yaziniz
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Luften Arrayin boyutunu giriniz");
        int boyut = scan.nextInt();

        String arr [] = new String[boyut];


        for (int i =0; i<arr.length;i++){
            System.out.println("luften " + (i+1)+ " elemani giriniz");
            arr[i]=scan.next();
        }

        int toplam =0;
        for (int i =0; i<arr.length; i++){
            toplam = toplam + arr[i].length();

        }
        System.out.println(toplam);

    }
}
