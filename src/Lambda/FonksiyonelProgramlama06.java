package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FonksiyonelProgramlama06 {

    public static void main(String[] args) throws IOException {

//        //text dosyani nasil okunur
//        Files.lines(Paths.get("src\\Lambda\\LambdaTextFile.txt")).forEach(System.out::println);
        System.out.println("=====================");
    //File deki butun karakterleri buyuk harfe cevir
//        Files.lines(Paths.get("src\\Lambda\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);
        System.out.println("=====================");
  // Spesifik bir kelimenin (Lambda) bu dosyada olup olmadiginiz check et
    //  boolean sonuc =  Files.lines(Paths.get("src\\Lambda\\LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
   //     System.out.println(sonuc);

    //********** file'deki farkli olan kelimeleri yazdirin
        Files.lines(Paths.get("src\\Lambda\\LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).distinct().forEach(System.out::println);
        System.out.println("==============");

        //sonu 'k' ile biten kelimeleri yazdir
        Files.lines(Paths.get("src\\Lambda\\LambdaTextFile.txt")).map(t->t.split(" ")).flatMap(Arrays::stream).filter(t->t.endsWith("e")).forEach(System.out::println);
    }





}
