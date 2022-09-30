package day03_scanner;

import java.util.Scanner;

public class C08_ScannerIlkHarf {
    public static void main(String[] args) {
        // kullanıcıdan ısmını alıp ilk harfını buyuk harf yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen isminizi giriniz");

       // next.char yoktr bunun yerine STRİNG OLARAK ILK KELIMEYI ALIP ONUNDA ILK HARFINI ALABILIRIZ





        char ilkHarf=scan.next().toUpperCase().charAt(0);
        System.out.println("ismin ilk harfi:"+ilkHarf);



    }
}
