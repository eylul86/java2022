package recap1_2;

import java.util.Scanner;

public class ddddd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sayi = sc.nextInt();
        do {
            if (sayi % 2 == 0) sayi /= 2;
            else if (sayi % 3 == 0) sayi /= 3;
            else if (sayi % 5 == 0) sayi /= 5;
            else break;
        } while (sayi != 1);
        System.out.println(sayi == 1 ? "ugly number" : "ugly number degildir");
    }
}