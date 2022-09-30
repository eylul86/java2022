package day22_multiDimensional;

import java.util.Arrays;

public class C03_MdaIstenenSayilarıYazdır {
    public static void main(String[] args) {

        /*verilen 2 katlı bır multı dimensional arrayde
        outer ındex ve ınner ındex'i aynı olan sayıların toplamını bulunuz
int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
[0][0] + [1][1] + [2][2] ......

         */


        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6},{1,1,1,1,1}};
        int istenenToplam=0;
        for (int i = 0; i <sayilar.length ; i++) {
            for (int j = 0; j <sayilar[i].length ; j++) {
                if (i==j){
                    istenenToplam+=sayilar[i][j];
                }
            }
        }
        System.out.println("istenen toplam : " + istenenToplam);
    }
}

