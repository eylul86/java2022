package day08_IfElse;

import java.util.Scanner;

public class C05_NestedIfElse {
    public static void main(String[] args) {


        /* Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        Eger ilk harf buyuk harf ise “A” olup olmadigini kontrol edin. Ilk harf A ise  “Gecerli Sifre”  degilse “Gecersiz Sifre” yazdirin.
           Eger ilk harf kucuk harf ise “z” olup
           olmadigini kontrol edin.
            Ilk harf z ise  “Gecerli Sifre”
             degilse “Gecersiz Sifre” yazdirin.
        */

        //ilk harf buyuk mu kucuk mu
        // ilk harf a mı z mı

        Scanner scan=new Scanner(System.in);

        System.out.println("lutfen sifre giriniz");
        String sifre=scan.next();
       char ilkHarf=sifre.charAt(0);

        if(ilkHarf>='A' && ilkHarf<='Z' ) { //ilk harf buyuk harf

       if( ilkHarf=='A' ) {
           System.out.println("geçerli şifre");
       }else{
           System.out.println("gecersiz sifre");

       }


        } else if( ilkHarf>='a' && ilkHarf<='z' ){ //ilk harf kucuk
            if( ilkHarf=='z' ) {
                System.out.println("geçerli şifre");
            }else{
                System.out.println("gecersiz sifre");
            }


        } else{
            System.out.println("LÜTFEN İLK KARAKTER İÇİN SADECE HARF KULLANIN");
        }


    }
}
