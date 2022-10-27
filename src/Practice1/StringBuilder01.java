package Practice1;

public class StringBuilder01 {
    public static void main(String[] args) {
        // String immutable (guncellenenmezler) bu nedenle JAVA StringBuilder olsturmustur
        //StringBuilder guncellenebilir, esnektirler

        String str = "Alistirma";
        str.substring(2); //-> istirma
        str.toUpperCase();//ALISTIRMA
        System.out.println(str.toUpperCase());//ALISTIRMA

        System.out.println(str);

        //StringBuilder olusturmak icin  3 yol vardir

        StringBuilder sb = new StringBuilder();

        System.out.println(sb.capacity());//16

        sb.append("Ali");
        sb.append(" Javayi seviyor.");

        System.out.println(sb.capacity());//default (16) + kullanilan karakter sayisi = 34// StringBuilder' capacity bakindan guncenllenebilir, esnektirler
        System.out.println(sb);

        // 2. yol

        StringBuilder sb1 = new StringBuilder(" Veli Python calisir.");

        System.out.println(sb1.length());// 21
        sb1.append(" Ahmet SQL ogrendi.");

        System.out.println(sb1);//

        //3. yol
        StringBuilder sb2 = new StringBuilder(5);
        sb2.append("Zeynep tester olarak is buldu mu");// eger reserve edilen kapasite eklemek istenilen karakter sayisindan kucuk ise kapasite reserve carpi 2 + 2
        System.out.println(sb2.capacity());//12
        System.out.println(sb2.length());//6

        //
        StringBuilder sb3 = new StringBuilder("Java");
        sb3.append("+").append("Selenium").append("+").append("SQL").append("= Yuksek maasli bir is");
        System.out.println(sb3); //Java+Selenium+SQL= Yuksek maasli bir is

        // Spesific indexler arasinda karakter veya karakter grubu eklenebilir
        sb3.append(" + konforlu hayat ", 0, 18);

        sb3.append(sb2, 0, 6);

        System.out.println(sb3.charAt(5));
        System.out.println(sb3.deleteCharAt(5));

        System.out.println(sb3.delete(5, 13));

        //reverse
        StringBuilder sb4 = new StringBuilder("Ahmet ve Ibrahim caliskandir");
//        sb4.reverse();//ridnaksilac miharbI ev temhA
        System.out.println(sb4);

        System.out.println(sb4.indexOf("b"));// 10
        System.out.println(sb4.indexOf("a", 13));// 18
        System.out.println(sb4.indexOf("g")); //-1


        // insert
        System.out.println(sb4.insert(5, " ve Mehmet ")); //Ahmet ve Mehmet  ve Ibrahim caliskandir

        //replace
        System.out.println(sb4.replace(5, 15, "*"));

        //set char
      sb4.setCharAt(1, '*');
        System.out.println(sb4);

        // trimToSize

        StringBuilder sb5 = new StringBuilder("Ahmet");
        System.out.println(sb5.capacity());//21
        sb5.trimToSize();
        System.out.println(sb5.capacity());//5











    }




}
