package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {


        Car car1=new Car();

        car1.fiyat=150000;
        car1.yil=2020;
        car1.marka="toyota";

        System.out.println("marka: " + car1.marka+"\n model: " + car1.model+"\n yil :"+ car1.yil+"\n fiyat: " + car1.fiyat);



Car car2 = new Car();

        System.out.println("marka: " + car2.marka+"\n model: " + car2.model+"\n yil :"+ car2.yil+"\n fiyat: " + car2.fiyat);

    }
}
   /*
        Herhangi bir obje uzerinden bir variable yazdirmaya calistigimizda
        Java degeri su siralama ile arar
        1- o obje olusturulduktan sonra bir deger atandi mi ?
        2- Objenin olusturuldugu class'da variable'a bir deger atanmis mi bakar
        3- O zaman data turune gore Java default degeri atar
         */
