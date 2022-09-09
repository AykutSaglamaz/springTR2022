package Practice1;

import java.util.Scanner;

public class Alistirma01 {
    /*
    Kullacidan bir kisinin yas ve cinsiyetini girmesini isteyin
    Eger kisin yasi 65'ten buyuk ve cinsiyeti Erkek ise bu durumda kisiye "emekli", aksi "calismali" diye soyleyin
    Eger kisin yasi 60'tan buyuk ve cinsiyeti Kadin ise, bu durumda kiseye "emekli, aksi halde "calismali" diye bildirelim

    E => yas>= 65 === Kisi=> Emekli
    E => yas<65 ==> kisi => calismali

    K => yas>= 60 === Kisi=> Emekli
    K => yas<60 ==> kisi => calismali
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Yasinizi ve cinsiyetinizi giriniz");
        int yas = scan.nextInt();
        char cinsiyet = scan.next().toUpperCase().charAt(0);

        if (cinsiyet=='K'){
            if (yas>60){
                System.out.println("Emekli");
            }else{
                System.out.println("calismali");
            }
        }else if (cinsiyet=='E') {
            if (yas>=65){
                System.out.println("emekli");
            }else{
                System.out.println(cinsiyet+ ": calismali");
            }
        }else{
            System.out.println(" Cinsiyetinizi veya yasinizi yanlis girdiniz");
        }


    }

}



