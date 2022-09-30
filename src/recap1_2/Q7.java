package recap1_2;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {


/*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen boyunuzu cm degerinde yazar mısınz?");
        double boy=scan.nextDouble()/100.0; //boyu metreye cevırdık
        System.out.println("lütfen kilonuzu kg degerinde yazar mısınz");
       double kg=scan.nextDouble();

       double bmi=kg/(boy*boy);

       if (bmi<=20) {
           System.out.println("oldukça zayıfsınız");
       } else if (bmi<=25) {
           System.out.println("nırmal sınırlardasınız");
       }else if (bmi<=30) {
           System.out.println("sisman katagoridesınız");
       }else if (bmi>30) {

           System.out.println("obez grubundasınız");
       }

       }}



