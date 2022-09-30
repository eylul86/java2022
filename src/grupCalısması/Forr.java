package grupCalısması;

import java.util.Scanner;

public class Forr {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("baslangic harfi giriniz :");
        char basHarf=scan.next().toUpperCase().charAt(0);
        System.out.print("bitis harfi giriniz :");
        char bitisHarf=scan.next().toUpperCase().charAt(0);
        if (basHarf<=bitisHarf){
            for (char  i = basHarf; i <=bitisHarf ; i++) {
                System.out.print(i);
            }
        }else{
            for (char i = bitisHarf; i <=basHarf ; i++) {
                System.out.print(i);
            }
        }








    }
}
