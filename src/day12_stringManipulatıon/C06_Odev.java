package day12_stringManipulatıon;

public class C06_Odev {
    public static void main(String[] args) {
       // string seklınde verilen asagıdakı fıyatların toplamını bulun



/*
String seklinde verilen asagidaki fiyatlarin toplamini bulunuz
String str1="$13.99"
String str2="$10.55"
ipucu:Double.parseDouble()methodunu kullanabilirsiniz
*/

                String str1="$13.99";
        String str2="$10.55";

        str1=str1.replaceAll("\\W",""); // Once ozel karakterlerden kurtulduk ($ ve . isaretinden)
        str2=str2.replaceAll("\\W","");// Once ozel karakterlerden kurtulduk ($ ve . isaretinden)
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
