package Lambda;

public class Utils {

    public static void ayniSatirdaBirBoslukBirakYazdir(Object w){
        System.out.print(w + " ");
    }

    public static boolean ciftSayiAl (int x){
        return x%2==0;
    }

    public static boolean tekSayiAl (int x){
        return x%2!=0;
    }

    public static Integer sayininKaresiniAl (int x){
        return x*x;
    }

    public static Integer sayininKupunuAl (int x){
        return x*x*x;
    }

    public static Double sayininYarisiniAl(int x){
        return x/2.0;
    }

    public static Integer rakamlarToplami(int x){
        int toplam =0;
        while (x!=0){
            toplam = toplam + x%10;
            x= x/10;
        }
        return toplam;
    }


}
