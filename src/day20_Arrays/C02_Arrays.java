package day20_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C02_Arrays {


    public static void main(String[] args) {


        int sayilar[]=new int[3];


       // System.out.println(sayilar);  //[I@57829d67

        System.out.println(Arrays.toString(sayilar));  // [0,0,0]



        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;

     //   System.out.println(sayilar); // [I@57829d67

        System.out.println(Arrays.toString(sayilar));


String sinifList[]={"ALİ","AYSE","AHMET"};

        System.out.println(Arrays.toString(sinifList));


        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));






    }
}
