package day21_Arrays;

import java.util.Arrays;

public class C08_BinarySearch {
    public static void main(String[] args) {


        /* javada elaman aramanın kısa yoludur ancak calısması için
        önce arry ın sıralı hale getırılmesı gerekır.
        eger sıralama yapmadan bınary search yaparsınız.
        sonucu bulamayabılır yada yanlıs bulur

         */



    String[] harflar={"y" ,"b","d", "g", "o","a"};

    String arananHarf="a";
        Arrays.binarySearch(harflar,arananHarf);

     //binarysearch bize aradıgımız elemanın index donduurur

        System.out.println(Arrays.binarySearch(harflar,arananHarf));


        Arrays.sort(harflar);

        System.out.println(Arrays.toString(harflar));
        System.out.println(Arrays.binarySearch(harflar,arananHarf));
        System.out.println(C03_ArraysContains.contains(harflar,arananHarf));

    }
}
//bulamayınca - deger verir index