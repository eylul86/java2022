package practice_6;

import java.util.Scanner;

public class Q11_PinKod {

    // STring olan pın kodunuzu kontrl eden bir kod yazınız

    public static void main(String[] args) {
        String pin="mehmet.1234";
        int giris=3;
        Scanner scan=new Scanner(System.in);

        System.out.println("******HOSGELDİNİZ******");

while (true){
    System.out.println("pin kodunuzu giriniz:");
    String girilenPin=scan.nextLine();

    if (pin.equals(girilenPin)){
        System.out.println("basarılı giris yaptınız :)");
        break;
    }else {
        System.out.println("yanlıs giris yaptınız :(");
        giris--;
        System.out.println("kalan giris hakkınız: "+giris);
    }if (giris == 0) {
        System.out.println("giris hakkınız kalmadı bloke oldu");

        break;
    }
}


    }

}
