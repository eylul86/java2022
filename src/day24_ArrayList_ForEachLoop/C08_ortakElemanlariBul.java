package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_ortakElemanlariBul {
    public static void main(String[] args) {
      /*  Soru 3:
        iki String array olusturunuz ve bu array’lerdeki ortak elemanlari For
        each loop
        kullanarak bulunuz. Sonucu ekrana yazdirini
         Ortak eleman yoksa ekrana “Ortak eleman yok” yazdiriniz
       */

String[] arr={"Ali","Veli","Can"};
        String[] arr2={"Ali","Hasan","Ayse","Enes"};

        List<String> ortakisim=new ArrayList<>();


        for (String each:arr
             ) {
            for (String each2:arr2
            ){

                if (each.equalsIgnoreCase(each2)){
                    ortakisim.add(each);

            }


            }

        }

        System.out.println("ortakisim = " + ortakisim);

if (ortakisim.isEmpty()){
            System.out.println("hiç ortak eleman yok");

        }else{
            System.out.println(ortakisim);

        }
    }
}
