package day12_stringManipulatıon;

import java.util.Scanner;

public class C09 {
    public static void main(String[] args) {

        /* Soru 8
        Kullanicidan 4 basamakli bir sayi girmesini isteyin.Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise "5'e bolunen tek sayi" yazdirin
        Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin"yazdirin
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen 4 basamaklı bir sayi giriniz");

        double sayi=scan.nextDouble();

        //eger ternary içindeki sonuclar farklı data turlerindeyse atama
        //yapamayız sadece yazdirilir

        System.out.println(sayi%5==0 ? "SAYI 5'e bolunen sayıDIR":"tekrar deneyin");





/* Soru 9
        Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
        10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
          olsun*/

       int  fiyat= scan.nextInt();
     String sonuc1=((fiyat<10)? ("ucuz") :((fiyat>=10 && fiyat<20)? "normal"  :  "pahali"));


       System.out.println(sonuc1);

       /* 5 satir'a Scanner scan=new Scanner(System.in) koymalisiniz
        7. satir sonucu bize String veriyor int atama yapmissiniz
        7.satir ikinci parantez icini yanlis isaretleme var soruda 10 ile 20 arasi normal
        20 ve 20 den buyuk dedigi icin  fiyat>= && fiyat <20 olmali ki 10 girince "normal" 20 girince "pahali" versin
        bu sekilde bi denersen calisir gibi hocam:))*/






    }
}
