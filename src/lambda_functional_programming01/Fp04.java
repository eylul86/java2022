package lambda_functional_programming01;

import java.util.stream.IntStream;

public class Fp04 {


    public static void main(String[] args) {


        //   /1) 7'den 100'e kadar integer değerlerinin toplamını bulan bir metho

        System.out.println(yedidenYuzeKadarToplam()); //5029
        System.out.println(yedidenYuzeKadarToplam2());//5029
        System.out.println(ikidenOnbireCarpim()); //39916800
        System.out.println(besFaktoriyel(5)); //120
        System.out.println(ikiSayiTopla(11, 5));  //24
        System.out.println(ikiSayiArasindakiToplami(23,32)); //68

    }

    public static int yedidenYuzeKadarToplam() {

      return   IntStream.range(7, 101).reduce(Math::addExact).getAsInt();


    }
    public static int yedidenYuzeKadarToplam2() {

        return   IntStream.rangeClosed(7, 100).reduce(Math::addExact).getAsInt();

        //rangeclosed son rakamı dahil eder
//range yaptigimizda son rakdamdan bir fazlasini yazmamiz gerekiyor cunku yazdigimiz son degeri almadan calisiyor
//fakat rangeClosed kullandigimizda son rakami da dahil ediyor, o yuzden bir fazlasini yazmamiza gerek kalmiyor.
}

//2) 2'den 11'e kadar integer değerlerinin çarpımını bulan bir method oluşturun.

    public static int ikidenOnbireCarpim() {

        return IntStream.rangeClosed(2, 11).reduce(Math::multiplyExact).getAsInt();
    }

//3) Verilen bir sayının faktoriyelini hesaplayan bir method oluşturun. (5 factorial = 1*2*3*4*5  ==> 5! = 1*2*3*4*5)


    public static int besFaktoriyel(int x) {

        return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
    }

//4) Verilen iki sayı arasındaki çift sayıların toplamını bulan bir method oluşturun.

    public static int ikiSayiTopla(int x, int y) {
        int z = 0;

        if (x > y) {
            z = x;
            x = y;
            y = z;
        }

        return IntStream.rangeClosed(x, y).filter(Utils::ciftElemanlariSec).sum();

    }

//5) Verilen iki sayı arasındaki tüm sayıların rakamlarının toplamını hesaplayan bir method oluşturun.
    //  23 and 32 ==> 2+3  +  2+4  +  2+5  +  2+6  +  2+7  +   2+8  +   2+9  +   3+0  +   3+1  +   3+2 ==> 68

public static int ikiSayiArasindakiToplami(int x,int y){


        return IntStream.rangeClosed(x,y).map(Utils::rakamlarToplamiAl).sum();
}

}
