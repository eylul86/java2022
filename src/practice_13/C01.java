package practice_13;

import java.util.Scanner;

public class C01 {
/*  soru1: Check if the integer is an Armstrong numbers to 4 digit
numbers(4 digit-> exclusive)
    Armstrong sayi:herhangi bir 3 basamakli sayinin rakamlarinin kupleri
     toplami o sayiyi veriyorsa sayi  Armstrong sayidir
        (0, 1, 153, 370, 371, 407)
        153 = 1*1*1 + 5*5*5 + 3*3*3 = 153
        370 = 3*3*3 + 7*7*7 + 0*0*0 = 370

     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayi giriniz: ");
        int sayi = scanner.nextInt();


        armstrongKontrol(sayi);
        girilenSayiyaKadar(sayi);



    }

    private static void girilenSayiyaKadar(int sayi) {


        for (int i = 1; i <=sayi ; i++) {
            armstrongKontrol(i);

        }
    }

    private static void armstrongKontrol(int sayi) {
        int sayininKuplerToplami=0;
        int basamakSayi=0;
        int girilenSayi=sayi;

        while (sayi>0) {

            basamakSayi=sayi%10; //rakam rakam ayırdık
            sayininKuplerToplami+=(basamakSayi*basamakSayi*basamakSayi);
            sayi=sayi/10;


        }
if(girilenSayi==sayininKuplerToplami){
    System.out.println("girilenSayi armstrong sayıdır = " + girilenSayi);
}else System.out.println("girilenSayi armstrong sayı degıldır = " + girilenSayi);



       /* soru2: Birden baslayarak girilen sayıya kadar her bir tamsayının
        amstrong sayı olup olmadıgını
        gösteren program yazınız*/






    }

}
