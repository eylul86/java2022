package day34_inheritance;

public class Personel {

 /*
      Eger parent class olacak sekilde tasarladiginiz bir class varsa
      veya ilerde bu class'i parent yapmak isteyenler olabilir diyorsaniz
      variable ve method'larin a
      access modifier'ini protected
     */

   protected int persNo;
    String isim="isim belirtilmedi" ;
    String departman="departman belirtilmedi";





    protected void maas(){
        System.out.println("Tüm personelin maasi vardir" );



    }


   protected void mesai(){
        System.out.println("Tüm personel statüsüne göre mesai yapar");


    }

protected void fazlaMesaiUcrerti(){
    System.out.println("personel fazla mesaı ucretini statusune göre alır");


}
}
