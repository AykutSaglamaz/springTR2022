package practice;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class P02 {
    public static void main(String[] args) {

//Kullanicidan bir e-mail adresi girmesini isteyin, eger , bu email adresi " hotmail" iceriyorsa bunu
//        gmail ile degistirin   ===> abc@hotmail.com  ===> abc@gmail.com

//        baslangic noktasi ? sart saglaniyor :  sart saglanmiyorsa;

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen e-mail adresi giriniz");
        String email = scan.nextLine().toLowerCase();

        if(email.contains("hotmail")){
            System.out.println(email.replace("hotmail", "gmail"));
        }else if (email.contains("yahoo")){
            System.out.println(email.replace("yahoo", "gmail"));
        }else{
            System.out.println("dogru email adresi girdiniz");
        }

//        String i = email.contains("hotmail") ? email.replace("hotmail", "gmail") :("dogru email adresi girdiniz");

//        System.out.println(i);


}

}

