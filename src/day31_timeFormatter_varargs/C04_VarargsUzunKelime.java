package day31_timeFormatter_varargs;

public class C04_VarargsUzunKelime {


    public static void main(String[] args) {

        enUzunKelimeyiYazdir("Ayse","Ali","Fatma","Süreyya");



    }

    public static void enUzunKelimeyiYazdir(String...kelime) {

        String uzunKelime=kelime[0];


        for (String each : kelime
        ) {


    if (each.length()>uzunKelime.length()){
        uzunKelime=each;

    }
            }
        System.out.println("uzunKelime = " + uzunKelime);
        }


    }

