package Practice1;

import java.util.Scanner;

public class A26 {
    //Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdiran kod yaziniz

    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.println(" Bize bir sayi veriniz");
        int rakam = sayi.nextInt();

        int rakamlariToplami = 0;

        do {
            rakamlariToplami += rakam%10;
            rakam = rakam/10;

        }while(rakam>0);



//        for (int i =0; i<rakam; i++){
//            rakamlariToplami += rakam%10;
//            rakam = rakam/10;
//            i--;
//
//        }

        System.out.println(rakamlariToplami);


   sayi.close();
    }
}
