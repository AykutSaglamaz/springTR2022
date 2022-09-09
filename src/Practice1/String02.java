package Practice1;

import java.util.Arrays;

public class String02 {
    public static void main(String[] args) {

        //18. method: replaceAll() ==> replace() gibi calisir, sonucu String dondurur

        String s1 = "Java5682545 lava degildir";
        System.out.println( s1.toUpperCase().replaceAll("L","s").replaceAll("JAVA","Python"));

        /*
                replace() ile replaceAll() farkliliklar
        1-) replace() ile biz String veya char  parametre olarak kullanabilir
            replaceAll() sadece String kullanilabilir
        2-) replaceAll(), bazi Regular Expressions (regex)  => Syntax ( sintex)  kullanilabilir ve bir den fazla karakteri/karakter gurubunu temsil edebilir

        orn:
            a)   \\d ==> butun rakamlari degistirir (0,1,2 ....9)  \\d => digit
                 \\D ==> rakamlar disindaki butun degistirir
            b)  \\w  ==> (_) ve a-z ile A-Z ve 0-9 karakterleri degistirir
                \\W  ==> (_) ve a-z ile A-Z ve 0-9 disindaki karakterleri degistirir
            c)   \\s ==> bosluk icin kullanabilir
                  \\S ==>  bosluk(space) harici diger karakterleri degistirmek icin kullanilir
            d)   \\A ==> String baslangicinin tamami icin kullanilir
                 \\Z ==> Tum String'in son kismi icin kullanilir
            e)  [xyz] veya [abc] yada [axm] ==> kullanilan karakterlerin tamami icin gecerli
                [^xyz] veya [^abc] yada [^axm] ==> kullanilan karakterler disindaki butun karakterler icin gecerli

            f) \\p{Punct} ==> butun noktalama isaretlerini siler

         */

        String s2 ="A1B2C3DFR??  AB2344MN";

        System.out.println(s2.replaceAll("\\d", "")); //ABCDFR??  ABMN
        System.out.println(s2.replaceAll("\\D", "!")); //!1!2!3!!!!!!!!!2344!!

        String s3 ="ABDC DEGE HDTE 1235";
        System.out.println(s3.replaceAll("\\D", "*")); //***************1235

        String s4 = "a0C1_!   xB9m?";
        System.out.println(s4.replaceAll("\\w","*")); // *****!   ****?

        System.out.println(s4.replaceAll("\\W","*"));// a0C1_****xB9m*

      String s5 ="   Ali    okula    gel   ";

        System.out.println(s5.replaceAll("\\s", "*"));//***Ali****okula****gel***
        System.out.println(s5.replaceAll("\\S", "*")); //   ***    *****    ***

        String s6 = " 3,159.99 ";
        System.out.println(s6.replaceAll("\\A", "Dolar")); //Dolar 3,159.99
        System.out.println(s6.replaceAll("\\Z", "TL")); // 3,159.99 TL


        String s7 = "Ali Can Bey";
        System.out.println(s7.replaceAll("[lCy]", "x")); //Axi xan Bex

        System.out.println(s7.replaceAll("[^Ai]", "Z")); //AZiZZZZZZZZ

        System.out.println(s7.replaceAll("[^AC B]", "**"));// A**** C**** B****

        //19. Method : split() ==> istegimiz karakterden veya karakter grubundan String'i boluyoruz

        String s8 = "Bugun hava guzeldir";
        String [] arr  = s8.split(" ");
        System.out.println(Arrays.toString(arr));//[Bugun, hava, guzeldir]

    }



}
