package day21_Arrays;

import java.util.Arrays;

public class C05_ArrayaElementEkleme {
    public static void main(String[] args) {

     //   Soru 5- Verilen bir array’e yeni bir element ekleyin

      //  Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun



        String[] sinifListesi={"ALİCAN","merve","hatice"};
        String eklenecekIsim="buket özdemir";


        sinifListesi=elemanEkle(sinifListesi,eklenecekIsim);

        System.out.println(Arrays.toString(sinifListesi));

    }

    public static String[] elemanEkle(String[] sinifListesi, String eklenecekIsim) {



        String[] yeniSinifListesi=new String[sinifListesi.length+1];
//eskı lısteden bır elamn fazla uzunlıklta array olustrduk

        for (int i = 0; i <sinifListesi.length ; i++) {
            yeniSinifListesi[i]=sinifListesi[i];

        }
//eskı lısteyı yenı lısteye tasıdık son ındex eklenecek lısteyı atadık
        yeniSinifListesi[yeniSinifListesi.length-1]=eklenecekIsim;
//son ındex e eklenecek lısteyı atadık
        return yeniSinifListesi;
    }
}
