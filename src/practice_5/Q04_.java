package practice_5;

import java.util.Scanner;

public class Q04_ {

    /*
    Interview Question
Write a Java program to reverse a string.
 Use for loop and create a method called
 reverseString
 Mülakat Sorusu
 Bir dizeyi tersine çevirmek için bir Java programı yazın.
 for döngüsü kullanın ve adında bir yöntem oluşturun
 tersDize
 */

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir string giriniz");
        String str=scan.nextLine();
        reverseString(str);

        System.out.println("string tersi:"+reverseString(str));
    }

    public static String reverseString(String str) {
        String reverse="";
        for (int i = str.length() - 1; i >= 0; i--)  {
            reverse+=str.charAt(i);
            
        }
        

        return reverse;
        
    }
}
