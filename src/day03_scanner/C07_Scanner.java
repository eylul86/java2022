package day03_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {

        // bir önceki soruyu tek sacnner ile kullanıcıdan tum bılgılerı alarak yapınız

        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN İSMİNİZİ,SOYİSMİNİZİ,YAŞINIZI GİRİNİZ\n ARALARDA ENTER TUŞUNA BASINIZ");

       String isim=scan.nextLine();

       String soyisim=scan.next();
       int yas=scan.nextInt();



     System.out.println("GİRİLEN BİLGİLER:"+isim+","+soyisim+"," +yas);




    }
}
