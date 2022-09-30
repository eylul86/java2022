package day31_timeFormatter_varargs;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01_TimeFormatter {
    public static void main(String[] args) {


        LocalDateTime tarihSaat=LocalDateTime.now();
        System.out.println("ilk olusturulan tarih:"+tarihSaat);

        //ilk olusturulan tarih:2022-07-25T21:41:06.711398700

        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("dd/MM/YY hh:mm a");

        System.out.println(dtf.format(tarihSaat));
        //25/07/22 09:45
        DateTimeFormatter dtf2=DateTimeFormatter.ofPattern("d/MMM/yyyy HH:mm");
        System.out.println(dtf2.format(tarihSaat));
//25/Tem/2022 21:47    kucuk harf saat am pm  buyuk harf 22:00



    }
}
