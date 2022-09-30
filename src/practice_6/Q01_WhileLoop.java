package practice_6;

import java.util.Scanner;

public class Q01_WhileLoop {

    // girilen sayının basamaklarındaki rakamların toplamını bulunuz.

    public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz");
int sayi=scanner.nextInt();

basamakToplam(sayi);
        System.out.println(basamakToplam(sayi));





    }

    public static int basamakToplam(int sayi) {
 int toplam = 0;
 while (sayi!=0){

     toplam+=sayi%10;
     sayi/=10;

 }

 return toplam;
    }


}
