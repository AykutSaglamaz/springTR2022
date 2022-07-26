package day22dateaccessmodifiers;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date01 {

    public static void main(String[] args) {
        // you are gonna use date to learn how long does it take to run a block of code or
        // to name your screenshots
        // to put inside your reports

        /* Date methodlarini kullanarak
         1) kodlarin ne kadar surede calistigini
         2) screenshot alip  ve raporlara eklemek icin kullaniriz

         */

        //how to create Date object /
        //  date object olusturmak icin
        //LocalDate currentDate = new LocalDate();

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);

        System.out.println(currentDate.plusDays(5));// days to add
        System.out.println(currentDate.plusMonths(2));// months to add
        System.out.println(currentDate.plusYears(5)); // years to add

        System.out.println(currentDate.plusDays(-5));
        System.out.println(currentDate.minusDays(5));

        //tomorrow
        LocalDate tomorrow = currentDate.plusDays(1);
        System.out.println("tomorrow: "+tomorrow);

        //yesterday
        LocalDate yesterday = currentDate.minusDays(1);
        System.out.println("yesterday: "+yesterday);

        //please print 2 years + 3 months + 15 days later
        //method chaining
        System.out.println(currentDate.plusYears(2).plusMonths(3).plusDays(15));

        //Please print 5 months+ 27 days before
        System.out.println(currentDate.minusMonths(5).minusDays(27));


        //how to print just the value of year
        System.out.println(currentDate.getYear());

        //how to print just the value of month
        System.out.println(currentDate.getMonth());
        System.out.println(currentDate.getMonthValue());

        //get the day
        System.out.println(currentDate.getDayOfMonth());
        System.out.println(currentDate.getDayOfYear());
        System.out.println(currentDate.getDayOfWeek());


        //to create a specific date
        LocalDate date1 = LocalDate.of(1995, 3, 3);
        System.out.println(date1);
        System.out.println(date1.getDayOfWeek());

        //compare 2 dates
        System.out.println(currentDate.isAfter(date1));//true
        System.out.println(currentDate.isBefore(date1));//false

        //yyyy-MM-dd====> default format
        // M=> Months, m=>minutes
        // MM=> the number of month (0-)
        // MMM=>  First 3 characters
        // MMMM=> Full name of the month
        //Please use upper case M for month. Do not use lower case. It is for minute

        LocalDate currentDate1 = LocalDate.now();
        System.out.println("before formatting: "+currentDate1);

        //to format our date we use DateTime Formatter
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MMM/yyyy");// MMM-->>12/Jul/21, MM-->>12/07/21, M-->>12/7/21
        System.out.println("after formatting: "+dateTimeFormatter.format(currentDate1));

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("after formatting: "+dateTimeFormatter1.format(currentDate1));

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("dd/M/yyyy");
        System.out.println("after formatting: "+dateTimeFormatter2.format(currentDate1));

        DateTimeFormatter dateTimeFormatter3 = DateTimeFormatter.ofPattern("dd/MM/yy");
        System.out.println("after formatting: "+dateTimeFormatter3.format(currentDate1));

        System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3)));
        System.out.println(dateTimeFormatter3.format(currentDate1.plusMonths(3).plusDays(11)));


        LocalTime currentTime = LocalTime.now();
        System.out.println(currentTime);
        /*
         * hh=> am-pm format
         * HH=> 24 -hour format
         */

        //if you use lower case 'h', it will be in 12 hour format
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(timeFormatter.format(currentTime));


        //if you want to use 24 hour format, you should use uppercase 'HH'

        DateTimeFormatter timeFormatter1 = DateTimeFormatter.ofPattern("hh:mm");

        System.out.println(timeFormatter1.format(currentTime));

        DateTimeFormatter timeFormatter2 = DateTimeFormatter.ofPattern("hh:mm a");

        System.out.println(timeFormatter2.format(currentTime));



        //How to get the difference between two dates

        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(1986, 10, 27);

        Period arg = Period.between(d2, d1);
        System.out.println(arg);


        int age1 =Period.between(d2, d1).getYears();
        System.out.println(Math.abs(age1));



    }

}
