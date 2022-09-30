package day15_Overloding_forLoop;

import static day14_methodOlusturma.C01_MethodCreation.terstenYazdır;

public class C06_StringTersCevirme {
    public static void main(String[] args) {

// input olarak verilen Stringi terse cevirip yazdiran bir method olusturun
        String input="ey edip adanada pide ye";
        terstenYazdir(input);
    }
    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);
        for (int i = input.length()-2; i >=0 ; i--) {
            tersInput+=input.substring(i,i+1);
        }
        System.out.println(tersInput);
    }
}