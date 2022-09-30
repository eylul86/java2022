package practice_4;

public class Q04_ForLoop {
    
    
       /*
        100'den 0'a kadar 13'e tam bölünebilen sayıları ekrana yazdırınız (büyükten küçüğe).
        Ekran Çıktısı asagidaki sekilde olsun; ayrica sonrasinda bu sayilarin toplamini da yazdirin
        istenen sonuc :
         91
         78
         65
         52
         39
         26
         13       */


    public static void main(String[] args) {


        int toplam=0;
        System.out.println("istenen sonuc:");
        for (int i = 100; i>=0; i--) {
            if (i%13==0){
                System.out.print(i+" ");
                toplam+=i;
            }
            
        }
        System.out.println();
        System.out.println("1-100 arasindaki  13 ile bolunen sayilarin toplami:  "+toplam+" olur");
    }
    
}
