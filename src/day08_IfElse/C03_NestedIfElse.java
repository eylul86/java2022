package day08_IfElse;

import java.util.Scanner;

public class C03_NestedIfElse {


    public static void main(String[] args) {
        /* emeklılık kontrolu yapan bır program yazınız
        cinsiyet olarak e(erkek) k (kadın degıskenlerini kabul etsin
        farklı bır harf yada sembol girilirse hata versin

        emeklılık yas sınırı kadın 60 erkek 65
        negatif ve 80 den buyuk yas girilirse hata mesajı versin

       */


        Scanner scan=new Scanner(System.in);
        System.out.println("LÜTFEN  CİNSİYETİNİZİ YAZINIZ"+
                "\n KADIN İÇİN K ERKEK İÇİN E HARFİ GİRİNİZ");

        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("LÜTFEN YAŞINIZI GİRİNİZ");

        double yas=scan.nextDouble();

        if (cinsiyet=='E'){
            if (yas<0 || yas>80){
                System.out.println("gecerli yas giriniz");
            }else if(yas<65){
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }
        } else if (cinsiyet=='K'){
            if (yas<0 || yas>80){
                System.out.println("gecerli yas giriniz");
            }else if(yas<60){
                System.out.println("emekli olamazsin");
            }else {
                System.out.println("emekli olabilirsin");
            }
        }else {
            System.out.println("Lutfen gecerli bir tercih giriniz");
        }
    }}