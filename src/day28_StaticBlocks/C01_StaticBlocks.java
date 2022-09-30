package day28_StaticBlocks;

public class C01_StaticBlocks {
    static  int sayi;
static {
    System.out.println("static block calisti");
    sayi=10;
}
    public static void main(String[] args) {

        System.out.println("maın method calıstı");
        System.out.println("sayi = " + sayi);

    }

static {
    System.out.println("maın method altındakı statıc block calıstı");
}

}
