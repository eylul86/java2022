package day32_stringBuilder;

public class C01_OlusturmaYontemleri {


    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder("java candır");
        StringBuilder sb3=new StringBuilder(10);


        System.out.println(sb1.length()); //0
        System.out.println( sb1.capacity());//16


        System.out.println(sb2.length());   //11
        System.out.println( sb2.capacity()); //27

        System.out.println(sb3.length());   //0
        System.out.println( sb3.capacity()); //10

    }

}
