package day32_stringBuilder;

public class C05_IndexOf_LastIndexOf {
    public static void main(String[] args) {

      StringBuilder sb=new StringBuilder("pay attention please");

        System.out.println(sb.indexOf("pay")); //0

        System.out.println(sb);
        System.out.println(sb.indexOf("e")); //7
        System.out.println(sb.indexOf("e",10)); //16
        //10. ındexden sonrakı e kacıncı ındexte

        System.out.println(sb.lastIndexOf("e",10));//7
        System.out.println(sb.lastIndexOf("e"));//19



    }
}
