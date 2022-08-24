package Lambda;
/*
    POJO: Plain Old Java Object
    1) Parametresi olmayan Constructor
    2) Butun parametreleri olan Constructor
    3) getter() ve setter()
    4) toString();
 */

public class Kurs {
    private String mevsim;
    private String kursIsmi;
    private int notOrtlamasi;
    private int ogrenciSayi;


    public Kurs() {
    }


    public Kurs(String mevsim, String kursIsmi, int notOrtlamasi, int ogrenciSayi) {
        this.mevsim = mevsim;
        this.kursIsmi = kursIsmi;
        this.notOrtlamasi = notOrtlamasi;
        this.ogrenciSayi = ogrenciSayi;
    }

    public String getMevsim() {
        return mevsim;
    }

    public void setMevsim(String mevsim) {
        this.mevsim = mevsim;
    }

    public String getKursIsmi() {
        return kursIsmi;
    }

    public void setKursIsmi(String kursIsmi) {
        this.kursIsmi = kursIsmi;
    }

    public int getNotOrtlamasi() {
        return notOrtlamasi;
    }

    public void setNotOrtlamasi(int notOrtlamasi) {
        this.notOrtlamasi = notOrtlamasi;
    }

    public int getOgrenciSayi() {
        return ogrenciSayi;
    }

    public void setOgrenciSayi(int ogrenciSayi) {
        this.ogrenciSayi = ogrenciSayi;
    }

    @Override
    public String toString() {
        return "Kurs{" +
                "mevsim='" + mevsim + '\'' +
                ", kursIsmi='" + kursIsmi + '\'' +
                ", notOrtlamasi=" + notOrtlamasi +
                ", ogrenciSayi=" + ogrenciSayi +
                '}';
    }
}

