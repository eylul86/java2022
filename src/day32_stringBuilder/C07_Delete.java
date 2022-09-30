package day32_stringBuilder;

public class C07_Delete {


    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("JAVA HER ZAMAN GÜZEL");

        sb.delete(8,9);
        System.out.println("sbuilder = " + sb);


        sb.deleteCharAt(7);
        System.out.println("sb: " + sb);

        int son=sb.length();
        for (int i = 0; i <son ; i++) {
            sb.deleteCharAt(0);
            System.out.println(sb);

        }




    }
}
