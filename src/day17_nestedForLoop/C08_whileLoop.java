package day17_nestedForLoop;

import java.util.Scanner;

public class C08_whileLoop {
    public static void main(String[] args) {

        /* kullanıcıdan toplanmak uzere sayılar alın
        sayıların toplamı 500 u gecınce
        sayıların toplamını ve kac sayı tplandıgını
        13 sayı gırdınız toplamları 567
         */


        int toplam=0;
                int sayi=0;
        int sayac=0;
        Scanner scan=new Scanner(System.in);


        while (toplam<500){
            System.out.println("lütfen toplamak ıcın sayı gırin");
            sayi=scan.nextInt();
            toplam+=sayi;
           sayac++;
        }
        System.out.println(sayac + "sayı girdınız ve toplamları:"+toplam);
    }
}
