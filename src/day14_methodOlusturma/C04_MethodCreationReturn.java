package day14_methodOlusturma;

public class C04_MethodCreationReturn {




    //verilen ısım ve soy ısmı ılk harfı buyuk gerıye kalnları yıldız olacak sekılde
    //degıstırıp bıze bu halını donduren bır method olusturun.
    //not: programın ilerleyen kısımlarında ısım ve soyısmı bu sekılde kullanmakm ıstıyoruz

    public static void main(String[] args) {

        String isim="Enes";
        String soyisim="Bozkurt";


String gizliIsim=isimGizle(isim,soyisim);
        System.out.println(isim+" "+soyisim);
        System.out.println(gizliIsim);

    }

    public static String isimGizle(String isim, String soyisim) {


        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).replaceAll("\\w","*");


        return isim+" "+soyisim;
    }


}
