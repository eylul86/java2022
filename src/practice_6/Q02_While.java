package practice_6;

import java.util.Scanner;

public class Q02_While {
   /*
    Girilen bir sayıya kadar olan sayılardan sadece
     tek olanlarını ekrana yazdırınız.
    girilen sayı dahil
  */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen sayı giriniz:");
        int sayi=scanner.nextInt();


int sayac=0;
while (sayi>0){
    if(sayi%2==1){

        System.out.println("sayi = " + sayi);
   sayac++;


    }
    sayi--;
}

        System.out.println("sayac = " + sayac);






    }


}
