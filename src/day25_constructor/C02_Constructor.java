package day25_constructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class C02_Constructor {
    public static void main(String[] args) {




        C01 obj1=new C01();

        System.out.println(obj1.sayi);//0
        obj1.deneme();

    /*    1- Obje olusturmak icin constructor kullanmak zorundayiz
        2- Constructor'da parametre ile ozellikleri belirlemezsek, java standart bir obje olusturur

        3- Her class'da gormesek bile Java'nin koydugu default constructor vardir
*/



        System.out.println(obj1.sayi); // 0
        obj1.deneme(); // C01 den deneme method calisir


        Scanner scan = new Scanner(System.in);
        Random rnd= new Random();


    }}

    // class adi  objenin adi     keyword    constructor



    // List<String> list2=new List<>();
        /*
        Javada bir obje olusturabilmek icin
        mutlaka constructor kullanmalisiniz
     */