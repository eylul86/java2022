package day30_immutable_date;

import java.time.LocalDate;
import java.time.Month;

public class C03_Date {


    public static void main(String[] args) {


        LocalDate tarih= LocalDate.now();
        System.out.println("tarih = " + tarih);
        System.out.println(tarih.getDayOfYear()); //204
        System.out.println(tarih.getDayOfWeek());//saturday
        System.out.println(tarih.getMonthValue());//7
        System.out.println(tarih.isLeapYear());//false  artık yıl

        LocalDate trih2=LocalDate.of(1986,9,5);

        System.out.println("trih2 = " + trih2); // 1986-09-05

        LocalDate trih3=LocalDate.of(1986, Month.SEPTEMBER ,5);
        System.out.println("trih3 = " + trih3);  //1986-09-05


        System.out.println(tarih.plusDays(100));
        System.out.println(tarih.plusYears(5).plusMonths(3).plusDays(12));

        System.out.println(tarih.minusWeeks(20)); //2022-03-05
        System.out.println(tarih.minusDays(100).minusWeeks(2));
        System.out.println(tarih.isAfter(trih2)); //true





    }
}
