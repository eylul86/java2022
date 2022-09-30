package day05_matematikselIşlemler;

public class C02_Pre_Post_incremenet {
    public static void main(String[] args) {


        int sayi=10;

        System.out.println("preincrement:"+ ++sayi); // 11
        System.out.println("post-increment:"+ sayi++);//11

        System.out.println("post-increment'den sonra:" + sayi);//12
    }
}
