package day17_nestedForLoop;

public class C04_nestedForLoop {




    //verilen ınputa gore * lardan olusan bır ucgen olusturun
    //ornek ınput 4 ise

    /*

    *
    * *
    * * *
    * * * *
            */

    public static void main(String[] args) {

        int input=5;
        for (int i = 1; i <=input ; i++) {

            for (int j = 1; j <=i ; j++) {

                System.out.print("* ");

            }
            System.out.println(" ");
        }





    }
}

