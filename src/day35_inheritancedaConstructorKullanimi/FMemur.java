package day35_inheritancedaConstructorKullanimi;

public class FMemur extends EMuhasebe{



    FMemur(){

        System.out.println("memeur parametresız const");


    }
    FMemur(String isim){

        System.out.println("memur parametreli cons");
    }


    public static void main(String[] args) {

        FMemur memur1 = new FMemur();
    }
}
