package practice_6;

import java.util.Scanner;

public class Q04_doWhile {
     /*
Ask user to enter a word. If the word has odd number of characters
 and has 3 or more characters,
 print the character in the middle of the word.
 the word has even number of character print "You entered wrong word."
     INPUT      :   celik
     OUTPUT    :   l
     INPUT      :   elif
     OUTPUT    :   You entered wrong word.*/

    /*Kullanıcıdan bir kelime girmesini isteyin. Kelimenin tek sayıda karakteri varsa
  ve 3 veya daha fazla karaktere sahip,
  karakteri kelimenin ortasına yazdırın.
  kelime çift sayıda karakter baskısına sahip "Yanlış kelime girdiniz."*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String word = "";
        do {
            System.out.println("lütfen kelime giriniz:");
            word = scanner.nextLine();
            if (word.length() < 3) {
                System.out.println("girilen kelıme 3 karakterden az");
            }
            if (word.length() % 2 == 1 && word.length() >= 3) {

                System.out.println("ortadakı karater:" + word.charAt(word.length() / 2));
            }else{

                System.out.println("yanlıs kelıme girdiniz");
            }
        }while (!(word.length() % 2 == 1 && word.length() >= 3));






    }


    }

