package day38_Exception;

public class C02_Exceptıon {

    public static void main(String[] args) {
        int a= 1000;
        int b= 50;
        int sayac = 1;
        while(sayac<100){
        /*
        try blogu yapmaya calistigimiz ama risk oldugunu dusundugumuz
                  islemleri yazmak icin kullanilir
        catch'den sonraki parantez karsilasmayi bekledigimiz exception
                  turunu Javaya soylemek icin kullanilir
        catch blogu  : Java'ya soyledigimiz exception(isnisnai durum) gerceklesirse
                   Java'nin yapmasini istedigimiz islem

                   catch blogunun onundeki paranteze karsılasmayı bekledıgımız
                   exceptıonu yazabılır veya her turlu exceptıonda devreye gırmesını ıstıyorsak
                   tum exceptıonların parent olan exception yazabılırız'
         */
            try {
                System.out.println(a/b);
            } catch (ArithmeticException e) {
                System.out.println("payda 0 oldu, dikkatli ol");
            }
            b--;
            sayac++;
        }
    }
}
