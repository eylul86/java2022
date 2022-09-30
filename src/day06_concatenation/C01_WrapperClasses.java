package day06_concatenation;

import java.util.Scanner;

public class C01_WrapperClasses {
    public static void main(String[] args) {

        String str="java ile hayat ne güzel";
        System.out.println(str.toUpperCase());//JAVA ILE HAYAT NE GÜZEL

        boolean guzelMİ=true;

        // boolean primitive oldugundan hazır method yok
        Boolean buGuzelMİ= true;
        buGuzelMİ.toString();


        System.out.println(Short.MAX_VALUE); //-32768
        System.out.println(Short.MIN_VALUE); //32767



        String ogrNO="123456";


        //kullanıcıdan bir şifre isteyin
        // eger şifre sadece rakamlardan olusuyorsa kabul etmeyelim

        Scanner scan=new Scanner(System.in);

        System.out.println("LÜTFEN 5 BASAMAKLI BİR ŞİFRE GİRİNİZ");

        String sifre=scan.nextLine();

        Integer sifreSayi=Integer.parseInt(sifre);
        System.out.println("girilen şifre"+ sifre);
        System.out.println("intiger şifre"+sifreSayi);

    }
}
