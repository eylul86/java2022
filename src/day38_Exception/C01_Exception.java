package day38_Exception;

public class C01_Exception {
    public static void main(String[] args) {



        /* bir sorunla karsılasmayı bekledıgınız noktalarda ıf else ıle sorunu yakalayıp
        onunla ılgılı czoum uretebılırsınız.

        ama  sorunu her zaman if else ıle cozemeyecegımızden java try-catch blokları olusturmustur

         */
        int a=1000;
        int b=50;
        int sayac=1;
        while (sayac<100){
            if(b==0){
                System.out.println("işlem yapılırken payda sıfır oldu dıkkat et");
            }else {
                System.out.println((a/b));
            }

            b--;
            sayac++;
        }

    }
}
