package day31_timeFormatter_varargs;

public class C05_VarargsParametreIleKullanma {

    public static void main(String[] args) {

        enUzunKelimeyiYazdir(4,"Ayse","Ali","Fatma","Süreyya","Akin");



    }

    public static void enUzunKelimeyiYazdir(int kelimeSayisi, String...kelime) {

        String uzunKelime = kelime[0];


        for (String each : kelime
        ) {


            if (each.length() > uzunKelime.length()) {
                uzunKelime = each;

            }
        }
    }}
