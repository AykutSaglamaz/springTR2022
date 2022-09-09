package Practice1;

import java.util.Scanner;

public class Soru01 {
    /*
    		Kullanicidan bir sifre girmesini isteyin
			eger sifrenin ilk harfi buyuk harf ise, bunun 'A' harfi olup olmadigini kontrol edin
			Eger ilk harf 'A' ile basliyorsa "Gecerli Sifre"
			Eger ilk harf 'A' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
			orn, Ali ==> "Gecerli Sifre" -  ali ==> "Gecersiz Sifre" - Can ==> "Gecersiz Sifre"

			eger sifrenin ilk harfi kucuk harf ise, bunun 'z' harfi olup olmadigini kontrol edin
			Eger ilk harf 'z' ile basliyorsa "Gecerli Sifre"
			Eger ilk harf 'z' ile baslamiyorsa "Gecersiz Sifre" ciktisi alin
			orn, zeynep ==> "Gecerli Sifre" -  Zeynep ==> "Gecersiz Sifre" - mehmet ==> "Gecersiz Sifre"
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); /// Ahmet1234
        System.out.println("sifrenizi giriniz....");
        char karakter = scan.next().charAt(0);

        if(karakter>='A' && karakter<='Z'){
            if(karakter=='A'){
                System.out.println("Gecerli Sifre");
            }else{
                System.out.println("Gecersiz Sifre");
            }

        }else if  (karakter>='a' && karakter<='z'){
            if(karakter=='z'){
                System.out.println("Gecerli Sifre");
            }else{
               System.out.println("Gecersiz Sifre");
            }

        }else{
            System.out.println(" Lutfen dogru sifre giriniz");
        }





    }
}
