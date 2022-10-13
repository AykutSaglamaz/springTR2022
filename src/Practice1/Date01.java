package Practice1;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {
    public static void main(String[] args) {
        /*
        Date () kullarak
        1- Kodlarin ne kadar surede sonuclandigini gorebiliriz
        2- ScreenShot yada video kaydi alip raporlara ekleyebilir
         */
//        LocalDate guncelTarih = new LocalDate();
        LocalDate guncelTarih = LocalDate.now();
        System.out.println(guncelTarih);//2022-10-13

        System.out.println(guncelTarih.plusDays(5)); //2022-10-18 => gun eklemek icin plusDays
        System.out.println(guncelTarih.minusDays(5));//2022-10-08 => gun cikarmak icin minusDays

        System.out.println(guncelTarih.plusMonths(5)); //2023-03-13

        System.out.println(guncelTarih.plusYears(6)); //2028-10-13

        //3 yil 5 ay 7 gun sonraki tarihi yazdiralim
        System.out.println(guncelTarih.plusYears(3).plusMonths(5).plusDays(7)); //2026-03-20

        System.out.println(guncelTarih.getDayOfMonth()); // guncelTarihin icinde bulundugumuz ayin gununu verecek

        System.out.println(guncelTarih.getDayOfWeek());//THURSDAY

        System.out.println(guncelTarih.getMonth());//OCTOBER

        System.out.println(guncelTarih.getMonthValue());//10

        LocalDate belliBirTarih = LocalDate.of(1991, 3, 25);
        System.out.println(belliBirTarih); //1991-03-25

        //kiyaslama

        System.out.println(belliBirTarih.isAfter(guncelTarih));// false

        System.out.println(belliBirTarih.isBefore(guncelTarih));// true

// yil + gun + ay ===> yyyy-MM-dd => default format
        // M => month =ay,  m => minutes = dakika
        /*
        MM => kacinci (-10-)
        MMM => ayin isminin ilk uc karakteri => October -> Ocb
        MMMM => ayin butun ismini bize verir -> October
         */

        DateTimeFormatter tarihiFormatla = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
        System.out.println(tarihiFormatla.format(guncelTarih)); //13/Oct/2022

        DateTimeFormatter tarihiFormatla1 = DateTimeFormatter.ofPattern("dd/MMMM/yy");
        System.out.println(tarihiFormatla1.format(guncelTarih)); // 13/October/22

        DateTimeFormatter tarihiFormatla2 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println(tarihiFormatla2.format(guncelTarih)); // 13/10/22

        System.out.println(tarihiFormatla2.format(guncelTarih.minusMonths(3)));//13/07/22


        LocalTime guncelSaat = LocalTime.now();
        System.out.println(guncelSaat); //04:51:08.800648500

        /*
        hh => am - pm format
        HH => 24-saatlik format
         */
        DateTimeFormatter saatiFormatla = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(saatiFormatla.format(guncelSaat)); //04:56 ->< saat ve dakika

        DateTimeFormatter saatiFormatla1 = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(saatiFormatla1.format(guncelSaat)); //04:58 AM

        DateTimeFormatter saatiFormatla2 = DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(saatiFormatla2.format(guncelSaat)); // 5:00

    LocalDate t1 = LocalDate.now();
    LocalDate t2 = LocalDate.of(2015, 5, 16);
        Period fark = Period.between(t1,t2);
        System.out.println(fark); //P-7Y-4M-28D

        int ayFarki = Period.between(t1,t2).getMonths();
        String toplam =Period.between(t1,t2).getYears()*12+ Period.between(t1,t2).getMonths()+" ay" + Period.between(t1,t2).getDays()+ " gun";
        System.out.println(toplam);










    }

}
