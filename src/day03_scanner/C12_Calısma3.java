package day03_scanner;

import java.util.Scanner;

public class C12_Calısma3 {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen adınızı memleketınızı ve plakasını giriniz  \n aralarda enter tuşuna basınız");




        String isim=scan.nextLine();

        String meml=scan.next();
        int plka=scan.nextInt();

        System.out.println("isminiz:"+isim+ "memleketıniz:"+meml+"plakanız:"+plka);



    }


}
