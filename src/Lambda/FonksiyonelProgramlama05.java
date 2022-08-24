package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FonksiyonelProgramlama05 {

    public static void main(String[] args) {
        Kurs kursTurkceGunduz = new Kurs("Yaz", "Turkce Gunduz", 97, 128);
        Kurs kursTurkceGece = new Kurs("Kis", "Turkce Gece", 98, 154);
        Kurs kursIngilizceGunduz = new Kurs("Ilkbahar", "Ingilizce Gunduz", 95, 132);
        Kurs kursIngilizceGece = new Kurs("Kis", "Ingilizce Gece", 93, 144);

        List<Kurs> kursList = new ArrayList<>();
        kursList.add(kursTurkceGunduz);
        kursList.add(kursTurkceGece);
        kursList.add(kursIngilizceGece);
        kursList.add(kursIngilizceGunduz);

        System.out.println(ortalama91BuyukMu (kursList, 91));

        System.out.println(birKelimeyiCheckEt (kursList));

        enYuksekOrtalama (kursList);
        System.out.println(ilk2ElemaniAtlaSirala (kursList));
        System.out.println(ilk2ElemaniAtlaUcuncusunuAl (kursList));

    }
//1-  ortalama puanin 91'den buyuk olup olmadigini check eden bir method yaziniz

    public static boolean ortalama91BuyukMu (List<Kurs> kursList, int ortalama){

        return kursList.stream().allMatch(t->t.getNotOrtlamasi()>ortalama);
    }

 ///2- En az bir kurs isminde 'Turkce' kelimesinin olup olmadigini check eden bir method yaziniz
    public static boolean birKelimeyiCheckEt (List<Kurs> kursList){
        return  kursList.stream().anyMatch(t->t.getKursIsmi().contains("Turkce"));
    }
    //3- En yuksek ortalama puanini bulan bir method yaziniz
    public static void enYuksekOrtalama (List<Kurs> kursList){
      Kurs sonuc =  kursList.stream().sorted(Comparator.comparing(Kurs::getNotOrtlamasi).reversed()).findFirst().get();
        System.out.println(sonuc);
    }
//4- Ilk iki elemani atlayan ve list elemanlarini ortalama puana gore siralayan ve list olarak veren  bir method yaziniz
    public static List<Kurs> ilk2ElemaniAtlaSirala (List<Kurs> kursList){
      return kursList.stream().sorted(Comparator.comparing(Kurs::getNotOrtlamasi)).skip(2).collect(Collectors.toList());
    }
//5-list elemanlarini ortalama puana gore siralayan ve yalnizca 3. elemani yazdiran bir method yaziniz
public static List<Kurs> ilk2ElemaniAtlaUcuncusunuAl (List<Kurs> kursList){
    return kursList.stream().sorted(Comparator.comparing(Kurs::getNotOrtlamasi)).skip(2).limit(1).collect(Collectors.toList());
}

}
