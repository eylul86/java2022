package day12_stringManipulatıon;

public class C01_REPLACE {
    public static void main(String[] args) {


        String str=" Bu gun ha va cok gu zel ";

        System.out.println(str.replace(" "," "));

        //hava kelimesini java yapalım

        System.out.println(str.replace("h","J").replace(" ", " "));


         // gu zel yerine harıka yazalım

        System.out.println(str.replace("gu zel", "harika"));






    }







}
