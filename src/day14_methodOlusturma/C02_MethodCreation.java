package day14_methodOlusturma;

import day13_MethodCreation.C04_MethodCreation;

public class C02_MethodCreation {
    public static void main(String[] args) {
        //verilen 3 basamaklı bır sayının rakamlar toplamı


        int input=423;

        rakamlariTopla(input);
        C01_MethodCreation.terstenYazdır("SEVİL");
        C04_MethodCreation.topla(7,4);


    }

    public static void rakamlariTopla(int input) {
        int birlerBasamagi=0;
        int rakamlarToplami=0;
        int temp=input;

        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;
        birlerBasamagi=input%10;
        rakamlarToplami+=birlerBasamagi;
        input/=10;

        System.out.println("girdiğiniz"+temp+"sayısının rakamlar toplamı:"+rakamlarToplami);



    }


}
