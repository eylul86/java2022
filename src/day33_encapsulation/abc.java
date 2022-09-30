package day33_encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class abc {


    // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.
    public static void main(String[] args) {
        int[] arr1 = {2, 3, 5, 6, 3, 5, 4, 1, 9, 6, 3, 5, 5};

        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 6, 9]

        List<Integer> tekrarli = new ArrayList<>();

        for (int i = 0; i < arr1.length - 1; i++) {

            if (arr1[i] == arr1[i + 1] && !tekrarli.contains(arr1[i])) {
                System.out.print(arr1[i]+" ");

                tekrarli.add(arr1[i]);


            }
        }
    }}