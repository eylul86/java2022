package practice_6;

import java.util.Arrays;

public class Q06_Arrayss {
    public static void main(String[] args) {

        /*  you have a string "HeySiri"
         * with arrays change it to "ByeSiri" and write changing array
         *(String iniz: "HeySiri"  Diziyi "ByeSiri" ye cevirin )
         *
         */


String str="heySiri";
str=str.replace("hey","bye");

String[]arr=new String[1]; //1 elemanlı array olustrduk

arr[0]=str;
        System.out.println(Arrays.toString(arr));
    }
}
