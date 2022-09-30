package grupCalısması;

import java.util.Scanner;

public class CarpimTablo2 {

    public static void main(String[] args) {

        /*kullanıcıdan  bır rakam alın ve bu rakam
         ıcın carpım tablosunu ekrana yazdırın*/


        Scanner scan = new Scanner(System.in);
        System.out.println("ÇARPIM TABLOSUNU İSTEDİĞİNİZ RAKAMI GİRİN");

        int sayi = scan.nextInt();

        for (int i = sayi; i <= sayi; i++) {
            for (int j = 1; j <= 10; j++) {

                System.out.println(i + "*" + j + "=" + (i * j));

            }

        }
    }
}