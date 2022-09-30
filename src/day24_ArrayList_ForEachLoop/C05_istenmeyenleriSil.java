package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_istenmeyenleriSil {
    public static void main(String[] args) {

// Soru 4) Verilen bir array'de istenmeyen harf iceren kelimeleri silip,
// kalan elementleri yeni bir array yapin

        String[] sehirler={"istanbul","ankara","mersin","konya","kastamonu"};
        String istenmeyenHarf="r";
        List<String>kalan=new ArrayList<>();
        for (int i = 0; i <sehirler.length ; i++) {

            if (!sehirler[i].contains(istenmeyenHarf)){
                kalan.add(sehirler[i]);

            }

        }
//loop bıttıgınde istenmeyen harf içermeyen sehirler listeye eklencek
        System.out.println(kalan);


        //yeni bir array olustrup listeyi aktar   //tekrar edelim

        String[]kalanlarArrays = new String[kalan.size()];
        for (int i = 0; i < kalanlarArrays.length ; i++) {

            kalanlarArrays[i]=kalan.get(i);

        }

        //sehirler arrayının yeni degerini ata
        sehirler=kalanlarArrays;

        System.out.println("sehirler Arrayinin son hali:"+ Arrays.toString(sehirler));


    }
}
