package day26_Constructor;

public class OgretmenRunner {
    public static void main(String[] args) {

Ogretmen ogretmen1 = new Ogretmen();
        System.out.println("ogretmen1 : " + ogretmen1);

        Ogretmen ogretmen2 = new Ogretmen("Buket","Ozdemir","1/1/1986","matematik","fizik");
        System.out.println("ogretmen2 : " + ogretmen2);

        Ogretmen ogretmen3 = new Ogretmen("Cavidan","yılmaz","1/1/1976");
        System.out.println("ogretmen3 : " + ogretmen3);
    }
}
