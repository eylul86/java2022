package practice_5;

import java.util.Scanner;

public class Q01 {


    /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */


    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz : ");
       String harf=scan.next().toLowerCase();
       String sesliHarfler="aeiou";
       String sessizHarfler=" bcdfghjklmnprstxvwyz";

       if(harf.length()==1){
           for (int i = 0; i <sesliHarfler.length(); i++) {

               if(sesliHarfler.contains(harf)){
                   System.out.println("sesli harf");
                   break;
               }else if(sessizHarfler.contains(harf)){
                   System.out.println("sessiz harf");
                   break;
               }else{
                   System.out.println("yanlış karakter girdiniz");
                   break;
               }


           }
       }else System.out.println("tek karakter giriniz");








    }

}
