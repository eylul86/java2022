package day05_matematikselIşlemler;

import java.util.Scanner;

public class C03_Modulus {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        System.out.println("LÜTFEN 4 BASAMAKLI POZİTİF BİR TAM SAYI GİRİNİZ");

        int sayi=scan.nextInt();// 5267


        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

                //suanda sayımız 5267  bb=0  rakam top=0

        birlerBasamagi=sayi%10; //  7
        rakamlarToplami += birlerBasamagi;  //  artık 7 oldu
        sayi/=10;    //10 a bol sayıya ata

        //suanda sayı 526  bb 7  rt  7

        birlerBasamagi=sayi%10;  // 6 oldu

        rakamlarToplami += birlerBasamagi;   //7+6
        sayi/=10;

        //suanda sayı 52 oldu

        birlerBasamagi=sayi%10;  // 2 oldu
        rakamlarToplami+=birlerBasamagi;   //7+6+2

        sayi/=10;   //5

        //suanda sayı 5 bb 2 rakamlar toplm 15

        birlerBasamagi=sayi%10;  //5

        rakamlarToplami+=birlerBasamagi;  //7+6+2+5

        sayi/=10;   //0

        //suanda sayı 0 bb 5   rt 20  bitti

        System.out.println(ilkGirilenSayi + "," +"SAYISININ RAKAMLAR TOPLAMI:"+ rakamlarToplami);







    }
}
