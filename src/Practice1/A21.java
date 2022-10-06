package Practice1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class A21 {
    public static void main(String[] args) {
        	/*
    Kullanicidan Kullanici adi ve sifreyi girmesini isteyin "Lutfen kullanici adi ve sifrenizi giriniz"
  	Eger kullanici dogru bilgileri girer ise, ona "Hesabiniza giris yaptiniz" mesaji
    Kullanici 3 kereye kadar yanlis Kullanici adi ve sifre girer ise ona "Lutfen kullanici adi ve sifrenizi giriniz" mesaji veriniz
    Kullanici 3 ve daha fazla sayida yanlis bilgiler girer ise "Hesabiniz bloke edildi" mesaji veren bir kod yaziniz

     Kullanici adi "admin", Sifre "sfr1234"
    */

        Scanner scan = new Scanner(System.in);

        int denemeSayisi= 0;

        do {

            System.out.println("Lutfen kullanici adinizi giriniz");
            String kullaniciAdi = scan.next();
            System.out.println("Lutfen sifrenizi giriniz");
            String sifre = scan.next();

            if (kullaniciAdi.equals("admin") && sifre.equals("sfr1234")){
                System.out.println("Hesabiniza giris yaptiniz");
                break;
            }
            denemeSayisi++;

            if (denemeSayisi>=3){
                System.out.println("Hesabiniz bloke edildi");
                break;
            }
        }while (true);




    /*
        //Array tek boyutlu hale getirin
		int arr[][] = { {11,2}, {3,24,5}, {6, 7, 9, 10} };
		 int brr[] = {11, 2, 3, 24, 5, 6, 7, 9, 10};
     */




    }


}
