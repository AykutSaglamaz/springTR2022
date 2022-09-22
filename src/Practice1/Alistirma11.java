package Practice1;

public class Alistirma11 {

    //Bir String'de tekrar eden karakterleri silen String bir method olusturun
    //  EX : aaabbc --> abc

    public static void main(String[] args) {

      String k=  tekrarEdenKarakteriSil("acabbclkjflsdjfldsjflsdlfnmelkrjloafj;lfemwrew");
        System.out.println(k);

    }

    private static String  tekrarEdenKarakteriSil(String str) {
        String str1 ="";

        for (int i =0; i<str.length(); i++){


            char harf = str.charAt(i);


            if (!str1.contains(harf+"")) {


                str1 = str1 + harf;
            }
        }


        return str1;
    }


}
