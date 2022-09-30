package day18_whileDoWhile;

import java.util.Scanner;

public class C04_DoWhileLoop {

    public static void main(String[] args) {

        /* kullanıcıdan tam sayılar alın kullanıcı cıft sayı gırdıgı muddetce
        sayıları yazdırın tek sayı girdıgınde işlemi bıtır.
         */

        //while ile


        Scanner scan = new Scanner(System.in);
        int sayi = 0;


        while (sayi % 2 == 0) {

            System.out.println("lütfen bir sayi giriniz");

            sayi = scan.nextInt();

            if (sayi % 2 == 0) {

                System.out.println("girilen sayı cift:" + sayi);

            } else {
                System.out.println("girilen sayı tek, benden bu kadar:)");
            }

            // do while loop ile yapalim;
            // do while'loop'da onceden olusturulan variable'a hangi deger atandiginin
            // hic bir onemi yok, kodumuz her durumda calisir
        /*
          do-while'in dezavantaji :
          ilk calistirma kontrol yapilmadan oldugu icin
          loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir
         */
            do{
                System.out.println("Lutfen bir sayi giriniz");
                sayi=scan.nextInt();
                if (sayi%2==0){
                    System.out.println("Girilen sayi cift : " + sayi);
                }else{
                    System.out.println("Girilen sayi tek, benden bu kadar");
                }
            }while(sayi%2==0);
        }
    }











}


