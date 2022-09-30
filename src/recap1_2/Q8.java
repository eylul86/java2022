package recap1_2;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {


/*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 ve 50 kilodan agir ise kan bagisi yapabilir.
 */

        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen yaşınızı giriniz");
       int yas= scanner.nextInt();

        System.out.println("lütfen kilonuzu giriniz");
     int kilo= scanner.nextInt();

     if( yas<18) {
         System.out.println("yaşı 18 den kucuk olanlar kan bagısı yapamaz");
     }else if( yas>=18){
         if( kilo<50) {
             System.out.println("kılonuz 50den kucuk oldugu ıcın kan bagısı yapamasınız");
         }else if( kilo>=50) {
             System.out.println("kan bagısı yapabılırsınız");

         }else {
             System.out.println("yanlıs deger girdınız");

             System.out.println("yasinizi giriniz :");
             int yas1 = scanner.nextInt();
             System.out.println("kilonuzu giriniz :");
             int kilo1 = scanner.nextInt();
             if (yas1 > 0 && yas1 < 18) {
                 System.out.println("yasi 18 den kucuk olanlar kan bagisi yapamaz");
             } else if (yas1 >= 18) {
                 if (kilo1 > 0 && kilo1 < 50) {
                     System.out.println("kilonuz 50 den kucuk oldugu icin kan bagisi yapamazsiniz");
                 } else {
                     System.out.println("kan bagisi yapabilirsiniz");
                 }
             }
         }}}}




