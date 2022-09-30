package day21_Arrays;

import java.util.Scanner;

public class C03_ArraysContains {
    public static void main(String[] args) {


       // Soru 3- Verilen bir array’in istenen bir elemani icerip icermedigini
        // kontrol edip,
       // bize true veya false sonucu donen bir method olusturun.



String []isimler={"basak","nurullah","fatih","adem","enes"};

Scanner scan=new Scanner(System.in);
        System.out.println("Aradığınız ismi yazınız");
        String arananKelime=scan.nextLine();


        boolean sonuc=contains(isimler,arananKelime);
if(sonuc){
    System.out.println("girilen isim listede var");


    }else{
            System.out.println("girilen isim listede yok");
        }
    }


    public static boolean contains(String[] isimler, String arananKelime) {
        boolean sonucMethod=false;

        for (int i = 0; i <isimler.length ; i++) {

            if (isimler[i].equalsIgnoreCase(arananKelime)){
                sonucMethod=true;
            }

        }

        return sonucMethod;


    }
}
