package practice_1_2;

public class Q04_JavaVariable {
    public static void main(String[] args) {

// Initializing Variable  //variable baslangic degeri verme
        int yas = 33;

        double boy = 1.70;
        System.out.println("Yas: " + yas);

        System.out.println("double: " + boy);


// To copy the variable's value

        int yasim = 33;
        int enesYas = yasim;
        System.out.println("enesYas: " + enesYas);
        System.out.println("yasim: " + yasim);

        int yil = 2022, ay = 6, gun = 20;

        System.out.println("yil: " + yil);
        System.out.println("gun: " + gun);
        System.out.println("ay " + ay);

        yil = 2032;

        System.out.println("update yil: " + yil);


// you can declare multiple variables in the same line

// updating a variable


//Bir degisken tanimlayin : x
//Baska bir degiskeni initialize edin : y
//x degiskenini initialize edin
//y degiskenini yeni bir degerle guncelleyin


        int x; //deklarasyon
        int y=2000; //initialize

        x=30;
        y=1;// güncelleme


        System.out.println("x = " + x);
        System.out.println("y = " + y);





    }
}
