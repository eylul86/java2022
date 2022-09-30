package recap1_2;

import java.util.Locale;
import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {



        //Kullanicidan ismini ve soyisimi girmesini isteyin,
        // sonrasinda konsola tam ismini buyuk harfler ile yazdirin

            Scanner scan  = new Scanner(System.in);
            System.out.println("lutfen isminizi ve soy isminizi giriniz :");
            String firstName = scan.nextLine();
            String lastName = scan.next();

            String fullName = firstName.concat("  " + lastName).toUpperCase();

            System.out.println("fullName = " + fullName);




        }
}
