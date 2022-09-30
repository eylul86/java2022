package day07_ifStatements;

import java.util.Scanner;

public class C08_B {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen 0-100 ARASI sınav notunu giriniz");


        int not = scan.nextInt();

        if (not < 0) {

            System.out.println("lütfen gecerli bir not yazınız");

        } else if (not < 50) {
            System.out.println("D");

        }else if (not < 60) {
            System.out.println("C");
        }else if (not < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");




            }


        }}









