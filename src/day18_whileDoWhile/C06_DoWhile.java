package day18_whileDoWhile;

import java.util.Scanner;

public class C06_DoWhile {

   /* Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin, islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
     “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
    */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

                int sayi=0;
                int pozitifAdet=0;
                int negatifSayi=0;
                int pozitifSayiTopl=0;


        do{
            System.out.println("lütfen toplamak uzere pozıtıf tam sayı gırınız");
            sayi=scan.nextInt();
            if(sayi>0) {
                pozitifSayiTopl+=sayi;
                pozitifAdet++;
            }else if(sayi<0){

                negatifSayi++;
                System.out.println("negatif sayı giremezsınız");
            }



        }while (sayi!=0);

        System.out.println(pozitifAdet+"adet pozıtıf sayı gırdınız,toplamları:"+pozitifSayiTopl);
        System.out.println(negatifSayi+"adet negatif sayı gırdınız ancak onlar toplama dahıl edılmedı");



    }

}
