package Practice1;

import java.util.Scanner;

public class Alistirma03 {
    /*
        Kullanicidan bir harf secmesini isteyin :A, B, C
         Eger kullanici "A" secerse => 'Java kolaydir' diyelim
         Eger kullanici "B" secerse =? 'Java eglencelidir' diyelim
         Eger kullanici "C" secerse => 'Java ogrenmek icin calismaniz lazim' diyelim

         orn: sonuc A : Java kolaydir
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz. \nA \nB \nC");
            char secenek =scan.next().toUpperCase().charAt(0);
        switch (secenek){
            case 'A':
                System.out.println("Java kolaydir");
                break;
            case 'B':
                System.out.println("Java eglencelidir");
                break;
            case 'C':
                System.out.println("Java ogrenmek icin calismaniz lazim");
                break;
            default:
                System.out.println("Gecerli bir karakter giriniz");
                break;

        }


     String sonuc = secenek=='A' ? "Java kolaydir": secenek=='B' ? "Java eglencelidir" :secenek=='C'? "Java ogrenmek icin calismaniz lazim":"Gecerli bir karakter giriniz";

        System.out.println(sonuc);


    scan.close();

    }
}
