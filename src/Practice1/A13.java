package Practice1;

import java.util.Arrays;
import java.util.Scanner;

public class A13 {

    public static void main(String[] args) {

        String t [] = new String[5];
        t[0]="Ali";
        t[1]="Veli";
        t[2]="Ayse";
        t[3]="Zeynep";
        t[4]="Fatma";


        System.out.println(Arrays.toString(t)); //[null, null, null, null, null]

//        char tt [] = new char[5];
//            tt[0]='A';
//            tt[2]='B';
//            tt[3]='C';
//            tt[4]='D';
//        System.out.println(Arrays.toString(tt)); //[A,  , B, C, D]
         System.out.println( t[0]);
        System.out.println( t[1]);
        System.out.println( t[2]);
        System.out.println("========");

    for(int i =0; i<t.length; i++){
        System.out.println(t[i]);
    }


        // Orn 3: Uzunlugu 6 olan bir double Array olusturun
        //Elemanlari Array in icerisine ekleyen bir program kodlayin
        // Console bu elemanlarin toplamini yaziniz

        double d[]= new double[6];
        System.out.println(Arrays.toString(d));//[0.0, 0.0, 0.0, 0.0, 0.0, 0.0]
        d[0]=2.3;
        d[1]=2.4;
        d[2]=2.9;
        d[3]=2.6;
        d[4]=2.4;
        d[5]=2.8;
        System.out.println(Arrays.toString(d));//[2.3, 2.4, 2.9, 2.6, 2.4, 2.8]

        double toplam = 0.0;

//            for (int i=0; i<d.length; i++){
//                toplam = toplam+ d[i];
            for(double eleman:d){
                toplam = toplam + eleman;
            }
        System.out.println(toplam);//15.399999999999999


      // Orn 4: Bir String Array olusturun ve "Tom" dan onceki elemanlari yazdirin
        String ogrenciler[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w :ogrenciler ){
            if(w.equals("Tom")){
                break;
            }
            System.out.println(w);
        }
        System.out.println("---------");

        // Orn 5: Bir String Array olusturun ve "Tom" dan onceki ve "Tom" elemanlari yazdirin
        String ogrenci[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String w :ogrenci ){
            System.out.print(w + " ");
            if(w.equals("Tom")){
                break;
            }
        }
        System.out.println("========");
        // Orn 6: Bir String Array olusturun ve "Tom" dan farkli elemanlari yazdirin
        String musteri[] = {"Ali", "Thomas", "Mark", "Jackson", "Tom", "Martin"};

        for(String eleman : musteri){

            if (eleman.equals("Tom")){

                continue;
            }
            System.out.print(eleman + " ");// Ali Thomas Mark Jackson Martin
        }

        // Orn 7:Spesifik bir elemanin Array'de bulunup bulunmadigini ve kac kez kullanildigini bulan bir code yaziniz
        // int arr[] = {-12, 23, 16, 5}; ==> check =>23

        int arr[] = {-12, 23, 16, 5, 23};

        Scanner scan = new Scanner(System.in);
        System.out.println(" Bir tam sayi giriniz");
        int sayi = scan.nextInt();

        int sayac = 0; //flag

        for(int w:arr){
            if (w==sayi){
                sayac++;
            }
        }

        if (sayac>0){
            System.out.println(sayi + " sayisi eleman "+ sayac + " kez kullanilmistir");
        }else{
            System.out.println(sayi + " sayisi eleman olarak hic kullanilmaistir");
        }


scan.close();
    }
}
