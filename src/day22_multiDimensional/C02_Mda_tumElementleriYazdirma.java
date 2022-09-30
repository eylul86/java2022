package day22_multiDimensional;

public class C02_Mda_tumElementleriYazdirma {
    public static void main(String[] args) {

        //verilen bır multi dimensional array in tum elementlerini yazdıran method

        int[][]sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdir(sayilar);

    }

    public static void elementleriYazdir(int[][] sayilar) {
        for (int i = 0; i < sayilar.length ; i++) { //i=0,1,2 degerlerini alcak outer uzunluguna gıdıcek

            for (int j = 0; j <sayilar[i].length ; j++) {  //inner array uzunluguna bagladık

                System.out.print(sayilar[i][j]+" ");


            }


        }




    }
}
