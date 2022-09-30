package practice_4;

public class Q01_MethodCreation {

     /*
        Problem tanımı :
        Bir String içindeki tüm karakterleri en fazla bir kez yazdıran parametreli bir method yazınız.
        Test Data:
        input: "aabbcccccddddaaa"
        output: abcd
     */

    public static void main(String[] args) {
        birkereYazdir("aabbccddee");


    }

    private static void birkereYazdir(String str) {



        String output="";
        for (int i = 0; i < str.length(); i++) {

            if (!output.contains(str.substring(i,i+1))){

                output+=str.substring(i,i+1);

            }

        }

        System.out.println("output = " + output);

    }



}
