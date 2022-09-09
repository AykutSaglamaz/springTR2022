package Practice1;

import java.util.Arrays;
import java.util.Scanner;

public class Alistirma02 {
// Kullanicidan bir karakter girmesini isteyin ve bu karakterin ASCII degerini bulunuz

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println(" Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);
         int in = karakter;

        System.out.println(karakter+ " ASCII degeri: "+ in);





    }

}


