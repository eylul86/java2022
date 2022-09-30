package day09_ternary;

import java.util.Scanner;

public class C07_Calisma {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir sayı girişi yapınız");
        int sayi2=scan.nextInt();

        System.out.println(sayi2>0 ? "sayi pozitif":"sayi negatif");

        int num1 = 9;
        int num2 = num1++;
        if (num2 < 10) {
            System.out.println(num2 + " Hello World");
        } else {
            System.out.println(num1 + " Hello Universel");
        }
        int x = 2;
        System.out.println(x > 2 ? (x < 4 ? 10 : 8) : 7);




        final char a = 'A', d = 'D'; // final keyword variable'in son degerini belirler
        char grade = 'B';
        switch (grade) {
            case a:
            case 'B':
                System.out.print("great");
            case 'C':
                System.out.print("good");
                break;
            case d:
            case 'F':
                System.out.print("not good");











    }
}}
