package recap1_2;

import java.util.Scanner;

public class Q03_boyKilo {
    public static void main(String[] args) {


          /*
         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
         ORNEK:
         INPUT      : Kilo: 71
                      Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23
             */

        Scanner sc=new Scanner(System.in);
        System.out.println("kilogram olarak agırlıgınızı gırın");
        double agirlik=sc.nextDouble();
        System.out.println("lütfen boyunuzu giriniz");
        double boy=sc.nextDouble();
        boy=boy/100;

        double vke=agirlik/(boy*boy);
        System.out.println("vke: " + vke);

    }
}
