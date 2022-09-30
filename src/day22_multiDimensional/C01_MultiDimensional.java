package day22_multiDimensional;

import java.util.Arrays;

public class C01_MultiDimensional {
    public static void main(String[] args) {
        //tek katlı arraylerde array'i direk yazdıramıyoruz
        //cunku array non primitıve data turudur ve
        //her non prımıtıv data dırek yazdırılmayabılır.

//array ıcındekı elementler dırek yazdırılır
        //cunku genelde prımıtıve data yada strıng elementler kullanılıyor

        //multi-dimensional arraylerde en dıkkat edecegımız konu
        //ulasmak ıstedıgımız elementın bır array mı yoksa prımıtıve data  mı oldugudur



        int[][] sayilar={{1,2,4,5},{3,4}};
        /* burda sayılar arrayını dusunursek içinde 2 tane inner array var
        sayilar [0]==>[1,2,4,5]

         */
        System.out.println(sayilar[0]); //referans veriyor [I@57829d67
        System.out.println(Arrays.toString(sayilar[0])); //)[1,2,4,5]

        System.out.println(sayilar[0][1]); //2

        //outer sıfırıncı ındex'i   ınner arryin 1. ındex'i

        System.out.println(sayilar[1][0]); //3

        System.out.println(Arrays.toString(sayilar)); //[[I@57829d67, [I@19dfb72a]
        System.out.println(Arrays.deepToString(sayilar));//[[1, 2, 4, 5], [3, 4]]
    }
}

/*  array ı 2 sekılde declare edebılıyoruz.
1. elemanları dırek yazabılırz {{1,2,4,5},{3,4}}; gıbı
2. outer ve ınner uzunluklarını belırterek olusturabılırız.
int[][] sayilar=newint[3][4]  {{1,2,3,4},{2,3,4,5},{1,2,3,4}}

ancak 2. yontemle yaptıgımızda ınner arryların farklı
uzunlukta olma ıhtımalı kalmaz
 bu ornek ıcın outer array ın 3 tane ınner arrayi vardır
  her bır ınner arrayın ise 4 er elemanı vardır
  Eger inner arrayleri farkli uzunluklarda olusturmak istiyorsaniz
mecburen 1.yontemi kullanmalisiniz

 */