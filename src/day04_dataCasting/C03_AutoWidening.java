package day04_dataCasting;

public class C03_AutoWidening {
    public static void main(String[] args) {


        byte sayi1=23;
        short sayi2=55;
        int sayi3=sayi1+sayi2; //78
        double sayi4=sayi1*sayi2; //1265.0



        sayi4=(double) sayi2/sayi1;   //2.391

        System.out.println(sayi4);

        //önce işlem sonra atama   double 2.31  2 olrak görur

         //sayı 4 un yanına double yazarsak sayı 2 yı double yaptık
        // kusuratlı verir.

        // dar veri turundeki bır degeri geniş veri türündeki veriable a otomatik
        //olarak assing eder



        byte num1=15;
        short num2=30;
        int num3=55;
        float num4=100f;
        double num5=12.5;


        num1=15;
        num2=num1;
        num3=num2;
        num4=num3;
        num5=num4;
        System.out.println("num5:"+num5);


        int deger1=10;
        float deger2=15;

        System.out.println(deger1+deger2);

       // SORU2 //int veri turunde bır degıskenı adım adım narrowıng yapın
        int rakam=130;
        short rakam2=(short) rakam;
        System.out.println(rakam2);
        byte rakam3=(byte)rakam2;
        System.out.println(rakam3);







        //SORU 4 DOUBLE 255.36

        double rak1=255.36;
        int rak2=(int)rak1;
        System.out.println("RAK2:" +rak2);


        byte rak3=(byte)rak2;

        System.out.println("RAK3:"+ rak3);







        //SORU5
          int dal1=12;
          int dal2=5;

        System.out.println(dal1/dal2);

        //  SORU 6  İNT/DOUBLE
        int sal1=80;
double sal2=12.4;
        System.out.println(sal1/sal2);



    }
}
