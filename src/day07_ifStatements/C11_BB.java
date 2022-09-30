package day07_ifStatements;

import java.util.Scanner;

public class C11_BB {

    public static void main(String[] args) {

        Scanner scan=new Scanner (System.in);
        System.out.println("0'dan 100'e KADAR LÜTFEN SINAV NOTUNU GİRİNİZ");
        int not= scan.nextInt();

        if (not>=0 && not<50){
            System.out.println("D");

        }else if (not>=50 && not<60){
            System.out.println("C");


        }else if (not >=60 && not < 80) {
            System.out.println("B");

        } else if (not >=80 && not <=100){
            System.out.println("A");











    }
}}
