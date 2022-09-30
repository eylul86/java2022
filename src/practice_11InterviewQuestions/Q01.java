package practice_11InterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {


    /*
 Kullanicidan bir String aliniz.
 String'de var olan her character'in sayisini ekrana yazdiriniz.
 Ornek: yapacan ==> a = 3, y = 1, p = 1, n = 1, c = 1
        hallolur yaaa   ==> a=4  l=3 h=1 o=1 u=1 y=1
*/


    /*
daha oncelikle Scanner den obje olusturacaz
oncelikle split() kullanacagiz
sort yapacaz
for loop a alacaz
if ile kontrol yapacaz
sout ile yazdiracaz

 */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("bir string ifade giriniz");

        String str=scanner.nextLine();
        String arr[]=str.split("");

        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        int sayac = 0;
        for (int i = 1; i < arr.length; i++) {


            if (arr[i - 1].equals(arr[i])) {

                sayac++;
            } else {
                System.out.println(arr[i - 1] + " karakteri " + (sayac+1));
                sayac = 0;


            }if(i==arr.length - 1) { //for loop en sona geldıgınde
                System.out.println(arr[i] + " karakteri " + (sayac+1));



            }


        }




    }
}
