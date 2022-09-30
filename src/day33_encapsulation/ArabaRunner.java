package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {


        Araba arb1 = new Araba();
        arb1.marka = "toyota";
// // arb1 objesi uzerinden marka variable'ina
//        // ulasabildim, degistirebildim(set) ve yazdirabildim(get)
        System.out.println(arb1.marka);

// access modifier kullanarak marka variable'ina ulasimi
// tamamen serbest yapabilir veya tamamen engelleyebilirim
// private yaptigimiz modele ise hic ulasamayiz
// yani access modifier ya hep ya hic diyor

// modeli'yi degistirelim ama goremeyelim
// yakiti da gorelim ama degistiremeyelim

// set ve get yetkilerini ozel olarak tanimlamak isterseniz
// 1.adim - ozel yetki tanimlayacaginiz variable'lari private yapin
//          private biya baska classlardan ulasmak mumkun olmadigindan
// 2.adim - set yetkisi icin setter, get yetkisi icin getter methodlari olusturalim






        arb1.setModel("corolla"); //model olarak supra atadık
        //modeli yazdıramatız getter yok
        System.out.println(arb1.getYakit()); //elektrıklı bılgısını yazdırabıldık

   //yakıtı degıstıremeyız setter yok

    }
}