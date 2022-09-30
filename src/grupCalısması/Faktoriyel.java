package grupCalısması;

import java.util.Scanner;

public class Faktoriyel {
    public static void main(String[] args) {

       /* Soru 5 ) Interview Question
        Kullanicidan 10’dan kucuk bir tamsayi isteyin ve girilen
        sayinin faktoryel’ini bulun. (5!=5*4*3*2*1)   */



        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 10'dan küçük bir  tamsayi giriniz");
        int sayi= scan.nextInt();

        int faktoryel=1 ;  //carpilanlarin tutulcagi dongu   0 etkısız dıye 1 den baslatıyoruz

        for (int i = sayi; i >= 1; i--) {

            faktoryel*=i;   //faltorıyele i degerlerini çarpıp atıyor

        }
        System.out.println("girilen sayının faktiriyel'i = " + faktoryel);

    }
}
