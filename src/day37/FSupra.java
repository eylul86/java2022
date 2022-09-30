package day37;

public class FSupra extends EToyota {


    void  yakit(){
        System.out.println("supra benzin kullanır");





    }

    @Override
    void motor() {

    }
}

  /*
          @Override notasyonu Javaya bir gorev verir
          Java, bu notasyonla birbirine bagli olan iki method'u
          surekli kontrol eder
          Eger parent class'daki overridden method'u silerseniz
          CTE verir

          @Override notasyonu kullanmak mecburı degıldır

          eger overridding method sılınırse kodun cte vermesını istersek
          @Override notasyonu kullanmalıyız
         */