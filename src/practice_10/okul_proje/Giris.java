package practice_10.okul_proje;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Giris {

   /*
    * ogretmen bilgilerini kullanicidan aliniz
    * aldiginiz bilgilerrden object ureterek yeni
     ogretmenler olusturun ve bilgilerini yazdirin
    */



    public static void main(String[] args) {

        System.out.println("hosgeldınız okulumuza");
        System.out.println("isim giriniz");
        Scanner scanner = new Scanner(System.in);
        String isim= scanner.nextLine();
        System.out.println("soyısım giriniz");
        String soyisim= scanner.nextLine();

        System.out.println("yasınızı giriniz");
        int yas= scanner.nextInt();

        System.out.println("brasınızı giriniz");
        String brans= scanner.next();

scanner.nextLine();
        System.out.println("tel no giriniz");
        String tel= scanner.nextLine();

practice_10.okul_proje.OgretmenBilgileri adayOgretmen=new practice_10.okul_proje.OgretmenBilgileri(isim,soyisim,yas,brans,tel);
        List<practice_10.okul_proje.OgretmenBilgileri>ogretmenList=new ArrayList<>();
        ogretmenList.add(adayOgretmen);
        System.out.println("ogretmenList = " + ogretmenList);




    }



}
