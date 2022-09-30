package day09_ternary;

import java.util.Scanner;

public class C05_Switch_Keys {

    public static void main(String[] args) {


        /*kullanıcıdan gun numarasını alıp
        1 ise pazartesi
        ...
        7 ise pazar yazdıralım
         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kacinci gun oldugunu giriniz");
        int gunNo=scan.nextInt();
/*
switch yanına yazılan () neye göere case atayacagımızı gosterir.
break yazmak gerekıyor bıtmesi için
 */


switch (gunNo) {
    case 1:
        System.out.println("pazartesi");
        break;
    case 2:
        System.out.println("sali");
        break;
    case 3:
        System.out.println("carsamba");
        break;
    case 4:
        System.out.println("persembe");
        break;
    case 5:
        System.out.println("cuma");
        break;
    case 6:
        System.out.println("cumartesi");
        break;
    case 7:
        System.out.println("pazar");
        break;
    default:
        System.out.println("GEÇERLİ GÜN NUMARASI GİRİNİZ");


        //if   else if... else yapısında oldugu gıbı hıc bır sarta uymayanları
    //defoult keyboard kullanılor

}


    }
}
