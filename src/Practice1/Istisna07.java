package Practice1;

import java.util.Scanner;

public class Istisna07 {
    /*
        THROW
            -Throw anahtar sozcugu acikca bir istisnayi firlatmak icin kullanilir
            -Throw anahtar sozcugunu kullanarak yalnizca bir tek istisna atilabilir (cozulebilir)
            -Throw anahtar sozcugu YALNIZCA METHOD BODY icinde kullanilabilir
            -Throw anahtar sozcugunu bir instance (obje) degiskeni ile calisir => new IllegalArgumentException()
            - Checked exception'lar yalnizca 'THROW' halledilemez


        THROWS
            -Throws anahtar sozcugu virgulle ayirakrak bir veya birden fazla istisna icin kullanilabilir
            -Throws anahtar sozcugu birden fazla istisna icin kullanilabilir
            -Throws anahtar sozcugu METHOD SIGNITURE ile kullanilir
            -Throws anahtar sozcugunu Exception class ile kullanmaliyiz =>IllegalArgumentException
            - Checked exception'lar  'THROWS' ile halledebiliriz
     */


    public static void main(String[] args)  {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
         int yas = scan.nextInt();


         try{
             yasiniz(yas);
         }catch (Exception e){
             System.out.println("yas icin negatif degerler kullanilamaz");
         }

    }
     public static void yasiniz (int yas)  {
         if (yas<=0){
             throw new IllegalArgumentException();

         }else{
//            // throw new IllegalArgumentException();
             System.out.println(yas);

         }

     }

}
