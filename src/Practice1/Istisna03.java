package Practice1;
//ArithmeticException
// unchecked exception > RunTimeError
// checked exception > CompileTimeError
public class Istisna03 {
    public static void main(String[] args) {
        int x = 25;
        int y = 0;
        try {
            System.out.println(x / y);

        }catch (ArithmeticException e){
            System.out.println("Herhangi bir sayiyi sifira bolme isleme gerceklestirilemez....");
        }

       System.out.println(x);

    }
}
