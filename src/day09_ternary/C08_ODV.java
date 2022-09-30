package day09_ternary;

public class C08_ODV {
    public static void main(String[] args) {



        int a =2;
        int b =2;
        int e =b<1 ? b++ : ++a;
        System.out.println(b+","+a+","+e);


    }
}
