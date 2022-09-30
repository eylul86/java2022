package day35_inheritancedaConstructorKullanimi;

public class AGrandParent {


    protected  String isim="Grandpa ismi belirtilmedi";


    //her classta gorunmese bıle bır constructor vardır
  //  bu classta obje olusturmak ıstedıgımızde default constructor devreye girer

protected  String granpaKlupAdi="grandpa klubu";
AGrandParent() {
    System.out.println("grandpa constructor calişti");
}


}
