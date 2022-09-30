package day07_ifStatements;

import java.util.Scanner;

public class C07_IfElseIfStatements {

    public static void main(String[] args) {

        //bir önceki soruda kullanıcı negatıf deger girerse uyaralım


        Scanner scan = new Scanner(System.in);

        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ");

        int yas = scan.nextInt();

        if (yas < 0) {

            System.out.println("lütfen gecerli bir yas yazını");
        } else if (yas<65) {
            System.out.println("Emekli olamazssin + " + (65-yas) + " yıl daha calısmalısın");


        } else {
            System.out.println("Emekli olabiirsin");
        }

    }
}

/* birden fazla if else if baglanmıssa son durum onemlıdır
eger else ile bitiyorsa butun ihtimaller kapsanıyor demektır ama
else if ile bitiyorsa kapsanmayan durumlar olabılır

 */