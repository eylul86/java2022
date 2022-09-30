package practice_10.okul_proje;

public class OgretmenBilgileri {


    String isim;
    String soyisim;
    int yas;
    String brans;
    String tel;

    @Override
    public String toString() {
        return "OgretmenBilgileri{" +
                "\nisim='" + isim + '\'' +
                ", \nsoyisim='" + soyisim + '\'' +
                ", \nyas=" + yas +
                ",\n brans='" + brans + '\'' +
                ", \ntel='" + tel + '\'' ;
    }

    public OgretmenBilgileri() {
    }

    public OgretmenBilgileri(String isim, String soyisim, int yas, String brans, String tel) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.yas = yas;
        this.brans = brans;
        this.tel = tel;








    }}





