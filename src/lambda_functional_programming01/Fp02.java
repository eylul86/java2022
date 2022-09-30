package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp02 {
    /*
1)  t-> "Logic" , (t, u)-> "Logic"
    Bu yapıya "Lambda Expession"
2) Functional Programming kapsamında "Lambda Expession" kullanılabilir ama önerilmez.
   "Lambda Expession" yerine "Method Reference" tercih edilir.
3) "Method Reference" kullanımı "Class Name :: Method Name"

   Aynı zamanda kendi class'larınızı da kullanabilirsiniz.
   Örneğin bir Animal class'ınız var ve bu class "eat()" methoduna sahip ==> "Animal :: eat"
 */

//1) Ardışık list elemanlarını aynı satırda aralarında boşluk
   //     bırakarak yazdıran bir method oluşturun.(Functional ve method reference)

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(8);
        liste.add(9);
        liste.add(131);
        liste.add(10);
        liste.add(9);
        liste.add(10);
        liste.add(2);
        liste.add(8);
        System.out.println(liste);//[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        ciftListElemanlariYazdirFunctional(liste);
        System.out.println();
        tekListElemanlarinKareleriniYazdirFunctional(liste);
        System.out.println();
        tekListElemanlarinkupunuYazdirFunctional(liste);
        System.out.println();
        tekrarsizCftElemanlarinKareToplamiYazdir(liste);

        tekrarsizCftElemanlarinKareToplamiYazdir2(liste);
        tekrarsizCiftElemanlarinKuplerininCarpimi(liste);
        getMaxEleman(liste);
        yedidenBuyukCiftMin(liste);
        tersSıralamaTekrarsız(liste);



    }
public static void listElemanlariniYazdirFunctional(List<Integer> liste) {
    liste.stream().forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //2)Ardışık çift list elementlerini aynı satırda aralarında boşluk
    // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void ciftListElemanlariYazdirFunctional(List<Integer> liste) {

        liste.stream().filter(Utils::ciftElemanlariSec).forEach(Utils::ayniSatirdaBosluklaYazdir);




}

//3) Ardışık tek list elemanlarının karelerini aynı satırda aralarında boşluk
   // bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekListElemanlarinKareleriniYazdirFunctional(List<Integer> liste) {

        liste.stream().filter(Utils::tekElemanlariSec).map(Utils::karesiniAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }
    //4) Ardışık tek list elemanlarının küplerini tekrarsız olarak aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.



    public static void tekListElemanlarinkupunuYazdirFunctional(List<Integer> liste) {

        liste.stream().distinct().filter(Utils::tekElemanlariSec).map(Utils::kupunuiAl).forEach(Utils::ayniSatirdaBosluklaYazdir);

    }

    //5) Tekrarsız çift elemanların karelerinin toplamını hesaplayan bir method oluşturun.

    public static void  tekrarsizCftElemanlarinKareToplamiYazdir(List<Integer> list){




        Integer tp=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Math::addExact);
        System.out.println(tp);

    }
    public static void  tekrarsizCftElemanlarinKareToplamiYazdir2(List<Integer> list){




        Integer tp=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::karesiniAl).reduce(0,Integer::sum);
        System.out.println(tp);

}
    public static void tekrarsizCiftElemanlarinKuplerininCarpimi(List<Integer> list){


        Integer carpp=list.stream().distinct().filter(Utils::ciftElemanlariSec).map(Utils::kupunuiAl).reduce(1,Math::multiplyExact);
        System.out.println("carpp = " + carpp);
    }

public static void getMaxEleman(List<Integer> list){
//7) List elemanları arasından en büyük değeri bulan bir method oluşturun.


       Integer maxx= list.stream().distinct().reduce(Math::max).get();
    System.out.println("maxx = " + maxx);
}
//9) List elemanları arasından 7'den büyük, çift, en küçük değeri bulan bir method oluşturun.

    public static void yedidenBuyukCiftMin(List<Integer>list){
;
    Integer yedi=    list.stream().distinct().filter(t->t>7).filter(Utils::ciftElemanlariSec).reduce(Math::min).get();
        System.out.println("yedi = " + yedi);


    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun.

    public  static void tersSıralamaTekrarsız(List<Integer>list){

        List<Double>sonuc=list.stream().distinct().filter(t->t>5).map(Utils::yarisiniAl).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);


    }


}