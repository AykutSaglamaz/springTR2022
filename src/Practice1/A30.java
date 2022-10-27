package Practice1;

public class A30 {
    public static void main(String[] args) {
        /*
        ekmek kelimesinn ilk ve son gorunumu arasinda kullanilan bir string sandwich olusturup olusturmadigini soyleyen bir kod yaziniz
        orn:
        ekmekMaydanosekmek => Maydanoz, ekmekMaydanos ==> hicbirsey
         */
        String sandwich = "ekmekmaydonozekmek";

        int ilkGorunum = sandwich.indexOf("ekmek");
        int sonGorunum = sandwich.lastIndexOf("ekmek");
        if (ilkGorunum==sonGorunum){
            System.out.println("sandwich degildir");

        }else
            System.out.println( sandwich.substring(ilkGorunum+5, sonGorunum));


    }


}
