package day38_Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {


    public static void main(String[] args) {


/*
marketteki tum urunleri bir array de tuttugumuzu varsayalim
kullaniciya index sorup, o index deki urunu yazdiran bir program hazirlayalim
kullanici urun sayisindan buyuk bir index girerse
exception vermesinin onune gecelim
 */




    String []urunler={"nutella","cokokrem","süt","cay","findık"};

        Scanner scanner=new Scanner(System.in);
        System.out.println("istedıgınız urunun sıra no gırınız");


        int istenenSira=0;

        try {

             istenenSira=scanner.nextInt();
        } catch ( InputMismatchException deneme) {
            System.out.println("ürün index için bir tam sayı gırmenız gereklı" );
        }
        System.out.println("aradıgınız urun:"+urunler[istenenSira-1]);




        try {
            System.out.println("Aradiginiz urun : " + urunler[istenenSira-1] );
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Girdiginiz sira listemizde bulunmuyor" +
                    "\nSira numarasi en fazla : " + urunler.length  + " olabilir" );

        }







  /*
         catch blogunun onundeki parantezde
         exception class'inin ismi ve yaninda
         yakalanan exception'i atadigimiz variable'in ismi olur (e)
         Eger yakalanan exception ile ilgili bilgileri
         kullaniciya vermek isterseniz
         bu objeyi kullanabilirsiniz
         eger exception ile ilgili kullaniciya bilgi verme ihtiyaci yoksa
         e kullanilmasa da kod calisir
         */

}}


