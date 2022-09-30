package day03_scanner;

import java.util.Scanner;

public class C11_Calısma2 {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);


        System.out.println("LÜTFEN ADINIZI GİRİNİZ");
        String isim2=scan.nextLine();


        System.out.println("lütfen soyadınızı giriniz");
        String soyisim=scan.next();


        System.out.println("lütfen yasınızı giriniz");
        double yas=scan.nextDouble();


        System.out.println("GİRİLEN BİLGİLER:" +isim2+","+soyisim+","+yas);








    }
}
