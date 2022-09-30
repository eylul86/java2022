package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Arrays {
    public static void main(String[] args) {

          /*
        icinde 200 tane 1000'den kucuk pozitif tamsayi olan bir list olusturun
        kullanicidan bir sayi isteyip
        listede var olup olmadigini kullaniciya yazalim
         */
        Random rnd=new Random();
        int sayi=0;
        List<Integer> sayiListesi=new ArrayList<>();
        while(sayiListesi.size()<200){
            sayi= rnd.nextInt(1000);
            if (!sayiListesi.contains(sayi)){
                sayiListesi.add(sayi);
            }
        }
        System.out.println(sayiListesi);

        boolean bildiMi=false;
        int tahminSayisi=1;
        Scanner scan=new Scanner(System.in);
        while (!bildiMi){
            System.out.println("lütfen sayi tahmininde bulunun");
            sayi=scan.nextInt();
            if (sayiListesi.contains(sayi)){
                System.out.println("tebrikler"+" "+tahminSayisi+" "+ "adet tahminde listeden  bulundunz");


                bildiMi=true;

            }else{
                System.out.println(tahminSayisi+"  "+"adet tahminde bulundunz ama hıc bırı listede yok");


           tahminSayisi++;
            }



        }


    }
}