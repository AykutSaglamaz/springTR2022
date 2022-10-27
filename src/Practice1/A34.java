package Practice1;

public class A34 {
    public static void main(String[] args) {
        //	Ogrencilerin sinavlarinin ( 2, 3, 4, 5 sinav olabilir) ortalamasini alan bir method yaziniz
        System.out.println(sinavOrtalama("Ahmet",68, 78 ));
        System.out.println(sinavOrtalama("Mehmet",68, 59, 95, 78 ));

        System.out.println(sinavOrtalama("Smith",68, 80, 95, 78, 95, 88, 99, 15, 50, 55 ));

    }
    public static String sinavOrtalama(String isim, double ... varargs){ //varargs
        double ortalama = 0;
        for (double notlar :varargs) {
            ortalama += notlar;
        }

        return isim+ "'in sinavlari ortalamasi: "+ String.format("%.2f", ortalama/varargs.length);
        //  "%.3f" ==> % => isareti noktadan onceki butun rakamlari al, => 3f noktdan sonra 3 rakam al
    }


}
