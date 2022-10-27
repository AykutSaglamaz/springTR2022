package Practice1;

import java.util.Scanner;

public class A33 {
    /*
		 Kullanicidan isim, soyisim ve kredi kartini girmesini isteyin ardindan
		 Isim ve Soyismin ilk karakteri ile kredi kartinin son 4 rakami haric
		 diger her bir karakter yerine "*" yazan bir kod yaziniz
		 orn: Tom Hanks ==> T** H**** Kredi Kart Numarasi ==> **** **** 6785
		 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim, soyisim ve kredi kart no'yu giriniz");

        //1.yol
//       String isim = scan.next();
//       String soyIsim = scan.next(); //    Ali  Gunduz
//       String kartNo = scan.next();
//     String gizlenmisIsim =  isim.charAt(0)+isim.substring(1).replaceAll("[a-z]","*");
//     String gizlenmisSoyIsim = soyIsim.substring(0, 1)+ soyIsim.substring(1).replaceAll("[a-z]", "*");
//     String gizlenmisKartNo = kartNo.substring(0,9).replaceAll("[0-9]", "*") + " " + kartNo.substring(9);
//
//        System.out.println(gizlenmisIsim + "\n"+ gizlenmisSoyIsim + "\n"+ gizlenmisKartNo);

// 2.yol
    String str =scan.nextLine();
    String ad = str.split(" ")[0];
    String soyAd = str.split(" ")[1];
    String kart = str.split(" ")[2];
        String gizliAd =  ad.substring(0,1).toUpperCase()+ad.substring(1).replaceAll("[a-z]","*");
        String gizliSoyad = soyAd.substring(0, 1).toUpperCase()+ soyAd.substring(1).replaceAll("[a-z]", "*");
        String gizliKart = "";

        for (int i =0; i<kart.length(); i++){

            if (i<kart.length()-4){

                gizliKart = gizliKart + "*";

            }else{
                gizliKart = gizliKart+ kart.charAt(i);
            }
        }
        System.out.println( gizliAd + " "+ gizliSoyad+ " "+ gizliKart);










    }
}
