package day24_ArrayList_ForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_TekrarEdenSayilar {
    public static void main(String[] args) {

       // Soru 1) Verilen bir array’deki tekrar eden elementleri yazdirin.

        int[] arr={2,3,5,6,3,5,4,1,9,6,3,5,5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3,3, 3, 4, 5, 5, 6, 6, 9]
List<Integer> tekrarEden = new ArrayList<>();

        for (int i = 0; i < arr.length-1 ; i++) {

            if (arr[i]==arr[i+1]&& !tekrarEden.contains(arr[i])) { //yanındakıne esıtse  ve tekrar eden listede yoksa
                System.out.print(arr[i]+" ");
                tekrarEden.add(arr[i]);
            }

        }



    }
}
