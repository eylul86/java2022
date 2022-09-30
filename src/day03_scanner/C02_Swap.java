package day03_scanner;

public class C02_Swap {
    public static void main(String[] args) {

        //verilen sayı 1 sayı 2 degerlerını degıstıren (swap) yazınız

//sayi=10  sayii2=20

        //kod calıstıktan sonra sayı1=20 sayı2=10


      int sayi1=10;
        int sayi2=20;
        int sayi3=0;

 // sayı3 gecici kova
 //adım 1 sayı 2 bos kovaya koy

 sayi3=sayi2;  // saayı1=10    sayı2=20   sayı3=20

 //adım2    1. sayıyı 2 .sayıya atıycaz

 sayi2=sayi1;     //sayi1 10 sayi2  10   sayi3  20

 //adım3  bos kovadakş sayıyı sayı 1 e atayalım

 sayi1=sayi3;   //  sayı1 20   sayı 2  10    sayı3  20


        System.out.println("swap'dan sonra sayi1:"+sayi1);
        System.out.println("swap'dan sonra sayı2:"+sayi2);




    }
}
