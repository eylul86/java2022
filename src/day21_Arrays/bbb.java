package day21_Arrays;

import java.util.Scanner;

public class bbb {
    public static void main(String[] args) {

        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        Array = [20, 30, 25, 35, -16, 60, -100 ]
        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0

         */

        int arr[] = {20, 30, 25, 35, -16, 60, -100};
        int toplam=0;
        int count=0;

        for (int i = 0; i <arr.length ; i++) {
            toplam+=arr[i];
            count++;
        }
        double ort=toplam/count;
        System.out.println("Array sayilarinin ortalamasi: " + ort);


    }
}