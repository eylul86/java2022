package practice_1_2;

public class Q_11 {
    public static void main(String[] args) {

        /*
    not hesaplayici
            A => 90 ~100
            B => 80 ~ 89
            C => 70 ~ 79
            D => 60 ~ 69
            F =>  0 ~ 59
     */

        int not= 85;


        if (not>=90&& not<=100){
            System.out.println("A");

        }else if(not>=80&& not<90) {
            System.out.println("B");
        }else if(not>=70 && not<80){
            System.out.println("C");
        }else if(not>=60 && not<70){
            System.out.println("D");
        }else {
            System.out.println("F");

        }





    }
}
