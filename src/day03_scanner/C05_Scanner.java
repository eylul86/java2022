package day03_scanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan 2 sayı alın bu sayıların carpımını yazdırın
        // scaner obje olustr

        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN İLK SAYIYI GİRİN");
        double sayi1= scan.nextDouble();

        //2.sayı icin 2 ve 3 adım tekrarla


        System.out.println("lutfen 2.sayıyı giriniz");
        double sayi2= scan.nextDouble();
        System.out.println("girilen sayıların carpımı:"+sayi1*sayi2);
    }
}
