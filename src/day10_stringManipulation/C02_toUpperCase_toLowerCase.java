package day10_stringManipulation;

import java.util.Locale;
import java.util.Scanner;

public class C02_toUpperCase_toLowerCase {


    public static void main(String[] args) {


        String str="beni psikopata bağlamayin";
        System.out.println(str.toUpperCase());
        System.out.println(str.toUpperCase(Locale.forLanguageTag("Tr")));

    }
}
