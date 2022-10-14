package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Istisna02 {
    /*
        1- Bir tane try-block icin birden fazla catch block kullanilabilir
        2-Eger birden fazla "catch-block" kullanilmissa, daima Exception siralamasi child-parent seklinde olmali
            aksi takdirde CTE aliriz
        3- Eger birden fazla "catch-block" kullanacaksaniz, herbiri icin farki mesaj yazdirabilirsiniz
        4- try-block tek basina kullanilamaz
        5- Eger Java kodlari okurken bir hata bulursa  (try-catch veya Throws ustesinden gelinmezse) calismayi durdurur
     */

    public static void main(String[] args) {

        try {

            FileInputStream dosya = new FileInputStream("src/Practice1/File01");


            int i =0;

             while ((i = dosya.read()) != -1) {

                 System.out.print((char) i);
             }


            } catch (FileNotFoundException e) {
            System.out.println("Verdiginiz adres yanlistir");
//           e.printStackTrace();

            } catch (IOException e){

            System.out.println("Dosya adresi dogru fakat karakterleri okuyamiyorum");

        }










    }
}
