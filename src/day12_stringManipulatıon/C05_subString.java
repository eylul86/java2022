package day12_stringManipulatıon;

public class C05_subString {
    public static void main(String[] args) {


        String input="Veli";

// Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin.

        String tersInput= input.substring(3)+
                input.substring(2,3)+
                input.substring(1,2)+
                input.substring(0,1);
        System.out.println(tersInput);


    }
}
