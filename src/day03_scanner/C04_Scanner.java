package day03_scanner;

import javax.print.DocFlavor;
import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismını ısteyın girilen ismi
        //isminiz:........  seklınde yazdırın

        //insanların dunyasından kod'larımızın bulundugu class'a deger almak
        // ıcın scanner clasınıkullanırız




        // 1 scanner objesi olustur
        Scanner scan = new Scanner(System.in);

        // 2 kullanıcıya ne istedıgınızı söyleyın
        System.out.println("LÜTFEN İSMİNİZİ GİRİNİZ");

        //3 OLUSTURDUGUMUZ SCAN OBJESİ İLE KULLANICININ GİRDİĞİ DEGERİ ALIP
        //OLUSTURACAGIMIZ UYGUN BIR VARİABLE ATAYALIM

        String kullaniciIsmi=scan.next();

        System.out.println("İSMİNİZ:"+kullaniciIsmi);


    }
}
