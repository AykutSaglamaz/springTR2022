package Practice1;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class String01 {

public static void main(String[] args) {
    //1. method : chatAt() => herhangi bir indexteki karakteri dondurur (karakter dondurur)
    //2. method ; equals() =>  karsilastirma yapar ve boolean dondurur
    //3. method : equalIgnoreCase() karsilastirma yapar ve boolean dondurur ==> Ali == ali => true, Ali == Veli => false
    //4. method : lenght()  => String'in kac karakter kullandigini soyler + int dondurur

    String s1 = "";
    System.out.println(s1.length());// 0 => bos bir String icin lenght(), sifir(0) dondurur

    String s2 = " ";
    System.out.println(s2.length());// 1, => bosluk karakteri (space) JAVA tarafindan bir karakter olarak kabul edilir

//        String s3 = null;
//        System.out.println(s3.length());// NullPointerException => String 'null' icin lenght() kullanilmaz

    //5. method : toUpperCase() => karakterleri buyuk harfe cevirir, String dondurur
    //6. method : toLowerCase() => karakterleri kucuk harfe cevirir, String dondurur
    //7. method : contains() => aradigimiz karakter/karakterlerin o String icerisinde var olup olmadigini kotrol eder + boolean dondurur

    String s4 = "Java";
    String s5 = "Java kolaydir";

    System.out.println(s4.toUpperCase());//JAVA

//        s4 = s4.toLowerCase();
    System.out.println(s4.toLowerCase());//java

    System.out.println(s4.contains(s4));//true
    System.out.println(s5.contains(s4));//true
    System.out.println(s5.contains("a"));//true

//        System.out.println(s5.contains(null));//// NullPointerException istisnasi verir

    System.out.println(s5.charAt(s5.length()-1));// bir String'deki son karakteri lenght()-1 ogrenebiliriz

    //8. method : indexOf() => spesifik bir karakterin indeksini verir
    String s6 = "Java ogrenmek guzeldir";

    System.out.println(s6.indexOf("o"));// 6
    System.out.println(s6.indexOf('e'));// 9 => ilk eslesen karakterin indeksini verir

    System.out.println(s6.indexOf("x"));// -1 => var olmayan bir karakter icin -1 dondurur

    System.out.println(s6.indexOf(""));//0
    System.out.println(s6.indexOf(" "));//4
    System.out.println(s6.indexOf("guzeldir"));// 14

    System.out.println(s6.indexOf('e', 10));//11 ilk 10 indeksi atlayacak daha sonra ilk gelen 'e' harfinin indeksini yazacaktir

String s7= "Java ogren, para kazan, hayatini yasa";

// 9. method : lastIndexOf() => en sondan baslayarak aradigimiz karakter veya karakterleri yazdir, int dondurur.
    System.out.println(s7.lastIndexOf("a"));//36
    System.out.println(s7.lastIndexOf("ren"));//7

    System.out.println(s7.lastIndexOf(""));//37

    System.out.println(s7.lastIndexOf(" "));//32

    System.out.println(s7.lastIndexOf("ogrenci"));// -1

    System.out.println(s7.lastIndexOf("a", 4));//

// Bir String'de  yalnizca bir kez kullanilan karakterleri yazdiran bir kode yaziniz.

 //   String s7= "Java ogren, para kazan, hayatini yasa";

    for(int i =0; i<s7.length(); i++){

        if (s7.indexOf(s7.charAt(i))!= s7.lastIndexOf(s7.charAt(i))){

         System.out.print(s7.charAt(i)+ " " );
        }else{
//           System.out.print( s7.charAt(i)+ " ");
        }
    }
// Verilen String' tersten yazdirin
    System.out.println();

for (int i = s7.length()-1; i >= 0; i--){
    System.out.print(s7.charAt(i)+ " " );

}
    System.out.println();
    //   indexOf(s7.charAt(i)) == lastIndexOf(s7.charAt(i)) => Ilgili karakter yalnizca bir kez kullanilmistir
    //   indexOf(s7.charAt(i)) != lastIndexOf(s7.charAt(i)) =>    bu karakter bu String'de tekrar etmistir

//10. method : startsWith() => Bir String'de aradigimiz bir karakterle baslayip baslamadigini bize yazdirir, boolean dondur.
//11. method : endsWith() = > Bir String'in aradigimiz bir karakterle bitip bitmedigini bize soyler, boolean dondurur.

String s8 = "Java Kolaydir";

    System.out.println(s8.startsWith("J"));// true
    System.out.println(s8.startsWith("j"));//false

    System.out.println(s8.startsWith("Java"));//true

    System.out.println(s8.startsWith("K", 5));

    System.out.println(s8.endsWith("r"));//true

    System.out.println(s8.endsWith("Java Kolaydir"));//true


 //12. method :  isEmpty() => Bir String'in bos olup olmadigina bakar ve boolean dondurur

 String s9 = "";
 String s10 = null;

    System.out.println(s9.isEmpty());//true
//        System.out.println(s10.isEmpty());// isEmpty() null String'ler icin kullanilmaz


//13. method: isBlank() => Bir String'in icerisinde bosluk disinda bir karakter var mi yok mu ona bakar, boolean dondurur

    String s11 = "     ";
    String s12 = "     abc   ";
    System.out.println(s11.isBlank());//true
    System.out.println(s12.isBlank());//false

//14. method : concat() => Iki String'i biraraya getirir veya birlestirir + String dondurur

String s13 = "Ahmet";
String s14 ="Mehmet";
    // (+) arti isareti String'lerde concatination (birlestirme) yapar
    System.out.println(s13 + " " + s14);//Ahmet Mehmet
    // (+) arti isareti integerlarda toplama islevi gorur
    System.out.println(6+7);// 13
    // (+) arti isareti char' da toplama islemi yapar
    char a= 'u';
    char b ='y';
    System.out.println(a+b);//238
int z = 12;
    System.out.println((12+14)+s13+12);//26Ahmet12

//15. method : replace() => Bir karakter/karakter grubu yerine baska bir karakter yazmak istedigimizda replace() kullanilir
    // String dondurur
    String s15 = "$399.99$";
    System.out.println(s15.replace("$", "").replace(".", "abcdefg"));//399abcdefg99
    String s16 = "Java kolaydir";
    System.out.println(s16.replace("Java", "Python"));//Python kolaydir

    String s17 = "JAVA";// J_A_V_A_
    System.out.println(s17.replace("A", "_A_"));//J_A_V_A_
    String s18 = "JAVA";// j_a_v_a_
    System.out.println(s18.toUpperCase().replace("A", "_A_"));//J_A_V_A_

   //16. method : substring() => String'in belli bir kismini almak icin kullanilir ve String dondurur.


    String s19 = " Java kolaydir";
//        System.err.println("Java ogren hayat guzellessin");

    System.out.println(s19.substring(5));// kolaydir
    System.out.println(s19.substring(14));// var olmayan bir index icin bosluk dondurur (hicbirsey)

    System.out.println(s19.substring(2, 5));//ava
    System.out.println(s19.substring(2, 14));
    System.out.println(s19.substring(6, 6));//hicbisey
//        System.out.println(s19.substring(6, 3));// StringIndexOutOfBoundsException istisnasi verir

// Kullanicidan bir String isteyin, bu String'in ilk ve son karakterini substring () kullanarak yazdirin

    Scanner scan = new Scanner(System.in);
    System.out.println("Bir String giriniz");
    String str = scan.nextLine();

   String ilk = str.substring(0, 1); // =  str.charAt(0)

    String son = str.substring(str.length()-1);// = str.charAt(str.length()-1);
    System.out.println("ilk karakter: " + ilk + " son karakter: "+ son);


//17. method : trim() ==> String'in basinda  veya sonunda bosluk var ise onu kaldirir ve String dondurur.
     String s20 = "       Java          eglencelidir       ";
    System.out.println("trimden once "+s20);
    s20 = s20.trim();
    System.out.println("trimden sonra "+s20);


}

}
