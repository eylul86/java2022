package day22_multiDimensional;

import java.util.ArrayList;
import java.util.List;

public class C07_List {
    public static void main(String[] args) {
        List<Integer> sayilar=new ArrayList<>();

//prımıtıve data turlerını kabul etmez//
   sayilar.add(5);
   sayilar.add(3);
   sayilar.add(7);
        System.out.println(sayilar); //[5,3,7,8]

//sadece add kullanırsak java sona ekler

        sayilar.add(2,10);//index 2 olan yere 10 elementi ekleyelım

        System.out.println(sayilar);//[5,10,3,7]
    }

}
