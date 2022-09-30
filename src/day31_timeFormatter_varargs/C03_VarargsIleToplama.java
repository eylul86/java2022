package day31_timeFormatter_varargs;

public class C03_VarargsIleToplama {

    public static void main(String[] args) {


        //verilen 2 int i toplayıp sonucu yazdıran bır method


        int sayi1=10;
        int sayi2=20;
        int sayi3=30;
        int sayi4=40;
        int sayi5=50;



        ToplaYazdir(sayi1, sayi2,sayi3,sayi4,sayi5);
        ToplaYazdir(sayi1, sayi2,sayi3,sayi4);
        ToplaYazdir(sayi1, sayi2,sayi3);
        ToplaYazdir(sayi1, sayi2);


    }
public static void ToplaYazdir(int... sayi){

        /*
        int... sayi bu gösterim int variablelardan olusan varargs demekktır.
        array alt yapısını kullanır

         */
    int toplam=0;
    int sayiAdedi=sayi.length;


    for (int each:sayi
         ) {
        toplam+=each;
    }
    System.out.println("gilen sayi adedi: "+sayiAdedi+ " toplam:"+toplam);
    }

}
