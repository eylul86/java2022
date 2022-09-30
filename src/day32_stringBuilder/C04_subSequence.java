package day32_stringBuilder;

public class C04_subSequence {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Kayra");


        sb.substring(0,3);

        System.out.println(sb);//kayra
//method strıng donduruyorsa strıngbuılder eskı halı degısmez


        sb.subSequence(0,3);
        System.out.println(sb);//
    }
}
