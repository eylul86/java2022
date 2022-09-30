package recap1_2;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {


        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation method kullanarak birlestiriniz.
//yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("String1:" );
        String str1=scan.nextLine();

        System.out.println("String2:");
        String str2=scan.nextLine();

        System.out.println("1. yöntem:"+str1+" "+str2);

        System.out.println("2.yöntem:"+str1.concat(" ")+str2);


        String str1_0indextenSonrası=str1.substring(1);
        String str2_0indextenSonrasİ=str2.substring(1);
        System.out.println("manipulation sonrası:"+str1_0indextenSonrası+ " "+str2_0indextenSonrasİ);
    }

}
