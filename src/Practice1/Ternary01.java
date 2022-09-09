package Practice1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {
//        int x = 12;

        // baslangic noktasi (sart)   ?  (sart saglaniyorsa)   :  (sart saglanmiyorsa)     ;

//      String sonuc = x%2==0  ?  "bu bir cift sayidir"     :  "bu bir tek sayidir"          ;

//        System.out.println(x%2==0?"bu bir cift sayidir":"bu bir tek sayidir");

        // buyuk sayiyi yazdirin
//        int a =14;
//        int b =20;
//
//        System.out.println( a>b ? a : b);

//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Luften iki tane tamsayi giriniz");
//         int a = scan.nextInt();
//         int b = scan.nextInt();
//
//
//        if(a>b){
//            System.out.println("kucuk sayimiz "+ b);
//        }else{
//            System.out.println("kucuk sayimiz "+ a);
//        }

        // Kullanicidan bir String girmesini isteyin
        // Eger bu String 2 karaktere sahip ise, sonucun "sehir kisaltmasi icin gecerli"
        // Aksi durumda sonucun sehir kisaltmasi icin gecerli olmadigini yazdirin
        // orn IS==> gecerli    IST ==> gecersiz diyoruz


//    Scanner scan = new Scanner(System.in);
//        System.out.println(" Bir String giriniz");
//         String  sehir = scan.next().substring(0,2); // I s t a n b u l
//
//       String sonuc =  sehir.length()==2 ? ( 6>8 ? "kucuk" :"buyuk") : "gecersiz";
//
//        System.out.println(sonuc);
//
    /*
 Kullanicidan bir integer (tamsayi) alin
 eger kullanici 3 basakmali bir sayi girerse, console "bu 3 basamakli bir sayidir"
 aksi console "bu 3 basamakli bir sayi degildir" yazdiralim
    */
//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Bir Integer giriniz");
//        int x = scan.nextInt();
//        x = Math.abs(x);
//
//      String sonuc =  x>99 && x<=999 ? x+ " sayisi 3 basamakli bir sayidir" : x + " sayisi 3 basamakli bir sayi degildir";
//        System.out.println(sonuc);


        // Kullanicidan bir sayi girmesini isteyin
        //eger sayi 10'dan kucuk ve 0'dan buyuk esit ise, bu sayinin bu sayinin kupunu alin
        // aksi durumda sayinin karesini alalim
        // kup = a*a*a      kare= a*a


//        Scanner scan = new Scanner(System.in);
//        System.out.println(" Bir Sayi giriniz");
//
//        int x = scan.nextInt();
//
//       // int sonuc = x < 10 && x >= 0 ? x * x * x : x * x;
//        double  sonuc = (x>=0 && x<10 ? Math.pow(x, 3): Math.pow(x, 2));
//
//        System.out.println(sonuc);

 /*
 	Kullanicidan bir yil alin ve bu yilin artik yil olup olmadigini soyleyin
	eger girilen yil 100 ile bolunuyorsa, mutlaka 400 ile bolunmesi lazim, o yil artik yildir
	eger girilen yil 100 ile bolunmuyorsa, mutlaka 4 ile bolunmesi lazim, o yil artik yildir
   */
        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir Yil giriniz");
        int yil = scan.nextInt();

    String sonuc = yil%100==0 ? (  yil%400==0 ? ("Artik yil") : ("Artik yil degil")    ) : (yil%4==0 ? ("artik yil") :   ("Artik yil degil") );

        System.out.println(sonuc);

    }

}
