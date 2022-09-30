package day09_ternary;

import java.util.Scanner;

public class C02_TernaryOperation {


    public static void main(String[] args) {


       // Soru4 ) Kullanicidan bir sayi alin.
        // Sayi pozitifse “Sayi pozitif” yazdirin, negatifse  sayinin karesini yazdirin


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");

        double sayi=scan.nextDouble();

        //eger ternary içindeki sonuclar farklı data turlerindeyse atama
        //yapamayız sadece yazdirilir
        System.out.println(sayi>0 ? "SAYI POZİTİF":(sayi*sayi));






    }
}
