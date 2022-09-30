package practice_13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C03 {

/*/*
 Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
 0-1-1-2-3-5-8-13-21-34....
 */

    public static void main(String[] args) {
        List<Integer> fibonaccilist = new ArrayList<Integer>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("bir sayi girini");
        int sayi=scanner.nextInt();

        fibonaccilist.add(0);
        fibonaccilist.add(1);
        System.out.println("fibonaccilist = " + fibonaccilist);


        int i = 1;
        if (sayi<=1) {
            System.out.println("dah buyuk sayı gir");

        }else {
            while(fibonaccilist.get(i)<sayi){//fibonacci elemanlari sayidan kucuk moldugu surece
                fibonaccilist.add(fibonaccilist.get(i)+fibonaccilist.get(i-1));//bir onceki elemani yanindaki eleman ile tpplar
                i++;
            }
            System.out.println("fibonacciList = " + fibonaccilist);
        }
        int sonIndextekiEleman=fibonaccilist.size()-1;
        if (fibonaccilist.get(sonIndextekiEleman)>sayi){
           fibonaccilist.remove(sonIndextekiEleman);//burasi son elmani kaldiriir
            System.out.println("girdigin sayi fibonacci dizisinde bulunmamaktadir = " +
                    "sizin girdiginiz sayiya kadar ki fibonmacci dizisi budur "+fibonaccilist);
        }else{
            System.out.println("senin girdigin sayi fibonacci listinde var fibonacciList = " + fibonaccilist);
        }
    }
        }
