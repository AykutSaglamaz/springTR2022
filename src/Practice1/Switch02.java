package Practice1;

import java.util.Locale;
import java.util.Scanner;
    /*
    Switch(?)==> ? = String, char, byte, int, short olabilir
     boolean, long, float ve double
    */

public class Switch02 {

    public static void main(String[] args) {
        // Kullanicinin girmis oldugu ayin kacinci ay oldugu kullaniciya soyleyelim

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();

        switch (ay){
            case "ocak":
                System.out.println("girdiginiz ay yilin 1. ayidir");
                break;
            case "subat":
                System.out.println("girdiginiz ay yilin 2. ayidir");
                break;
            case "mart":
                System.out.println("girdiginiz ay yilin 3. ayidir");
                break;
            case "nisan":
                System.out.println("girdiginiz ay yilin 4. ayidir");
                break;
            case "mayis":
                System.out.println("girdiginiz ay yilin 5. ayidir");
                break;
            case "haziran":
                System.out.println("girdiginiz ay yilin 6. ayidir");
                break;
            case "temmuz":
                System.out.println("girdiginiz ay yilin 7. ayidir");
                break;
            case "agustos":
                System.out.println("girdiginiz ay yilin 8. ayidir");
                break;
            case "eylul":
                System.out.println("girdiginiz ay yilin 9. ayidir");
                break;
            case "ekim":
                System.out.println("girdiginiz ay yilin 10. ayidir");
                break;
            case "kasim":
                System.out.println("girdiginiz ay yilin 11. ayidir");
                break;
            case "aralik":
                System.out.println("girdiginiz ay yilin 12. ayidir");
                break;
            default:
                System.out.println("Bir ay ismi girmediniz, lutfen bir ay ismi giriniz");
        }



    }

}
