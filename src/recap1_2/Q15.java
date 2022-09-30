package recap1_2;

public class Q15 {
    public static void main(String[] args) {

        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

  /* Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
1) \\d    ==> tum rakamlar
    \\D    ==> tum rakam disi character ler
2) \\w   ==> A->Z     a->z         0->9    _
    \\W  ==> A->Z    a->z         0->9    _ disindaki hersey
3) \\s   ==> space
    \\S   ==> space disindaki hersey  */

        String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\D",""); // Once ozel karakterlerden kurtulduk ($ ve . isaretinden)
        str2=str2.replaceAll("\\D","");// Once ozel karakterlerden kurtulduk ($ ve . isaretinden)
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1+str2);

/*
Toplamak istedigimiz variable'lar String oldugu icin matematiksel isleme sokamayiz.
O yuzden Double.parseDouble methoduyla Stringleri Double'a cevirdik.
 */
        Double str1Sayi=Double.parseDouble(str1); // Artik str1 degerimiz Double
        Double str2Sayi=Double.parseDouble(str2); // Artik str2 degerimiz Double
        System.out.println(str1Sayi);
        System.out.println(str2Sayi);
        Double toplam=(str1Sayi+str2Sayi)/100;
// ilk islemde Karakterlerden kurtulmak isterken ondalik kismini belirleyen . isaretimiz de kaybolmustu.
// O yuzden toplayip 100'e bolduk.
        System.out.println("Girilen sayilarin toplami: " +"$"+toplam);

























    }
}
