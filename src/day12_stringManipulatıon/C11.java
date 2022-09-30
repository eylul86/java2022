package day12_stringManipulatıon;

import java.util.Scanner;

public class C11 {
    public static void main(String[] args) {
        /*
        Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
        10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
        olsun*/


        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bır fiyat degeri giriniz");
        int  fiyat= scan.nextInt();

        String sonuc1=((fiyat<10)? ("ucuz") :((fiyat>=10 && fiyat<20)? "normal"  :  "pahali"));


        System.out.println(sonuc1);

        /* Soru 6
        Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        eger ilk harfi buyuk harf ise "A" olup olmadigini kontrol edin.ILk harf A ise "Gecerli sifre"
        degilse "Gecersiz sifre" yazdirin*/

        Scanner scan3=new Scanner(System.in);
        System.out.print("Lutfen sifrenizi giriniz : ");
        char sifre=scan3.next().charAt(0);

        if (sifre>='a' || sifre<='z' && sifre>='A' || sifre<='Z'){
            if (sifre=='A') {
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        }else {
            System.out.println("Gecersiz sifre");
        }




    }
}
