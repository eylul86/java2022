package Z;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class xxx {


    public static void main(String[] args) {


          /*
        ArrayList esnek olan bir arraydir.
         Bir array olustururken length en basta belirlemek zorundayız daha sonra degistiremeyiz.
         array'in uzunlugunu degistirmek ıstedıgımızde yeni bir array olusturmamız gerekir ama ArrayLİst de gerekmez..
yine aynı sekılde eleman silmek ıcın array da yeni bir array olusturmak gerekir Array list de gerekmez.

           array'i array yapan sembol [] idi
          arrayList de ise <> diamond(elmas) kullaniriz
         */




        //METHODLAR//

        List<String> isimler= new ArrayList<>();
        System.out.println(isimler); // []


        // bir list'e eleman eklemek istersek

        isimler.add("ALİ");
        isimler.add("VELİ");
        isimler.add("HASAN");

        System.out.println(isimler); //[ALİ, VELİ, HASAN]





        List<Integer> sayilar=new ArrayList<>();


        sayilar.add(1);
        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(4);
        System.out.println(sayilar); //[1,2,3,]

// add kullanırsak java SONA ekler

        sayilar.add(2,10);//index 2 olan yere 10 elementi ekleyelım

        System.out.println(sayilar);//[1,2,10,3]


        //ADD ALL//

      List<Integer> sayilar1=new ArrayList<>();

        sayilar1.add(1);
        sayilar1.add(2);
        sayilar1.add(3);

      List<Integer> sayilar2=new ArrayList<>();

        sayilar2.add(7);
        sayilar2.add(8);
        sayilar2.add(30);
        sayilar2.add(20);

        sayilar1.addAll(sayilar2);
        System.out.println(sayilar1); //[1,2,3,7,8,30,20]
//sayılar 1 i yazdırır sonuna sayılar 2 ekler...


        //GET//


        System.out.println( isimler.get(0));// ALİ
        System.out.println(sayilar1.get(1)); //2



        System.out.println("listenin boyutu:"+sayilar1.size()); //[1,2,3,7,8,30,20] SİZE 7

        sayilar1.add(2);
        sayilar1.addAll(sayilar1); //[1, 2, 3, 7, 8, 30, 20, 2
        System.out.println(sayilar1);//[1, 2, 3, 7, 8, 30, 20, 2, 1, 2, 3, 7, 8, 30, 20, 2]

        System.out.println("listenin boyutu:"+sayilar1.size());  //SON HALIN SIZE 16

        sayilar1.set(2,8);
        /*set method'u istenen index'deki
         eski elementi silip
        yerine verdigimiz yeni elementi set eder.*/


        System.out.println(sayilar1);//[1, 2, 8, 7, 8, 30, 20, 2, 1, 2, 3, 7, 8, 30, 20, 2]


        System.out.println(sayilar1.set(2,55)); //8
        System.out.println(sayilar1);

/*
eger eski elementi silmek istemiyorsak,   add(index, deger) method'unu kullanabiliriz

set() sildigi eski elementi de bize dondurur
 */



        List<String> kirtasiye=new ArrayList<>();
        kirtasiye.add("silgi");
        kirtasiye.add("cetvel");
         kirtasiye.add("kalem");
        kirtasiye.add("defter");


        System.out.println(kirtasiye);    //[silgi, cetvel, kalem, defter]
        System.out.println(kirtasiye.indexOf("cetvel")); // 1

 /*
         indexOf method'u bize bilgi donduren bir method'dur
         listemizi degistirmez
         */

        System.out.println(kirtasiye.lastIndexOf("kalem")); //2
        /*
         indexOf method'u urunu aramaya 0.index'den,
         lastIndexOf method'u ise aramaya son index'den baslar.
         arama bitip, urun bulundugunda,
         ikisi de bulunan urunun index'ini verir
         */
        kirtasiye.add("kalem");

        System.out.println(kirtasiye);  //[silgi, cetvel, kalem, defter, kalem]


        System.out.println(kirtasiye.lastIndexOf("kalem")); //4

        System.out.println(kirtasiye.indexOf("makas")); // -1
        System.out.println(kirtasiye.lastIndexOf("makas")); // -1

//olmayan urunlerı sordugumuzda -1 deger dondurur




        /*
         remove method'u iki sekilde kullanilir
         1- objeyi yazip silmesini istersek bize boolean sonuc doner true/false
         2- index girersek o index'deki elemani siler ve bize silinen elemani dondurur
         */
        System.out.println(kirtasiye);  //[silgi, cetvel, kalem, defter, kalem]
        System.out.println(kirtasiye.remove("defter")); // true
        System.out.println(kirtasiye); // [silgi, cetvel, kalem, kalem]
        System.out.println(kirtasiye.remove("makas")); // false


        // ikinci yontemi deneyelim yani index girelim
        System.out.println(kirtasiye.remove(1)); // cetvel
        System.out.println(kirtasiye); // [silgi, kalem, kalem]

        // olmayan bir indexi silmeye calisirsak ?
        // System.out.println(kirtasiye.remove(3));
        // IndexOutOfBoundsException uyarısı verir

        System.out.println(kirtasiye.contains("kalem")); // true  BİR ELEMANIN VAR OLUP OLMADIGINI KONTRL EDER
        System.out.println(kirtasiye.contains("kagit")); // false


        Collections.sort(kirtasiye);
        System.out.println(kirtasiye);  //[kalem, kalem, silgi]


        /*
         List ile gelen sort method'unda siralama ozelligini girmek gerekiyor
         bunun yerine Collections class'indan sort method'unu kullaniyoruz
         bu method listemizi natural order'a gore siralar
         */


        List<String> kirtasiye1=new ArrayList<>();
        kirtasiye1.add("silgi");
        kirtasiye1.add("cetvel");
        kirtasiye1.add("kalem");
        kirtasiye1.add("defter");


        List<String> kirtasiye2=new ArrayList<>();
        kirtasiye2.add("silgi");
        kirtasiye2.add("kalem");
        kirtasiye2.add("cetvel");
        kirtasiye2.add("defter");

        System.out.println(kirtasiye1.equals(kirtasiye2)); // false


        /*
        İKİ LİSTTEKİ AYNİ İNDEXTEKİ ELEMANLARIN
         AYNI OLUP OLMADIGINI KONTRL EDER
         */
        Collections.sort(kirtasiye1);
        Collections.sort(kirtasiye2);
        System.out.println(kirtasiye1.equals(kirtasiye2)); // true


        /*List ile calisirken en kotu ozelligi
        elemanlari tek tek eklemek
         */
        Integer[] arr= {2,3,5,6,8,4,2,6,9,0,1,3,6,4,2,7,0};
        /*
         bu kadar cok elemanli bir listeyi
         tek tek eleman olarak girmek yerine
         array olusturup, for loop ile
         olusturdugumuz list'e tasiyabiliriz
         */
        List<Integer> rakamlar= new ArrayList<>();
        for (int i = 0; i < arr.length ; i++) {
           rakamlar.add(arr[i]);
        }
        System.out.println(rakamlar); // [2, 3, 5, 6, 8, 4, 2, 6, 9, 0, 1, 3, 6, 4, 2, 7, 0]



        // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr1={2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

    List <Integer>tekrarli=new ArrayList<>();

        for (int i = 0; i <arr1.length-1 ; i++) {

            if (arr1[i]==arr[i+1] && !tekrarli.contains(arr[i])) {
                System.out.println(arr[i]);

                tekrarli.add(arr[i]);



            }




        }









    }
        }





