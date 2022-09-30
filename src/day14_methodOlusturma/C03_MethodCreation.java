package day14_methodOlusturma;

public class C03_MethodCreation {


    public static void main(String[] args) {
        // input olarak verılen isim ve soyısmı
        //ilk harfı buyuk gerıye kalsan yıldız
     //   I***** K**** şeklınde yazdıran bır method


        String isim="Enes";
        String soyisim="Bozkurt";
        ismiGizle(isim,soyisim);

    }

    public static void ismiGizle(String isim, String soyisim) {

        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");
        System.out.println(isim+" "+soyisim);

    }


}

