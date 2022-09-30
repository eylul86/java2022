package day32_stringBuilder;

public class C03_Reverse {
    public static void main(String[] args) {


String input ="hey gidi for loop günleri";

String tersInput=tersineCevir(input);

        System.out.println("tersInput = " + tersInput);

    }

    public static String tersineCevir(String input) {

StringBuilder sb = new StringBuilder(input);
 return sb.reverse().toString();



    }

}
