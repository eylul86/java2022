package day13_MethodCreation;

public class C04_MethodCreation {
    public static void main(String[] args) {


        //input olarak 2 ınt topla sonuc yazdır
        // method 4 adımda olusturulur
        //1. adım method call
        //2. adım argument eklenmesı gerekıyorsa ekleyelım
        //eger methodun return type voıd'den farklı olacaksa
        // bır varıable olusturup method kolu assıng edelım

        int input1 = 10;
        int input2 = 20;


        topla(input1, input2);
    }
        public static void topla ( int input1, int input2){

            // 3. adim merhod deklarasyonunda degistirilmesi gereken
            //    bolumleri degistir (access modifier, return Type vb..)
            // 4. adim eger return type void disinda birseyse
            //    return keyword'u ve donecek degeri hesaplamaliyiz
            System.out.println("Girilen iki sayinin toplami : "+ (input1+input2));
        }
}
