package practice;

import java.util.Scanner;

public class P01 {

    public static void main(String[] args) {

//    //Kullanicidan bir karakter isteyin ve o karakerin ASCII degerini bulunuz?
//
//    Scanner scan = new Scanner(System.in);
//
//    System.out.println(" Lutfen bir karakter giriniz");
//
//    char k = scan.next().charAt(0);
//
//    int ascii = k;
//
//    System.out.println(ascii);

//        System.out.println(fibonacciRakami(16));

//        System.out.println(asalSayi(9));

//        System.out.println(tersineCevirme("Java kolaydir"));


        System.out.println(tersCevir("Java kolaydir para dfgdfeg dfghdfsghdfghfgdkazamak istiyorsan java ogren"));

    }
    //



    // verilen bir String'i tersine ceviren bir kod yaziniz//
    // Java kolaydir ==> ridyalok avaj

    public static String tersCevir(String w){
        //2.yol
        String tersC ="";

        for (int k = w.length()-1; k >=0; k--){

            tersC = tersC + w.charAt(k);
        }
        return tersC;
//
    }




//    public static String tersineCevirme(String s){
//
//        //1.yol
//        String tersCevirme ="";
//
//        String [] arr = s.split("");
//        for (int i = arr.length-1; i>=0; i--){
//            tersCevirme+=arr[i];
//        }
//            return tersCevirme;
//        }
//




//
//    public static boolean asalSayi(int m) {
//        if (m <= 1) {
//            return false;
//        }
//
//        for (int i = 2; i < m; i++) {
//
//            if (m % i == 0) {
//                return false;
//            }
//            }
//            return true;
//
//
//    }


//
//    public static int fibonacciRakami(int n) {
//
//        // 0 1 1 2 3 5 8 13 21 34 55 89>  fibonaci sayisi => Kullanicidan bir sayi alarak bunun kacinci n. fibonaci sayisini oldugunu veren bir code yaziniz
//        int a = 0; // ilk sayi
//        int b = 1;// ikinci sayi
//        int c; // bir sonraki sayidir
//
//        if (n == 0) {
//            n = a;
//        }
//        if (n == 1) {
//            n = b;
//        }
//        for (int i = 2; i <= n; i++) {
//            c = a + b;
//            a = b;
//            b = c;
//        }
//        return b;
//
//    }




}
