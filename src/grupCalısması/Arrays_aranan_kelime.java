package grupCalısması;

import java.util.Scanner;

import static day21_Arrays.C03_ArraysContains.contains;

public class Arrays_aranan_kelime {
    public static void main(String[] args) {

String [] isimler={"buket","sevil","süm","fatma"};

Scanner scan = new Scanner(System.in);
        System.out.println("aradığınız ismi yazınız");
        String arananIsim=scan.nextLine();

boolean sonuc=containss(isimler,arananIsim);

if (sonuc){
    System.out.println("girilen isim listede var");

}else
    System.out.println("girilen isim yok");

    }



    private static boolean containss(String[] isimler, String arananIsim) {

        boolean methodSonuc = false;

        for (int i = 0; i <isimler.length; i++){

            if(isimler[i].equalsIgnoreCase(arananIsim)) {
                methodSonuc=true;
            }

        }


   return methodSonuc;
    }
}
