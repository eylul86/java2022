package day03_scanner;

import java.util.Scanner;

public class C10_Calısma {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen isminizi GİRİNİZ");

        String isim=scan.nextLine();
        System.out.println("İSMİNİZ:"+isim);




        System.out.println("LÜTFEN İLK SAYIYI GİRİNİZ");

        int s1=scan.nextInt();



        System.out.println("lütfen ikinci sayıyı giriniz");
        int s2=scan.nextInt();

        System.out.println("İKİ SAYININ ÇARPIMI:"+s1*s2);







    }
}
