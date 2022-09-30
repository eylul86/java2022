package day25_constructor;

public class Car {

    /* bu class bızım kalıp hanemız bir araba olustrmak ıcın
    ıhtıyacımız olan varıable ve methodları bu calassta
    belirleriz sonra farklı classlarda araba olustrmamız
    gerekşrse bu clastn bır obje olusturup
    burada belirienen variable ve methodlara gore arab uretır
     */



    public String marka="marka belirtilmedi";
  public  String model="model belirtilmedi";
   public int yil;
   public int fiyat;


    public  void  benzinliArac(){

        System.out.println("bu araç benzinli motora sahiptir");
    }

    public void maxHiz(int hiz){
        System.out.println("bu araba max"+hiz+"km hız yapar");


    }
}
