package Practice1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Istisna01 {
    /*
        1) FileNotFoundException:
            a) Eger dosya(file) adresi yanlis ise
            b) Eger dosyayi buldu fakat dosya erisemiyorsa
        2) IOException
            a) Bu exception input ve output ile ilgili butun exception'lar mudahale eder
           Not: IOException, FileNotNotFoundException'larin ebeveynidir
           Not: Eger IOException kullaniyorsaniz, FileNotFoundException kullanmaniza gerek yoktur
        3) Eger bir Exception gorurseniz, iki tane secenegimiz var
            a) 'throws' declaration'i method signiture kismina/ satirina eklenir
            b)  try-catch block kullanilir

     */

    public static void main(String[] args) throws IOException {

        FileInputStream dosya = new FileInputStream("src/Practice1/File01");

        int i =0;
        while ((i = dosya.read()) !=-1){

            System.out.print((char) i);
        }
          dosya.close();

    }





}
