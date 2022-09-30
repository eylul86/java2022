package practice_1_2;

public class Q03_PrimitiveDataTypes {
    public static void main(String[] args) {

/* Primitive data type
        byte: only takes whole numbers
        short: only takes whole numbers
                int(used more often): only takes whole numbers
        long: only takes whole numbers
        float: can take decimals (MUST have F or f at the end)
                double( used more often): can take decimals
        boolean: true or false boolean expressions
        char: character within single quote ''
        also takes number
                * Range: double > float >long > int >short > byte */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiralim.

        int inMax=Integer.MAX_VALUE;
         int inMin=Integer.MIN_VALUE;

        System.out.println("inMax = " + inMax);
        System.out.println("inMin = " + inMin);

        byte byteMax=Byte.MAX_VALUE;
        byte byteMİN=Byte.MIN_VALUE;

       System.out.println("byteMİN = " + byteMİN);
        System.out.println("byteMax = " + byteMax);

        short shMAX=Short.MAX_VALUE;
        short shMİN=Short.MIN_VALUE;

        System.out.println("shMİN = " + shMİN);
        System.out.println("shMAX = " + shMAX);

       double doubleMax=Double.MAX_VALUE;
       double doubleMin=Double.MIN_VALUE;

        System.out.println("doubleMin = " + doubleMin);
        System.out.println("doubleMax = " + doubleMax);

        long longMax=Long.MAX_VALUE;
        long longMin=Long.MIN_VALUE;

        System.out.println("longMin = " + longMin);
        System.out.println("longMax = " + longMax);

float floatMax=Float.MAX_VALUE;
float floatMin=Float.MIN_VALUE;

        System.out.println("floatMin = " + floatMin);
        System.out.println("floatMax = " + floatMax);





        //long, double, float veri tiplerinin max ve min degerlerini yazdiralim.


        //Her veri turuyle bir tane olmak uzere 4 degisken olusturun (float, double, char, boolean)
         //Degiskenler icin anlamli isimler kullanip, yazdiralim

        float laptopFiyat=999.99f;
        double kilometre=34.56;
        char seviye='A';
        boolean dogruMu=true;

        System.out.println("dogruMu = " + dogruMu);
        System.out.println("seviye = " + seviye);
        System.out.println("kilometre = " + kilometre);
        System.out.println("laptopFiyat = " + laptopFiyat);












    }
}
