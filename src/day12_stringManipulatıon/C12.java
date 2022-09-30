package day12_stringManipulatıon;

import java.util.Scanner;

public class C12 {
    public static void main(String[] args) {

         /* Soru 1
        double 255.36 sayini int'a ve sonra da olusturdugunuz int sayiyi byte'a cevirip yazdirin
         */
        double sayi=255.36;
        sayi=(int)255.36;
        System.out.println(sayi);
        sayi=(byte)255.36;
        System.out.println(sayi);
        System.out.println("******Soru 1 Cevabi******");

         /* Soru 2
        Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadiginiz yazdirin
         */
       Scanner harf= new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz : ");
        char karakter=harf.next().toUpperCase().charAt(0);
        if (karakter>='a' && karakter<='z' || karakter>='A' && karakter<='Z'){
            System.out.println("Girdiginiz karakter bir harftir");
        }else System.out.println("Girdiginiz karakter harf degildir");
        System.out.println("******Soru 2 Cevabi******");

          /* Soru 3
        Kullanicidan iki sayi isteyin, sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
        sayilarin ikisi de negative ise sayilarin carpimini yazdirin, sayilarin ikisi farkli isaretlere sahipse
        "farkli isaretlerde sayilarda islem yapamazsin" yazdirin,
        satilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
         */
Scanner scan2 = new Scanner(System.in);
        System.out.println("Lutfen iki tam sayi giriniz");
        System.out.print("Birinci tamsayi :");
        int tamsayi1=scan2.nextInt();
        System.out.print("Ikinci tamsayi :");
        int tamsayi2=scan2.nextInt();
        if (tamsayi1>0 && tamsayi2>0){
            System.out.println("Sayilarin toplami : " + (tamsayi1+tamsayi2));
        }else if (tamsayi1<0 && tamsayi2<0){
            System.out.println("Sayilarin carpimi : " + (tamsayi1*tamsayi2));
        }else if(tamsayi1<0 && tamsayi2>0 || tamsayi2<0 && tamsayi1>0){
            System.out.println("farkli isaretlerde sayilarda islem yapamazsin");
        }else System.out.println("sifir carpmaya gore yutan elemandir");
       System.out.println("******Soru 3 Cevabi******");

        /* Soru 4
        Isminizi ve soyisminizi yazdirin sonra tersten yazdiriniz :)
         */
       String isimSoyisim="Emin Yuksel";
        System.out.println("Isim Soyisin Tersten :"+isimSoyisim.substring(10)+isimSoyisim.substring(9,10)+isimSoyisim.
                 substring(8,9)+isimSoyisim.substring(7,8)+isimSoyisim.substring(6,7)+isimSoyisim.substring(5,6)+
                 isimSoyisim.substring(4,5)+isimSoyisim.substring(3,4)+isimSoyisim.
                 substring(2,3)+isimSoyisim.substring(1,2)+isimSoyisim.substring(0,1));
        System.out.println("******Soru 4 Cevabi******");

        /* Soru 5
        Kullanicidan 100 uzerinden notunu isteyin.Not'u harf sistemine cevirip yazdirin.
        50'den kucukse "D",50-60 arasi "C",60-80 arasi "B", 80'nin uzerinde ise "A"
         */
       Scanner scan3=new Scanner(System.in);
        System.out.print("Lutfen 100 uzerinden notunuzu giriniz : ");
        int not =scan3.nextInt();
        if (not>=80 && not <=100){
            System.out.println("Notunuz : \'A\'");
        }else if (not>=60){
            System.out.println("Notunuz : \'B\'");
        }else if (not>=50){
            System.out.println("Notunuz : \'C\'");
        }else System.out.println("Notunuz : \'D\'");
        System.out.println("******Soru 5 Cevabi******");

        /* Soru 6
        Nested if kullanarak asagidaki soruyu cozen kodu yaziniz.
        Kullanicidan bir sifre girmesini isteyin
        eger ilk harfi buyuk harf ise "A" olup olmadigini kontrol edin.ILk harf A ise "Gecerli sifre"
        degilse "Gecersiz sifre" yazdirin
         */
      Scanner scan11=new Scanner(System.in);
        System.out.print("Lutfen sifrenizi giriniz : ");
        char sifre=scan11.next().charAt(0);
        if ( sifre>='A' || sifre<='Z'){
            if (sifre=='A') {
                System.out.println("Gecerli sifre");
            }else {
                System.out.println("Gecersiz sifre");
            }
        }else {
            System.out.println("Gecersiz sifre");
       }

        /* Soru 7
        Kullanicidan ismini alip basharfini ve son harfini buyuk harflerle yazdirin
         */
       Scanner scan5= new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz : ");
        String isim=scan5.nextLine();
        isim=isim.substring(0,1).toUpperCase()+isim.substring(isim.length()-1).toUpperCase();
        System.out.print("Isminizin ilk ve son harfi : "+isim);
        System.out.println("******Soru 7 Cevabi******");

        /* Soru 8
        Kullanicidan 4 basamakli bir sayi girmesini isteyin.Girdigi sayi 5'e bolunuyorsa son rakamini kontrol edin.
        Son rakami 0 ise "5'e bolunen tek sayi" yazdirin
        Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin"yazdirin
         */
        Scanner scan7=new Scanner(System.in);
        System.out.print("Lutfen 4 basamakli bir sayi giriniz : ");
        int sayi4=scan7.nextInt();
        if (sayi4%5==0){
            }  if (sayi4%10==0){
            System.out.println("5'e bolunen tek sayi");
        }else System.out.println("Tekrar deneyin");
        System.out.println("******Soru 8 Cevabi******");

        /* Soru 9
        Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
        10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
          olsun
         */
        int fiyat=9;
        String sonuc=fiyat< 10 ? "ucuz" : fiyat<=20 ? "normal" : "pahali" ;
        System.out.println(sonuc);
        System.out.println("******Soru 9 Cevabi******");

        /* Soru 10
        Kullancidan bir sayi alin ve sayinin mutlak degerini yazdirin
         */
       Scanner scan8=new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz : ");
        int sayi8= scan8.nextInt();
        System.out.println(sayi8>=0 ? sayi8 : (-1*sayi8) );
        System.out.println("******Soru 10 Cevabi******");

        /* Soru 11
        Kullanicidan bir cumle ve bir harf isteyin, harfin cumlede var olup olmadigini yazdirin
         */
       Scanner scan9=new Scanner(System.in);
        System.out.print("Lutfen bir cumle giriniz : ");
        String cumle=scan9.nextLine();
        System.out.print("Lutfen girdiginiz cumleden bir harf giriniz : ");
        String harf1=scan9.next().toLowerCase();
        if (cumle.contains(harf1)){
            System.out.println("girdiginiz harf cumlede var");
        }else System.out.println("girdiginiz harf cumlede yok");
        System.out.println("******Soru 11 Cevabi******");

        /* Soru 12
        String methodlarini kullanrak "Java ogrenmek123 cok guzel@ " ifadesini
        "Java ogrEnmEk Cok guzEl" yazdirin sonra
        "Jaza ogrenmek cok guzel" sekline getirin
         */
      String str="Java ogrenmek123 Cok guzel@ ";
        System.out.println(str);
        str=str.replaceAll("\\s","XX");
        System.out.println(str);
        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replaceAll("\\d","");
        str=str.trim();
        System.out.println(str);
        str=str.replace("ogrenmek"," ogrEnmEk ").
                replace("cok"," Cok").
                replace("guzel"," guzEl");
        System.out.println(str);
        str=str.replace("Java","Jaza").replace("ogrEnmEk","ogrenmek").
        replace("Cok","cok").replace("guzEl","guzel");
        str=str.replaceAll("\\W","");
        System.out.println(str);
        str=str.replace("XX"," ");
        // str=str.trim();
        System.out.println(str);
        System.out.println("******Soru 12 Cevabi******");

         /* Soru 13
        Kullanicidan isim ve soyismini isteyin ve hangisinin daha uzun oldugunu yazdirin
         */
        Scanner scan10=new Scanner(System.in);
        System.out.print("Lutfen isminizi giriniz :");
        String isim33=scan10.nextLine().toUpperCase();
        System.out.print("Lutfen soyisminizi giriniz :");
        String soyisim=scan10.nextLine().toUpperCase();
        if (isim33.length() < soyisim.length()){
            System.out.println("Soyisminiz isminizden uzundur : "+ soyisim);
        }else if( isim33.length() > soyisim.length() ){
            System.out.println("Isminiz soyisminizden uzundur : "+ isim33);
        }else System.out.println("Isminiz ve Soyismini'in uzunlugu esittir");
        System.out.println("******Soru 13 Cevabi******");

        /* Soru 14
        Kullanicidan bir tamsayi isteyin ve
        Sayi tekse  "Neyse nedir adim
                     Buyrun kimlige bakin
                     Bana yeryuvarin donmek icin ihtiyaci yok "
        Sayi ciftse "Sur ufle duymadim
                     Birsey mi dedin hacim
                     Ufak bir kiyamete itirazim yok " yazidirin. :)
         */
       Scanner scan12=new Scanner(System.in);
        System.out.print("Litfen bir tamsayi giriniz : ");
        int tamSayi=scan12.nextInt();
        if (tamSayi%2!=0){
            System.out.println("Neyse nedir adim\n" +
                    "Buyrun kimlige bakin\n" +
                    "Bana yeryuvarin donmek icin ihtiyaci yok");
        }else System.out.println("Sur ufle duymadim\n" +
                "Birsey mi dedin hacim\n" +
                "Ufak bir kiyamete itirazim yok");
        System.out.println("******Soru 14 Cevabi******");

        /* Soru 15
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin.
        Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
        ***lutfen switch case method'unu kullanarak cozunuz :)***
         */
        Scanner scan14=new Scanner(System.in);
        System.out.print("Lutfen is unvaniniza giriniz :");
        String jobTitle = scan14.nextLine().toLowerCase();
        switch (jobTitle){
            case "qa" :
                System.out.println("Unvanini : Quality Analyst" );
                break;
            case "dev" :
                System.out.println("Unvanini : Developer" );
                break;
            case "ba ":
                System.out.println("Unvanini : Business Analyst" );
                break;
            case "pm":
                System.out.println("Unvanini : Project Manager" );
                break;
            default:
                System.out.println("Yanlis giris yaptiniz lutfen tekrar deniyiniz");
           System.out.println("******Soru 15 Cevabi******");
        }

         /* Soru 16
          Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
          iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
          ornek
          input = Ali
          output = lilili
          input = el
          output = el
         */

         /*  Soru 17
        Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin
         ORNEK:
                 INPUT : #
                 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
         */
     Scanner scan17=new Scanner(System.in);
        System.out.print("Lutfen bir karakter giriniz : ");
        char karakter8=scan17.next().toLowerCase().charAt(0);
        System.out.println("Girdiginiz karakter'in ASCII degeri : " + 1*karakter8 );
        System.out.println("******Soru 16 Cevabi******");

            }
        }



