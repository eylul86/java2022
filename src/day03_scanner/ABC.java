package day03_scanner;

import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen tam bir sayi giriniz");

      double sayi= scanner.nextInt();

        System.out.println("karenin alanı"+(sayi*sayi));
        System.out.println("karenin kenar toplamı"+(sayi*4));
    }
}
