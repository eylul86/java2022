package day06_concatenation;

public class C03_Calısma {

    public static void main(String[] args) {

        int i = 1;
        i = i++ * ++i * 2;
        System.out.println("i = " + i);    //6

        int x = 1;

        x = ++x * x++ * 2;
        System.out.println("x = " + x);

int a=1;
a=a++;
        System.out.println(a);
        a=++a;
        System.out.println(a);

        int i1 = 1;
        i1 = i1++ * ++i1;
        System.out.println(i1);


        int i2 = 1;
        i2 = i2++;
        System.out.println(i2);

        int xa = 1;

        xa = ++xa * xa++;
        System.out.println("xa = " + xa);



        int b = 1;
        b = b++ * ++b ;
        System.out.println("b = " + b);    //6

        int d=1;
        d=d++;
        System.out.println(d);

}
}