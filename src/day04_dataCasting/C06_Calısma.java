package day04_dataCasting;

public class C06_Calısma {
    public static void main(String[] args) {
        /*
        Soru 1
        byte veri tipinde bir degisken olsturun, short,int,float ve double data tipinde birer
        degisken olusturup adim adim widening yapin ve yazdirin
         */
        byte sayi1=25;
        short sayi2=50;
        int sayi3=75;
        float sayi4=100f;
        double sayi5=12.5;
        sayi5=sayi4;
        System.out.println("sayi5 = " + sayi5);
        sayi4=sayi3;
        System.out.println("sayi4 = " + sayi4);
        sayi3=sayi2;
        System.out.println("sayi3 = " + sayi3);
        sayi2=sayi1;
        System.out.println("sayi2 = " + sayi2);
        System.out.println("********asagidan yukari Explicit narrowing********");


        byte emn1=25;
        short emn2=50;
        int emn3=75;
        float emn4=100f;
        double emn5=12.5;
        emn1=(byte) emn2;
        System.out.println("emn1 = " + emn1);
        emn2=(short) emn3;
        System.out.println("emn2 = " + emn2);
        emn3=(int) emn4;
        System.out.println("emn3 = " + emn3);
        emn4=(long)emn5;
        System.out.println("emn4 = " + emn4);
        System.out.println("******1.Soru Cevabi******");
        /* Soru 2
         int veri turunde bir degisken olusturun ve adim narrowing yapin ve yazdirin
         */



        int sayi6=250;
        byte sayi7=(byte) sayi6;
        System.out.println("sayi7 = " + sayi7); // -6 iki tur atar -1 degeri tur atarken harcar


        // Float data turunde bir variable olsturun ve yazdirin
        float sayi8 = 9000000f;
        System.out.println("sayi8 = " + sayi8);
        System.out.println("******2.Soru Cevabi******");





        /* Soru 3
        double 255.36 sayini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin
         */
        double sayi9=255.36;
        int sayi10=(int)sayi9;
        System.out.println("sayi10 = " + sayi10);



        byte sayi11=(byte)sayi10;
        System.out.println("sayi11 = " + sayi11);
        System.out.println("******3.Soru Cevabi******");







        /* Soru 4
        int 2 sayiyi birbirine boldurun ve sonucu yazdirin
         */
        int sayi12=125;
        int sayi13=7;
        System.out.println(sayi12/sayi13); // 17
        System.out.println("******4.Soru Cevabi******");

        /* Soru 5
         int bir sayiyi double bir sayiya bolun ve sonucu yazdirin
         */
        int sayi14=250;
        double sayi15=125.50;
        System.out.println(sayi14/sayi15); //1.9920318725099602
        System.out.println("******5.Soru Cevabi******");
        /* Soru 6
         Farkli data tipleri ile islem yapip, sonuclarini yazdiriniz
         */
        byte sayi16=126;
        int sayi17=10;
        System.out.println(sayi16/sayi17); // 12
        double sayi18=1;
        System.out.println(sayi18/sayi16); // 0.007936507936507936
        System.out.println("******6.Soru Cevabi******");
    }
}


