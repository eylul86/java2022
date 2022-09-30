package day31_timeFormatter_varargs;

public class C02_Varargs {


    public static void main(String[] args) {

        //verilen 2 int i toplayıp sonucu yazdıran bır method


        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;

      ToplaYazdir(sayi1, sayi2,sayi3,sayi4);



    }

    public static void ToplaYazdir(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println(" verilen 4 sayının toplamı:"+(sayi1+sayi2+sayi3+sayi4));


    }

    public static void ToplaYazdir(int sayi1, int sayi2, int sayi3) {
        System.out.println(" verilen 3 sayının toplamı:"+(sayi1+sayi2+sayi3));

    }

    public static void ToplaYazdir(int sayi1, int sayi2) {
        System.out.println(" verilen 2 sayının toplamı:"+(sayi1+sayi2));
    }
}
