package lambda_practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda01 {


    /* TASK :

     * Input olarak verilen listteki isimlerden
     * icinde 'a' harfi bulunanlari silen bir code create ediniz.
     *
     * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
     * OUTPUT : [Veli,Omer]
     */

    static ArrayList<String> names = new ArrayList<>(Arrays.asList("Tülay,Zekeriya", "Hasan", "Ismail", "Osman", "Fatih", "Ersin", "Mevlit"));

    public static void icindeAOlanilaniSil(List<String> isimler) {

        // isimler.removeIf(t->t.contains("A")||t.contains("a"));
        //   System.out.println(isimler);

        System.out.println(isimler.stream().map(m -> m.toLowerCase()).filter(m -> !m.contains("a")).collect(Collectors.toList()));
        //akısı alındı hepsı kucuk harf cevrildi maplandı a harfı olmayanlar fıltrelendı liste atıldı

    }

//en buyyk elemani bulun


    static List<Integer> numbers = new ArrayList<>(Arrays.asList(25, 65, -56, 55, 98, -89, 65, 55, 21, 54, 9, 35, 35, 34));


    public static void getMaxEleman(List<Integer> list) {
        Integer max = numbers.stream().distinct().reduce(Math::max).get();

        System.out.println("max = " + max);

        //numbers.stream().reduce(Integer::max); 2. yol

    }
   /* reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
    kullanımı yaygındır pratiktir.
    Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
    bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılmlı bir hesaplama süreci elde edilmiş olmaktadır.
    reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
    reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
    İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır. */

// Task : List'teki tum elemanlarin toplamini yazdiriniz.
//Lambda Expression...


    public static void elemanlarinTopla(List<Integer> sayilar) {


        System.out.println(numbers.stream().reduce(0, (t, u) -> t + u));


    }
    // Task : List'teki cift elemanlarin carpimini  yazdiriniz.
    public static void ciftCarpim(List<Integer> sayilar) {

        Integer carpim1=sayilar.stream().filter(Methodlar::ciftElemaniBul).reduce(Math::multiplyExact).get();

     //  sayilar.stream().filter(Methodlar::ciftElemaniBul).reduce(Math::multiplyExact));


        System.out.println(carpim1);
    }
    //TODO task tek lerin karesini buyukten kucuge
    public static void teklerinKareBuyuktenKucuge(List<Integer> sayi) {

sayi.stream().filter(t->t%2==1).map(t->t*t).sorted(Comparator.reverseOrder()).forEach(Methodlar::yazdir); //sortladık ters sıraladık
    }

    // Task : List elemanlarini alafabetik buyuk harf ve  tekrarsiz print ediniz.


    static List<String> menu = new ArrayList<>(Arrays.asList("kusleme", "adana", "trilice", "havucdilim", "buryan",
            "kokorec", "kuzutandir", "guvec"));

    public static void alfabetikBuyukHarfTekrarsiz(List<String> yemek) {




    }


    // Task : list elelmanlarinin character sayisini ters sirali olarak tekrarsiz print ediniz..
    public static void strKarakterSayisiYazdir(List<String> yemek) {
    }

    // Task :TODO list elemanlarinin son harfine gore ters sirali print ediniz.

    public static void sonHarfeGoreTersSira(List<String> yemek) {


yemek.stream().sorted(Comparator.comparing(t->t.toString().charAt(t.toString().length()-1)).reversed()).forEach(Methodlar::yazdir);








    }







    // Task : listin elemanlarin karakterlerinin cift sayili  karelerini hesaplayan,ve karelerini tekrarsiz
    // buyukten kucuge sirali  print ediniz..
    public static void karakterCiftKareBuyuktenKucuge(List<String> yemek) {
    }
    // TODO Task : List elelmmalarinin karakter sayisini 7 ve 7 'den az olma durumunu kontrol ediniz.
    public static boolean karakterSayiYedidenBuyuk(List<String> yemek) {

        return yemek.stream().allMatch(t->t.length()<=7) ;

        //yemek.stream().map(t->t.length()<=7).forEach(Methodlar::yazdir);

        /*System.out.println(yemek.stream() //akisa aldik
        .allMatch(t -> t.length() <= 7) ? //yediye esit ve yedi karakterden kisa olan var mi ona baktik
        "List elemeanlari 7 ve 7 den daha az harften olusmaktadir." //7 karakterden kisa ve esiit ise bunu yazdirdik
        : "Bazi elemanlar 7 harften uzun"); ////7 karakterden kisa ve esiit degil ise bunu yazdirdik*/

        }
    //anyMatch() --> enaz bir eleman sarti saglarsa true aksi durumda false return eder
    //allMatch() --> tum  elemanlar sarti saglarsa true en az bir eleman sarti saglamazsa false return eder.
    //noneMatch() --> hic bir sarti SAGLAMAZSA true en az bir eleman sarti SAGLARSA false return eder.
    // Task : List elelmanlarinin "W" ile baslamasını kontrol ediniz.
    public static void basHarfiWIleBaslayan(List<String> yemek) {
    }
    // TODO Task : List elelmanlarinin "x" ile biten en az bir elemaı kontrol ediniz.
    public static boolean xIleBitenEleman(List<String> yemek) {


        return yemek.stream().anyMatch(t->t.endsWith("x"));





    }
    // TODO Task : Karakter sayisi en buyuk elemani yazdiriniz.
    public static void karkterEnFazla(List<String> yemek) {
        //limit(1) => Sınırlandırma demek. Bu akışın elemanlarından oluşan, uzunluğu maxSize'dan uzun olmayacak
        // şekilde kesilmiş bir akış return eder. Stream return eder.
 Stream<String>sonIsim=yemek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).limit(1);

        System.out.println(Arrays.toString(sonIsim.toArray()));

        //2.yol
        //String maxKelime= yemek.stream().sorted(Comparator.comparing(t->t.toString().length()).reversed()).findFirst().get();

//  System.out.println("maxKelime = " + maxKelime);

    }
    /*
TRİCK : •    Stream'ler ekrana direk yazdırılamaz. Stream'i toArray() ile Array'e çeviririz.
Array'i de Arrays.toString() 'in içine alıp yazdırabiliriz.
•  Ör; System.out.println(Arrays.toString(***.toArray())); veya System.out.println(Arrays.asList(***.toArray()));
kullanılabilir.
*/
    //TODO Task : list elemanlarini son harfine göre siralayıp ilk eleman hariç kalan elemanlari print ediniz.
    public static void sonHarfeGoreSiralaIlkHaricElmanlariYaz(List<String> yemek) {
    }
}


