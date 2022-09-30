package Z;

public class DoktorBilgileri {



    //ınstance variablelarımızı olusturuyoruz
    //bu alan bızım kalıphanemız
String isim;
String soyisim;
int yas;
String brans;

    public DoktorBilgileri() {
    }

    @Override
    public String toString() {
        return "DoktorBilgileri{" +
                "\nisim='" + isim + '\'' +
                "\n soyisim='" + soyisim + '\'' +
                "\n yas=" + yas +
                "\n brans='" + brans + '\'' ;
    }

    public DoktorBilgileri(String isim, String soyisim, String brans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.brans = brans;
    }

    public DoktorBilgileri(String isim, String soyisim, int yas, String brans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;

/* bazi durumlarda constructor içinden baska bir constructor cagirmamız gerekebılır
bunun için thıs.(parametre) kullanılır

sag tus-->generate-->constructor--> istedıgımız parametreleri seciyoruz.
 */




    }
}
