package recap1_2;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {


        /*
         *  Kullanicidan alacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345  //(5 basamaklı sayı) 1+2  4+5   ılk ıkı sayı 1000 bolersek alırız  son ıkın  sayı 100 e bolumu
         *   output : 12
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("lütfen 5 basamklı sayıyı gırınız");
  int num=scan.nextInt();
  int ilkIki=num/1000;
  int sonIki=num%100; //100 e bol-umunden kalanı al
        int ilkIkiToplam=(ilkIki/10)+(ilkIki%10);
        int sonIkiToplam=( sonIki/10)+( sonIki%10);
        System.out.println("sayıların toplamı:"+(ilkIkiToplam+sonIkiToplam));

}}
