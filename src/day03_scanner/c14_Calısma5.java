package day03_scanner;

import java.util.Scanner;

public class c14_Calısma5 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("birinci sayıyı giriniz");
int sayi1= scan.nextInt();
        System.out.println("birinci sayı:"+sayi1);

        System.out.println("ikinci sayıyı giriniz");
        int sayi2=scan.nextInt();
        System.out.println("ikinci sayi:"+sayi2);


        System.out.println("sayıların toplamı:"+(sayi1+sayi2));
        System.out.println("sayıların çarpımı"+(sayi1*sayi2));
        System.out.println("sayıların farkı"+(sayi1-sayi2));



    }


}
