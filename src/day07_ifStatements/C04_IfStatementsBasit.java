package day07_ifStatements;

import java.util.Locale;
import java.util.Scanner;

public class C04_IfStatementsBasit {


    public static void main(String[] args) {

       /* Soru 3) Kullanicidan gun ismini alin ve haftaici veya hafta sonu oldugunu yazdirin
        Ornek:  gun=Pazar output = “Hafta sonu”
        gun=Sali output = “Hafta ici”
 *** String icin equals method’unu kullanin */




        Scanner scan=new Scanner(System.in);


        System.out.println("LÜTFEN BİR GÜN İSMİ GİRİNİZ" );


         String girilenGun=scan.next().toLowerCase();

         //PAZAR pazar PaZar ?? nasıl yazcagını bilemeyiz


      if (girilenGun.equals( "pazar") || girilenGun.equals ("cumartesi")){
            System.out.println("girilen gün HAFTASONU");
        }


        if (girilenGun.equals("pazartesi")
                || girilenGun.equals("sali")
                || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe")
                || girilenGun.equals("cuma")){
            System.out.println("Girilen gun HAFTAICI");
        }


        if (!(girilenGun.equals ( "pazartesi")
                || girilenGun.equals ("sali")
                || (girilenGun.equals( "çarşamba")
                || girilenGun.equals ("perşembe")
                || girilenGun.equals("cuma")))) {
            System.out.println(   "LÜTFEN GECERLİ BİR GUN İSMİ GİRİNİZ");
        }








    }
}
