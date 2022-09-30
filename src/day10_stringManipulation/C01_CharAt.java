package day10_stringManipulation;

public class C01_CharAt {
    public static void main(String[] args) {

        String str="JAVA ÖĞRENMEK NE GÜZEL";

        System.out.println(str.charAt(0));//ilk harfi yazdirir.

        System.out.println(str.toUpperCase().charAt(7)); // 7. harfi buyuge cevirir  R yazdrr

        System.out.println(str.charAt(21)); // 21'den buyuk sayı verirsek hata verir"(java exception)
        // son harf iç,n str bir eksıgını girecegız

        //charAt methodu kullandıgımızda sonuc char olcagı ıcın artık manıpulation uapamayız



    }
}
