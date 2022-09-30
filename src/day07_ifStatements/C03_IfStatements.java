package day07_ifStatements;

public class C03_IfStatements {
    public static void main(String[] args) {

        int sayi=20;

        if (sayi>0) {
            System.out.println("sayi pozitif");
            System.out.println("pozitif kalacaktır");
            System.out.println("ücüncü satır");
        }

        if (sayi%2==0) {
            System.out.println("sayi çifttir" );
            System.out.println("çift kalacaktir");
        }
        if (sayi%5==0){
            System.out.println("sayi 5'in tam katı");
        }

    }

}

 /*
        Bir if statement'da { kullanilmazsa
        Java ilk satiri sart ile baglar, sonraki satirlar bagimsiz olur

        SÜSLÜ PARANTEZ ALIRSAN HEPSİNİ KAPSAR ALMAZSAK TEK SATIR CALISIR DIGERLERİ HER HALUKARDA CALISIR

         */



//EGER BIRDEN FAZLA SATIR AYNI IF SARTINA BAGLANMISSA SUSLU PARANTESZ SART

 /*
        basit if cumleleri kodun diger parcalarindan bagimsizdir
        sadece bir sart kontrol eder, sart saglaniyorsa, if body calisir, yoksa calismaz
        birden fazla basit if cumlesi varsa girilen sarta bagli olarak,
        tumunde if body'si calisabilir, kismen if body'leri calisabilir
        veya hicbir if body'si calismayabilir
         */

