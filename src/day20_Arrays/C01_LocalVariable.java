package day20_Arrays;

public class C01_LocalVariable {
    public static void main(String[] args) {

        int sayi=10;

      //  System.out.println(sayiMEthod);
//sayi method method1 de olusturulmus local varıabledır.

        for (int i = 0; i <20 ; i++) {
            System.out.println(i);

        }
     //   System.out.println(i); //i local oldugundan sadece loop ıcersınde kullanılır

  //static int sayiStatic=20;  static keyword sadece class levelda kullanılır
        //methodların içerisinde static variable tanımlanmaz



    }




    public static void method1(){

    //    System.out.println(sayi); local oldugundan sadece maın methodta gcerli

        int sayiMethod=20;

    }



}
