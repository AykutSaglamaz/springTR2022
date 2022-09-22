package Practice1;

public class alistirma08 {
    /*
	 String alan bir method olusturun ve karakterleri  rakam, alfabe ve diger seklinde ayristirin
     Method String dondurmeli. EX: a1b2c,3!? --> harfler: abc, rakamlar: 123 ve diger: ,!?
    */

    public static String ayristirma(String str) {

//        String str ="a1b2c,3!?";
        String harf="", rakam="", diger="";

        for (int i =0; i<str.length(); i++){

            char karakter = str.charAt(i);

            if(Character.isLetter(karakter)){
                harf= harf+ karakter;

            }else if (Character.isDigit(karakter)){
                rakam+=karakter;

            }else{
                diger += karakter;
            }
        }

        return "Harfler: "+ harf+ " rakamlar: "+ rakam + " diger: "+ diger;
    }

    public static void main(String[] args) {

      String t = ayristirma("a1b2c,3!?");
        System.out.println(t);
    }




}
