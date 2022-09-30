package day37;

public class EToyota extends DAraba{



        void  marka(){

            System.out.println("markamız toyota");

        }


    /*
    Private method'lar override edilemez
    Eger Child class'da parent class'daki private method ile
    ayni signature'da bir method olusturursaniz
    bu overridding method OLMAZ
   */
void motor(){

    System.out.println("toyota araclar toyota marka motor kullanır");



 /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir
          @Override notasyonu kullanmak mecburi degildir
          Eger Overridding method silinirse, kodun CTE vermesini istersek
          @Override notasyonu kullanmaliyiz
         */

}
    }

