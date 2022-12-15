package Practice1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class A36 {
    /*
    Bir cumlede kullanilan herbir kelimenin kac sefer kullanildigini gosteren bir kod yaziniz
    Orn: "Java is easy, Type codes to learn Java. To earn money learn Java."
    output: Java=3, is=1, easy=1, Type=1, ....learn=2, ....
     */
    public static void main(String[] args) {
        String str = "Java is easy, Type codes to learn Java. To earn money learn Java.";

       str = str.replaceAll("\\p{Punct}", "").toLowerCase();

        System.out.println(str);//Java is easy Type codes to learn Java To earn money learn Java

        Map<String,Integer > sonuc = new HashMap<>();
        String[] kelimeler = str.split(" ");

        System.out.println(Arrays.toString(kelimeler)); //[Java, is, easy, Type, codes, to, learn, Java, To, earn, money, learn, Java]

        for (String kelime: kelimeler ){
           Integer degerSayisi= sonuc.get(kelime);

           if (degerSayisi == null){
               sonuc.put(kelime, 1);
            } else {
               sonuc.put(kelime, degerSayisi+1 );
            }
        }
        System.out.println(sonuc);

    }

//Bir cumlede kullanilan herbir karakterin kac sefer kullanildigini gosteren bir kod yaziniz
    //Orn: "Java is easy, Type codes to learn Java. To earn money learn Java."



}
