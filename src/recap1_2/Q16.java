package recap1_2;

import java.util.Scanner;

public class Q16 {

    public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime girin");
        String input= scan.next();
if(input.length()>=3){
    System.out.println(input.substring(input.length()-2)+input.substring(input.length()-2)+input.substring(input.length()-2));
}else
    System.out.println(input);




    }
}
/*
 * Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
 * iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
 *
 * ornek
 * input = Ali
 * output = lilili
 *
 * input = el
 * output = el
 */
