package practice_3;

import java.util.Scanner;

public class Q02_StrinManipulationMethodCreation {
    public static void main(String[] args) {

        /*
         * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("bir string girinız");
        String str=scan.nextLine().toLowerCase();

        System.out.println(xyzVarmi(str));



    }

    private static boolean xyzVarmi(String str) {
        if (str.contains("xyz")) {
            return true;

    }else
        return false;



    }
}
