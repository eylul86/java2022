package day45_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C01_Set {
    public static void main(String[] args) {

        //verilen bir array daki tekrar eden elementleri sılip
        //tekrarsız halını array atayan kod

        int[]arr={4,5,2,3,6,8,5,9,1,2,3,4,5,5,7,6};

        Set<Integer> tekrarsizSet=new HashSet<>();
        for (int each:arr
        ) {
        tekrarsizSet.add(each);
        }

        System.out.println(tekrarsizSet);

      int tekrarsızArr[]=new int[tekrarsizSet.size()];
        System.out.println(Arrays.toString(tekrarsızArr));
int i=0;
        for (Integer each : tekrarsizSet
        ) {
          tekrarsızArr[i]=each;
          i++;
        }
        arr=tekrarsızArr;
        System.out.println(Arrays.toString(arr));
        }
        }



