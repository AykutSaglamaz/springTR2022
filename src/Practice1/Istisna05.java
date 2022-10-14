package Practice1;

public class Istisna05 {
    /*
        1) Eger lenght(), null bir String obje icin kullanirsaniz, NullPointerException alinir
        2) NullPointerException istisnasi, "unchecked Exception'dir
        3) Eger siniflar arasinda ebeveyn-cocuk iliskisi yoksi catch-block'ta siralam onemli degildir ve her biri ayri catch olusturmamiz lazim
        4) try-catch tek basina kullanilmayabilir.
            a) try + catch
            b) try + catch + catch ..... + catch => birden fazla catch kullanilabilir
            c) try + catch + "coklu catch + finally
            d) try + finally
     */
    public static void main(String[] args) {
        String str = "";
        System.out.println(str.length());//0

        String str2 =null;

        try {

            System.out.println(12 / 0);//ArithmeticException

            System.out.println(str2.length());//NullPointerException

        }catch (ArithmeticException e){
            System.out.println("sayilari '0'a bolemezsiniz");

        }catch (NullPointerException e){
            System.out.println(" Lenght() null Stringler icin kullanilamaz "+ e.getMessage());

        }finally {
            System.out.println("finally kismi HER SARTA calisir");
        }

        System.out.println(str.length());

    }

}
