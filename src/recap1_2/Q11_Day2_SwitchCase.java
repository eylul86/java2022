package recap1_2;

import java.util.Scanner;

public class Q11_Day2_SwitchCase {
    public static void main(String[] args) {


// Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        Scanner scan= new Scanner(System.in);
        System.out.println("3 basamaklı bır sayı gırınız");
        int sayi=scan.nextInt();
//  ..................birler......
        int birlerBas=sayi%10, onlar=(sayi/10)%10,yuzler=sayi/100;
        if (sayi>99 && sayi<1000){
        switch (yuzler) {
            case 0:
                System.out.println("");
                break;
            case 1:
                System.out.println("yüz\t");
                break;
            case 2:
                System.out.println("ikiyüz\t");
                break;
            case 3:
                System.out.println("ucyüz\t");
                break;
            case 4:
                System.out.println("dortyüz\t");
                break;
            case 5:
                System.out.println("besyüz\t");
                break;
            case 6:
                System.out.println("altıyüz\t");
                break;
            case 7:
                System.out.println("yediyüz\t");
                break;
            case 8:
                System.out.println("sekızyüz\t");
                break;
            case 9:
                System.out.println("dokuzyüz\t");
                break;
        }
            switch (onlar){
                case 0: System.out.println(""); break;
                case 1: System.out.println("on\t"); break;
                case 2: System.out.println("yirmi\t"); break;
                case 3: System.out.println("otuz\t"); break;
                case 4: System.out.println("kırk\t"); break;
                case 5: System.out.println("elli\t"); break;
                case 6: System.out.println("altmıs\t"); break;
                case 7: System.out.println("yetmıs\t"); break;
                case 8: System.out.println("seksen\t"); break;
                case 9: System.out.println("doksan\t"); break;

            }
            switch (birlerBas){
                case 0: System.out.println(""); break;
                case 1: System.out.println("bir"); break;
                case 2: System.out.println("iki"); break;
                case 3: System.out.println("uc"); break;
                case 4: System.out.println("dört"); break;
                case 5: System.out.println("beş"); break;
                case 6: System.out.println("altı"); break;
                case 7: System.out.println("yedi"); break;
                case 8: System.out.println("sekiz"); break;
                case 9: System.out.println("dokuz"); break;














        }
    }
}}
