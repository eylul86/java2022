package day46_Maps;

import java.util.*;

public class C01_Maps {

    public static void main(String[] args) {

        Map<Integer,String> sinifList = new HashMap<>();

        sinifList.put(101,"Ali, Can, Developer");
        sinifList.put(102,"Enes, Cem, Tester");
        sinifList.put(103,"Taha, Emre, Developer");
        sinifList.put(104,"Derya, Deniz, Tester");

        System.out.println(sinifList); //{101=Ali, Can, Developer, 102=Enes, Cem, Tester, 103=Taha, Emre, Developer, 104=Derya, Deniz, Tester}
        System.out.println(sinifList.keySet()); //[101, 102, 103, 104]
        System.out.println(sinifList.values()); //[Ali, Can, Developer, Enes, Cem, Tester, Taha, Emre, Developer, Derya, Deniz, Tester]
        System.out.println(sinifList.values().size()); //4

        Collection<String> tumValueColl=sinifList.values();

String[]eachArray ;
int sira=1;

        for (String each:tumValueColl
             ) {
          //  System.out.println(each);
            /*Ali, Can, Developer
            Enes, Cem, Tester
            Taha, Emre, Developer
            Derya, Deniz, Tester */

eachArray=each.split(", ");
            System.out.println(sira+"- "+eachArray[0]+" "+eachArray[1]);

sira++;

        }
        List <String> sinifIsimSoyisimList = new ArrayList<>();

        for (String each : tumValueColl
             ) {

            eachArray=each.split(", ");
            sinifIsimSoyisimList.add(eachArray[0]+" "+eachArray[1]);
            System.out.println(sinifIsimSoyisimList);


        }



    }

}
