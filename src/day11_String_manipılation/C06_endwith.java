package day11_String_manipılation;

public class C06_endwith {
    public static void main(String[] args) {

         /*Soru 1) Kullanicidan email adresini girmesini isteyin,
         mail @gmail.com icermiyorsa  "lutfen gmail adresi giriniz",
         @gmail.com ile bitiyorsa  "Email adresiniz kaydedildi " ,
          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
         */


String input="fatih@gmail.com" ;

    if(!input.contains("gmail.com")) {
    System.out.println("LÜTFEN GMAİL ADRESİ GİRİNİZ");
    }else if(input.endsWith("gmail.com")) {
    System.out.println("GMAİL ADRESİNİZ KAYDEDILDI");
}
    else {
        System.out.println("LÜTFEN YAZIMI KONTRL EDİN");


}


    }}

