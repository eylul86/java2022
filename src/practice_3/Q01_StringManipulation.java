package practice_3;

import java.util.Scanner;

public class Q01_StringManipulation {

    /*
     * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
     *         Output : Cesaret insana sinirlarini ogretir.
     *
     */




    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("CÜMLE OLUŞTURMAK İÇİN BİRİNCİ KELİMEYİ GİRİNİZ");
        String str1= scan.next();
        System.out.println("CÜMLE OLUŞTURMAK İÇİN BİRİNCİ KELİMEYİ GİRİNİZ");
        String str2= scan.next();
        System.out.println("CÜMLE OLUŞTURMAK İÇİN BİRİNCİ KELİMEYİ GİRİNİZ");
        String str3= scan.next();
        System.out.println("CÜMLE OLUŞTURMAK İÇİN BİRİNCİ KELİMEYİ GİRİNİZ");
        String str4= scan.next();

        System.out.println(str1.substring(0,1).toUpperCase()+str1.substring(1)+
                " "+str2+" "+str3+" "+str4 + ".");



    }



}
