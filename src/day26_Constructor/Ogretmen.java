package day26_Constructor;

import practice_12.Kisi;

public class Ogretmen extends Kisi {


    String isim="Isim belirtılmedi";
    String soyisim="Soyisim belirtılmedi";
    String dogumTarihi="tarih belirtılmedi";
    String brans="Brans belirtılmedi";
    String yanBrans="Yan Brans belirtılmedi";


    public Ogretmen() {
    }

    public Ogretmen(String isim, String soyisim, String dogumTarihi, String brans, String yanBrans) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yanBrans = yanBrans;

    }


    public Ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    public Ogretmen(String adSoyad, String kimliNo, int yas, String bolum, String sicilNo) {
    }

    @Override
    public String toString() {
        return
                "\nisim:" + isim +
                "\nsoyisim:" + soyisim +
                "\n dogumTarihi:" + dogumTarihi +
                "\n brans:" + brans +
                "\n yanBrans:" + yanBrans ;

    }
}
