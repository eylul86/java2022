package day15_Overloding_forLoop;

public class C01_ReturnMethod {
    public static void main(String[] args) {

        //verilen ıkı sayıyı carp sonuc bıze dondur

        int sayi1 = 10;
        int sayi2 = 5;

        int sonuc = carpGetir(sayi1, sayi2);
        System.out.println("illa da sonucu göreyim diyenlere:"+sonuc);

    }

    public static int carpGetir(int sayi1, int sayi2) {
        return sayi1*sayi2;

    }
}