package day07_ifStatements;

public class C01_AndOperatorleri {

    public static void main(String[] args) {

        int a=10;
        int b=15;
        int c=20;


        System.out.println(a>0 && b<20 && c>=b);


        System.out.println(a<0 && b<20 && c>=b);

        System.out.println(a<0 & b<20 & c>=b);

        //iki "and" oldugunda ilkine bakar false ise diğerlerine bakmaz
       //tek "and" oldugunda ilkine bakar false olsa bile diğerlerine de bi bakar
        //ve sistem yavas calısır...

    }

}
