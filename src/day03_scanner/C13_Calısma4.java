package day03_scanner;

import java.util.Scanner;

public class C13_Calısma4 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN İSMİNİZİ GİRİNİZ");


        char harf=scan.next().toUpperCase().charAt(0);

        System.out.println("İSMİNİZİN İLK HARFİ:"+harf);


    }
}
