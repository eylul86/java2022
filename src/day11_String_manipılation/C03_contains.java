package day11_String_manipılation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {

        /*Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
         @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gmail adresini giriniz");
        String email = scan.nextLine();
        if (!email.contains("@gmail.com")) {
            System.out.println("lütfen maıl adresınızı giriniz");

        } else if (email.lastIndexOf("@gmail.com") == (email.length() - 10)) {


        System.out.println("email adresiniz kaydedıldı");

}else
    System.out.println("lütfen yazımı kontrl edın");

}}


