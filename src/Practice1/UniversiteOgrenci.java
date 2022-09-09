package Practice1;

import java.util.Arrays;
import java.util.Collections;

public class UniversiteOgrenci implements Comparable<UniversiteOgrenci> {
    String adi;
    String soyadi;
    int TcKimlikNo;
    String bolumu;
    double liseMezunOrt;

    @Override
    public int compareTo(UniversiteOgrenci ort) {
        return (int) (this.liseMezunOrt - ort.liseMezunOrt);
    }

    public UniversiteOgrenci() {
    }

    public UniversiteOgrenci(String adi, String soyadi, int TcKimlikNo, String bolumu, double liseMezunOrt) {
        this.soyadi = soyadi;
        this.adi = adi;
        this.TcKimlikNo = TcKimlikNo;
        this.bolumu = bolumu;
        this.liseMezunOrt = liseMezunOrt;
    }

    public String toString() {
        return  this.adi + " " + this.soyadi + ": " +
                this.TcKimlikNo + ", " + this.bolumu +": " +this.liseMezunOrt;
    }
    public static void main(String[] args) {
        UniversiteOgrenci UO01 = new UniversiteOgrenci("Murat", "kılıc", 498736786, "hukuk", 89.5);
        UniversiteOgrenci UO02 = new UniversiteOgrenci("Zeynep", "Arslan", 427382656, "Tip", 98.3);
        UniversiteOgrenci UO03 = new UniversiteOgrenci("Ali", "Yavuz", 92642656, "ogretmen", 76.8);
        UniversiteOgrenci UO04 = new UniversiteOgrenci("kasım", "Acar", 327582959, "Bilgisayar mühendisi", 89.4);
        UniversiteOgrenci UO05 = new UniversiteOgrenci("muhammet", "kaya", 764235865, "eczacilik", 81.8);
        UniversiteOgrenci [] uniOgrenci = { UO01, UO02, UO03, UO04, UO05};

       System.out.println(Arrays.toString(uniOgrenci));
            Arrays.sort(uniOgrenci);

        System.out.println(Arrays.toString(uniOgrenci));
// buyukten kucuge siralansa
        Arrays.sort(uniOgrenci, Collections.reverseOrder());
        System.out.println(Arrays.toString(uniOgrenci));

    }

}
