package day06_concatenation;

public class C02_Concatenation {

    public static void main(String[] args) {

        String str1="java";
        String str2="güzeldir";
        int sayi1=5;
        int sayi2=4;

        System.out.println(str1+" "+str2+" "+sayi1+sayi2);  //java guzeldir 54

        System.out.println(str1+" "+str2+" "+(sayi1+sayi2)); //java guzeldir 9

        System.out.println(sayi1+sayi2+" "+str1); // 9 java

        System.out.println(" "+sayi1+sayi2+" "+str2); //54 guzeldir

        System.out.println(str1.concat(" ").concat(str2)); //java guzeldir
        System.out.println(str1+sayi1+sayi2);

    }
}
