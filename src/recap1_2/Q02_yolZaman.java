package recap1_2;

import java.util.Scanner;

public class Q02_yolZaman {
    public static void main(String[] args) {

/*  Problem Tanımı
        Mesafeyi ve hızı alıp süreyi hesaplayan bir kod yazınız.
        Örneğin:İstanbul ile Ankara arası 400km olarak ölçülmektedir. Bu yolu ortalama
        120 km/saat hızla giden bir araç ne kadar sürede hedefe varır?
        Örnek Ekran Çıktısı
        Mesafeyi giriniz: 400
        Hızı giriniz: 100
        Süre 4 saattir.
     */

        Scanner scanner = new Scanner(System.in);
        System.out.println("gıdecegınız yol mesafesi(km)");
        double yol=scanner.nextDouble();
        System.out.println("ortalama hızınız (km/sa)");
        double ortHız= scanner.nextDouble();
        double varısSuresi=yol/ortHız;
        System.out.println("varısSuresi: " + varısSuresi);

        scanner.close();
    }
}
