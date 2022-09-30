package day47_Maps;

import day46_Maps.ReusableMethod;

import java.util.Map;

public class C01_DununTekrari {
    public static void main(String[] args) {




        Map <Integer,String> sinifListMap = ReusableMethod.mapOlustur();
        System.out.println(sinifListMap);


        //ogrenci listesini isim soyisim yazdır

        ReusableMethod.tumValueSiraliYazdir(sinifListMap);

        //kac farklı brans varsa brasismi=brastakiogrenci sayı

ReusableMethod.bransOgrencisayisiYazdir(sinifListMap);
    }
}
