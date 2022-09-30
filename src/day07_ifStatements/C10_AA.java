package day07_ifStatements;

import java.util.Scanner;

public class C10_AA {
    public static void main(String[] args) {


         Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen notunuzu rakamsal olarak giriniz:");
        int not = scan.nextInt();
        if (not >= 90 && not <= 100) {

            System.out.println("Notunuz : \"A\" - \"Çok İyi\" ");
        } else if (not >= 80 && not < 90) {

            System.out.println("Notunuz : \"B\" - \"İyi\" ");

        } else if (not >= 70 && not < 80) {
            System.out.println("Notunuz : \"C\" - \"Orta\" ");
        } else if (not >= 60 && not < 70) {
            System.out.println("Notunuz : \"D\" - \"Geçer\" ");
        } else if (not >= 0 && not < 60) {
            System.out.println("Notunuz : \"F\" - \"Kaldın, seneye yine bekleriz\" ");
        } else
            System.out.println("Lütfen geçerli bir değer giriniz");


    }
}

