package day12_stringManipulatıon;

import java.util.Scanner;

public class C13 {
    public static void main(String[] args) {
        /* Soru 8
        Kullanicidan 4 basamakli bir sayi girmesini isteyin.Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise "5'e bolunen tek sayi" yazdirin
        Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin"yazdirin
         */
  Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz : ");
        int sayi4=scan.nextInt();
        if (sayi4%5==0){
            }  if (sayi4%10==0){
            System.out.println("5'e bolunen tek sayi");
        }else System.out.println("Tekrar deneyin");
        System.out.println("******Soru 8 Cevabi******");






    }
}
