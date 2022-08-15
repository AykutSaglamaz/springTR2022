package practice;

import java.util.Scanner;

public class P03 {
    /*
              1
              22
              333
              4444
              55555
     bu sekli olusturan bir kod yaziniz
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi = scan.nextInt();

        for (int i =1; i<=sayi; i++){

            for (int j =1; j<=i; j++){

                System.out.print(i);
            }
            System.out.println();
        }

    }
}
