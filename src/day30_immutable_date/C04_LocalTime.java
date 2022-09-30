package day30_immutable_date;

import java.time.LocalTime;

public class C04_LocalTime {
    public static void main(String[] args) throws InterruptedException {


        LocalTime time1=LocalTime.now();
        System.out.println(time1);

        //bizim olusturdugumuz date ve time canli saat ve tarih degildir
      //  LocalTime.now kullandıgımız satırda o ankı tarih veya saati alıp
        //bizim variablemıza store eder.


        Thread.sleep(3000); //3 SANIYE BEKLER SONRA YAZDIRIR

        time1=LocalTime.now();


        System.out.println(time1);


    }




}
