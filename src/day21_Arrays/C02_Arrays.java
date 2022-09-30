package day21_Arrays;

public class C02_Arrays {

    //Soru 2- Verilen String bir array’de
   // en uzun ve en kisa String’leri yazdiran bir method olusturun

    public static void main(String[] args) {

        String[]isimler={"erdal","onur","hayrulluah","mihrican"};

        enUzunEnKısa(isimler);




    }

    public static void enUzunEnKısa(String[] isimler) {
        String enUzunKelime=isimler[0];
        String enKisaKelime=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()>=enUzunKelime.length()){
                enUzunKelime=isimler[i];

            }
            if (isimler[i].length()<enKisaKelime.length()){
                enKisaKelime=isimler[i];

            }
        }
        System.out.println("arraydakı en uzun kelıme: "+enUzunKelime);
        System.out.println("arraydakı en kısa kelime: "+enKisaKelime);
    }


}
