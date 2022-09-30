package grupCalısması;

public class forDongu {
    public static void main(String[] args) {

        int sayi=20;
        int sayac=0;
        for (int i =-sayi; i <=-1 ; i++){
            if (sayi%i==0){
                System.out.print(i + " ");
                sayac++;
            }
        }
        System.out.println("");
        for (int i =1; i <=sayi ; i++) {
            if (sayi%i==0) {
                System.out.print(i+ " ");
                sayac++;
            }
        }
        System.out.println("");
        System.out.println(sayi + "'in toplam " + sayac + " tane tam bolen sayisi vardir");
    }
}


