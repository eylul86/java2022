package day03_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan ismini soy ısmını yasını alıp girilen bılgıler=buket özdemir 35


        Scanner scan=new Scanner(System.in);
        System.out.println("LUTFEN İSMİNİZİ GİRİNİZ");
        String isim=scan.nextLine();

        System.out.println("lutfen SOYADINIZI girin");
        String soyisim=scan.nextLine();

        System.out.println("lutfen yaşınızı girin");
        double yas= scan.nextDouble();

        System.out.println("GİRİLEN BİLGİER= "+isim+","+soyisim+","+yas);




    }
}
