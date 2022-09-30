package practice_13;

public class C04 {

     /*
int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
verilen Array icinde
--> kac tane eleman oldugunu return eden methodu yazdiriniz
//cevap : 13 donsun
*/

    public static void main(String[] args) {
        int arr [][]={{7,12,97,23},{543,23,675},{2},{2,33,6,3,7}};
elemanSayi(arr);


        System.out.println("arr = " + elemanSayi(arr));




    }

    private static int elemanSayi(int[][] arr) {
int sayac=0;

        for (int i = 0; i < arr.length ; i++) { //outer loop için

            for (int j = 0; j <arr[i].length ; j++) {  //İNNER LOOP ICIN

                sayac++;

            }



        }

        return sayac;


    }
}
