package day07_ifStatements;

import java.util.Scanner;

public class C12_CC {


    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);



//Soru-8 Kullanicidan maas icin bir teklif isteyin ve asagidaki degerlere gore cevap yazdirin
// Teklif 80.000 uzerinde ise "Kabul ediyorum"
//60.000-80.000 arasinda ise "Konusabiliriz"
//60.000 nin altinda ise maalesef kabul edemem, yazdirin
//Scanner class indan scan objesi yukarida olusturulmustu
        System.out.println("Lutfen bir maas teklifi giriniz : ");
        int maasteklifi= scan.nextInt();
        if (maasteklifi<0){
            System.out.println("0 dan kucuk bir teklif yaptınız,yeniden değerlendiriniz");}
        else  if (maasteklifi>=80000) {
            System.out.println("Kabul ediyorum");}
        else if (maasteklifi>60000&&maasteklifi<80000||maasteklifi==60000){
            System.out.println("Konusabiliriz");}
        else { System.out.println("Maalesef kabul edemem ");}

    }

    }

