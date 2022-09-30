package practice_1_2;

import java.util.Scanner;

public class Q_07Converting {


    public static void main(String[] args) {

/*
    galonu litreye ceviren bir java programi yaziniz
        1 gallon = 3.785 litre
    litreyi galona ceviren bir java programi yaziniz
        1 litre = 1/3.785 gallon

    // Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren
     bir Java programı yazın.
    // formül
    // c = (f-32)*5/9
 */


int gallon=1000;
double litre=gallon*3.785;


String sonuc1=gallon+ "galon degeri" + litre + "litreye esittir";
        System.out.println(sonuc1);


int l=1000;
double G=1/3.785;
        System.out.println(l+"GALLON DEGERİ"+litre+"gallona esittir");
        //1000 lıtre degeri 2.64.2007 gallona esittir


        Scanner scan=new Scanner(System.in);

        System.out.println("fahrenhayt degerini giriniz");

      double fh=scan.nextDouble();

       // c = (f-32)*5/9


        System.out.println("Girdiginiz fahrenayt degeri : " + fh + " karsiligi " + (fh-32)*5/9 + " santigrat derecedir.");





    }
}
