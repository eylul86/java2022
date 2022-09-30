package day27_staticKeyword;

public class C01 {

    static int sayi=10;
    int rakam=5; //intance oldugundan objeye baglı obje olustruldugu yrden basla

    public static void main(String[] args) {

        /* static (class) variablr
        instance (obje) variable
        static variable tum class tan kullanılabıkırken
        instance (obje) variablelar statıc olmayan methodlardan kullanılabılır
        instance variablelara sta
         methoddan ulasmak ıstersek obje olustrmamız gerekır

         */
C01 obj1=new C01();
        System.out.println("obj1.rakam = " + obj1.rakam); //5
        System.out.println("sayi = " + sayi);//10


obj1.rakam+=1;
sayi+=1;

        System.out.println("obj1.rakam = " + obj1.rakam); //6
        System.out.println("sayi = " + sayi);//11


        C01 obj2=new C01();
        System.out.println("obj2.rakam = " + obj2.rakam);//5
        System.out.println("obj2.sayi = " + obj2.sayi);//11


        obj2.rakam++;  //5+1
        obj2.sayi++;

        System.out.println("obj2.rakam = " + obj2.rakam);//6
        System.out.println("obj2.sayi = " + obj2.sayi);//12
    }
}
