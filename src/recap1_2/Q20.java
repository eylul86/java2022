package recap1_2;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("cumle giriniz");
        String cumle=scan.nextLine();
        kelimeSayisi(cumle);
        System.out.println(kelimeSayisi(cumle));
    }
    private static int kelimeSayisi(String cumle) {
        int sayi = 0;
        cumle = cumle.trim();
        for (int i = 0; i < cumle.length() ; i++) {
            if (cumle.charAt(i) == ' ') {
                sayi++;
            }
        }
        return sayi+1;

    }

}
