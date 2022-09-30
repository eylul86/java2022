package day35_inheritancedaConstructorKullanimi;

public class EMuhasebe extends DPersonel {

    EMuhasebe(){


        System.out.println("muhasebe parametresiz");
    }

EMuhasebe(String isim){

    System.out.println("muhasebe parametreli cons");
}


}


