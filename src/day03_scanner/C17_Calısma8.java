package day03_scanner;

import java.util.Scanner;

public class C17_Calısma8 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen dikdörtgenin uzunluk degerini giriniz");
        int uzun=scan.nextInt();

        System.out.println("lutfen dikdöertgenin genişlik degerini giriniz");
        int genis=scan.nextInt();
        System.out.println("lütfen dikdörtgenin yüksekliğini giriniz");
        int yuksek=scan.nextInt();

        System.out.println("dikdöertgenin hacmi:"+(uzun*genis*yuksek));




    }




}
