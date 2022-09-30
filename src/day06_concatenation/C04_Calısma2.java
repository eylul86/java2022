package day06_concatenation;

public class C04_Calısma2 {
    public static void main(String[] args) {



            int i = 1;
            i = i++ * ++i * 2;
            System.out.println("i = " + i); //
        /*
        "i++ 1 artar 2 olur fakat hemen atama yapmaz eski degerini korur alt satirda korudugu degerle islem yapilir(1)
         ++i bir onceki artan degerin uzerine 1 artar 3 olur ve hemen atama yapar (3)
         sonuc olarak 1*3*2 = 6
         */
            int x = 1;
            x = ++x * x++ * 2;
        /*
        ++x 1 artar 2 olur ve hemen atama yapar (2)
        x++ bir onceki degeri uzerinden 1 artar 3 olur fakat atama yapmaz degerini korur  alt satirda korudugu degerle islem yapar (2)
        x++ neden 2 : bir onceki ++x 1 artirip hemen atama yaptigi icin
        sonuc olarak 2*2*2 + 8
         */
            System.out.println("x = " + x);


            int a=5;


            a= a++ + ++a +10 ;

            System.out.println("A:"+a);



        int n = 5;
        n = ++n + n++ + 5;
        System.out.println(n);

    }
}
