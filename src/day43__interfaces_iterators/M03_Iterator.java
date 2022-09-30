package day43__interfaces_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class M03_Iterator {

    public static void main(String[] args) {


        List<Integer> liste=new ArrayList<>();
        liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println(liste);

//index kullanmadan 3 artırın
        for (Integer each : liste
        ){
            each+=3;

            System.out.println(each+"");
        }
        System.out.println(liste); //[10, 20, 30]


        Iterator it1=liste.iterator();
        System.out.print(it1.next()+" ");  //10
        System.out.print(it1.next()+" ");//20
        System.out.print(it1.next());//30
      //  System.out.print(it1.next()); 30 dan sonra eleman kalmadıgından rte verir

        //ıteratorde gerı donus yok adım adım sona ulastıktan sonra
        // basa gelmek ıstersek yenıden bır ıteraror olusturmamız gerek

        Iterator it2=liste.iterator();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        it2.next();
        it2.remove();
        System.out.println(liste); //iterator ıle elementlerı remove yapınca lıste kalıcı olarak degıstı

liste.add(10);
        liste.add(20);
        liste.add(30);
        System.out.println("yeniden liste : "+liste);
    Iterator it3= liste.iterator();
        while(it3.hasNext()){
        it3.next();
        it3.remove();
    }
        System.out.println("loop'dan sonra liste : "+liste);
        /*
         Goruldugu gibi Iterator kullanarak yapabildigim
         1- tum collection elementlerini yazdirmak
         2- tum collection elementlerini silmek
         Bu da bize yetmez
         */
}
}