package Practice1;

import java.util.Scanner;

//  Kullanicidan bir ay ismi alalim
// bu ay ocak, subat, mart ise ilk ceyrek
// eger nisan, mayis ve haziran dan birisi ise 2. ceyrek
// eger temmuz, agustos, ve eylul den biri ise 3. ceyrek
// eger ekim, kasim ve aralik ayindan biri ise 4. ceyrek olarak yazdiralim
public class Switch03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir ay ismi giriniz");
        String ay = scan.next().toLowerCase();

       switch (ay){
           case "ocak":
           case "subat":
           case "mart":
               System.out.println("Girdiginiz ay yilin 1. ceyregindedir");
               break;
           case "nisan":
           case "mayis":
           case "haziran":
               System.out.println("Girdiginiz ay yilin 2. ceyregindedir");
               break;
           case "temmuz":
           case "agustos":
           case "eylul":
               System.out.println("Girdiginiz ay yilin 3. ceyregindedir");
               break;
           case "ekim":
           case "kasim":
           case "aralik":
               System.out.println("Girdiginiz ay yilin 4. ceyregindedir");
               break;
           default:
               System.out.println("Lutfen bir ay ismi giriniz");
       }

    }
}
