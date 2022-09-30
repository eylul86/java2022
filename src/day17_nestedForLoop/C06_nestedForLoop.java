package day17_nestedForLoop;

import java.util.IdentityHashMap;

public class C06_nestedForLoop {


    public static void main(String[] args) {

        //verılen strıngı yazdırın asagıdakı gıbı

     /*   input=Deniz

               d
               de
               den
               deni
               deniz
      */



        String input="ANKARA";

        for (int i = 1; i <=input.length() ; i++) {
            for (int j = 1; j <=i ; j++) {

                System.out.print(input.substring(j-1,j)); //ılk harf 0 ama 1 den baslattık j yı o yuzden j-1
            }
            System.out.println(" ");
        }

    }
}
