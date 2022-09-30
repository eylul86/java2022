package practice_1_2;

import java.util.Scanner;

public class Q_09_Scanner {
    public static void main(String[] args) {

        {
            // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
            // ve yasadiklari yeri seviyorlarsa
            // bu bilgiyi yazdirin
            // next() only can read the first word
            // nextLine() can read the whole line

            Scanner scan = new Scanner(System.in);
            System.out.println("isminiz");
            String isim = scan.nextLine();
            System.out.println("memleketiniz");
            String memleket = scan.nextLine();
            System.out.println("konumunuz");
            String konum = scan.nextLine();
            System.out.println("yaşınız");
            int yas = scan.nextInt();
            System.out.println("boyunuz");
            double boy = scan.nextDouble();
            System.out.println("yaşadıgınız" + konum + "u sevıyor musunuz? true/false");
            boolean soru = scan.nextBoolean();


            System.out.println("isim = " + isim);
            System.out.println("yas = " + yas);
            System.out.println("memleket = " + memleket);
            System.out.println("konum = " + konum);
            System.out.println("boy = " + boy);
            System.out.println("soru = " + soru);


        }
    }}
