package Practice1;

import java.util.Scanner;

public class A32 {
    public static void main(String[] args) {
        /*      Alis adeti ve urunun fiyatini musteriden alin
                Magaza uyelik karti olup olmadigini sorun,
                uyelik karti var ise ve 10 urunden fazla alirsa %20,  uyelik var ve 10 urun yada az alirsa %15
                Magaza uyelik karti yok ve  10 urunden fazla alirsa %15, uyelik yok ve 10 urun yada az alirsa %10
                indirim uygulan bir kod yaziniz
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Urun adedi giriniz");
        int adet = scan.nextInt();
        adet = Math.abs(adet);

        System.out.println("Urun fiyatini giriniz");
        double fiyat = scan.nextDouble();

        System.out.println("Uyelik kartiniz var mi kart =1: var 2:yok fiyatini giriniz");
        int kart = scan.nextInt();


        if (kart==1 && adet >10 ){
            System.out.println(" %20 indirimli toplam fiyat :" + adet*fiyat*0.80);
        }else if(kart == 1 && adet<11){
            System.out.println(" %15 indirimli toplam fiyat :" + adet*fiyat*0.85);
        }else if(kart == 2 && adet>10){
            System.out.println(" %15 indirimli toplam fiyat :" + adet*fiyat*0.85);
        }else if(kart == 2 && adet<11) {
            System.out.println(" %10 indirimli toplam fiyat :" + adet * fiyat * 0.90);
        } else{
            System.out.println("Lutfen dogru bilgiler giriniz");
        }




    }
}
