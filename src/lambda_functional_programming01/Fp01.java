package lambda_functional_programming01;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Fp01 {

    /*
    1) Lambda (Functional Programming) Java 8 ile kullanılmaya başlanmıştır.
2) Functional Programming'de "Ne yapılacak" (What to do) üzerine yoğunlaşılır.
   Structured Programming "Nasıl yapılacak" (How to do) üzerine yoğınlaşılır.
3) Functional Programming, Arrays ve Collections ile kullanılır.
4) "entrySet() methodu ile Map, Set'e dönüştürülerek Functional Programming'de kullanılabilir.
     */

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
        System.out.println(liste);  //[8, 9, 131, 10, 9, 10, 2, 8]
        listElemanlariniYazdirStructured(liste);
        System.out.println();
        listElemanlariniYazdirFunctional(liste);
        System.out.println();
        listCiftElemanlariYazdirStructured(liste);
        System.out.println();
        listCiftElemanlariniYazdirFunctional(liste);
        System.out.println();
        tekElemanlarinKareleriniYazdir(liste);
        System.out.println();
        tekElemanlarinKupleriniYazdir(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKareToplami(liste);
        System.out.println();
        tekrarsizCiftElemanlarinKupÇarpimi(liste);
        System.out.println();
        getMaxEleman(liste);
        getMaxEleman1(liste);
        yedidenBuyukCiftMinGet(liste);
        yedidenBuyukCiftMinGet2(liste);
        yedidenBuyukCiftMinGet3(liste);
        getTersSiralama(liste);

    }

//1) Ardışık list elementlerini aynı satırda
// aralarında boşluk bırakarak yazdıran
// bir method oluşturun.(Structured)

    public static void listElemanlariniYazdirStructured(List<Integer> list) {
        for (Integer w : list) {
            System.out.print(w + " ");


        }

    }

//1)Ardışık list elementlerini aynı satırda aralarında
    // boşluk bırakarak yazdıran bir method oluşturun.(Functional)


    public static void listElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().forEach(t -> System.out.print(t + " "));

        //strem methodu collectıondan elementlerı akısa dahıl etmek ıcın methodlara ulasmak ıcın

    }

//2)Ardışık çift list elementlerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Structured)

    public static void listCiftElemanlariYazdirStructured(List<Integer> list) {
        for (Integer w : list
        ) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }

        }

    }

    public static void listCiftElemanlariniYazdirFunctional(List<Integer> list) {

        list.stream().filter(t -> t % 2 == 0).forEach(t -> System.out.print(t + " "));


    }

// Ardışık tek list elementlerinin karelerini aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.(Functional)

    public static void tekElemanlarinKareleriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t).forEach(t -> System.out.print(t + " "));


    }
    //4) Ardışık tek list elementlerinin küplerini tekrarsız olarak aynı satırda aralarında boşluk bırakarak yazdıran bir method oluşturun.

    public static void tekElemanlarinKupleriniYazdir(List<Integer> list) {
        list.stream().filter(t -> t % 2 != 0).map(t -> t * t * t).distinct().forEach(t -> System.out.print(t + " "));
    }


    //5) Tekrarsız çift elementlerin karelerinin toplamını hesaplayan bir method oluşturun.


    public static void tekrarsizCiftElemanlarinKareToplami(List<Integer> list) {


        Integer toplam = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t).reduce(0, (t, u) -> t + u);
        System.out.print(toplam);


    }


//6) Tekrarsız çift elemanların küpünün
// çarpımını hesaplayan bir method oluşturun.


    public static void tekrarsizCiftElemanlarinKupÇarpimi(List<Integer> list) {

        Integer carp = list.stream().distinct().filter(t -> t % 2 == 0).map(t -> t * t * t).reduce(1, (t, u) -> t * u);
        System.out.println(carp);

    }

    //7) List elemanları arasından en büyük değeri bulan bir method oluşturun.
//1.yol
    public static void getMaxEleman(List<Integer> list) {

        Integer max = list.stream().distinct().reduce(Integer.MIN_VALUE, (t, u) -> t > u ? t : u);
        System.out.println(max);
    }

    //2.yol
    public static void getMaxEleman1(List<Integer> list) {
 Integer max1=list.stream().distinct().sorted().reduce(Integer.MIN_VALUE, (t, u) ->u);
        System.out.println("max1 = " + max1);
    }
//Ödev
    //8)List elemanları arasından en küçük değeri bulan bir method oluşturun.(2 Yol ile)
public  static void minValue( List<Integer> list) {
    Integer min = list.stream().distinct().reduce(list.get(0), (t, u) -> t < u ? t : u);
    System.out.print("min = " + min);
//9) List elemanları arasından 7'den büyük, çift,
// en küçük değeri bulan bir method oluşturun.
//1.yol
}
public static void yedidenBuyukCiftMinGet(List<Integer> list){


Integer yedi=list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t>7).reduce(Integer.MAX_VALUE,(t, u)->t<u ?t:u);
    System.out.println(yedi);
    }
//2.yol
public static void yedidenBuyukCiftMinGet2(List<Integer> list){


      Integer urr = list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t>7).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
    System.out.println("urr = " + urr);
    }

    public static void yedidenBuyukCiftMinGet3(List<Integer> list){

        Integer minn=list.stream().distinct().filter(t -> t % 2 == 0).filter(t -> t>7).sorted().findFirst().get();
        System.out.println("minn = " + minn);


    }

//10) Ters sıralama ile tekrarsız ve 5'ten büyük
// elemanların yarı değerlerini(elamanın ikiye bölüm sonucunu) bulan bir method oluşturun

    public static void getTersSiralama(List<Integer> list) {

        List<Double> sonuc = list.stream().distinct().filter(t -> t > 5).map(t -> t / 2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println("sonuc = " + sonuc);
    }
}

