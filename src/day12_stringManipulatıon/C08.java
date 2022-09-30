package day12_stringManipulatıon;

import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {


              /* Soru 4
        Isminizi ve soyisminizi yazdirin sonra tersten yazdiriniz :)
         */

        String input = "eylul";
        String tersInput = input.substring(4) + //T
                input.substring(3, 4) +
                input.substring(2, 3) +
                input.substring(1, 2) +
                input.substring(0, 1);

        System.out.println(tersInput);

 /* Soru 2
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadiginiz yazdirin
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bır karakter girin");


        String karakter = scan.next();
        char ilkHarf = karakter.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z' || (ilkHarf>='a' && ilkHarf<='z') ){

            System.out.println("GİRİLEN KARAKTER HARF");
        }else{
            System.out.println("GİRİLEN KARAKTER HARF DEGİLDİR");


            }
        }}