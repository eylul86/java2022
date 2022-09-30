package practice_6;

import java.util.Scanner;

public class Q03_doWhile {
/*
Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
ve x girildiğinde ise "Program bitti" yazan programı yazınız.
*/
public static void main(String[] args) {


    Scanner abc = new Scanner(System.in);
String okunan="";





do {
    System.out.println("lütfen harf giriniz:");
   okunan = abc.next();
    System.out.println("program çalısıyor");

}while(!okunan.equalsIgnoreCase("x"));


    System.out.println("program bitti");

}

}
