package recap1_2;

public class Q12_Day2_Nested {
    public static void main(String[] args) {

/*
   0 ~ 9 arasındaki sayilari cevirebilen bir java programi yazin
  kelimelere, sayı 9'dan buyuk veya sifirdan kucukse,
  cikis "Gecersiz" olmalidir
  NestedIf ve Ternary kullanarak 2 yolla da cozunuz
*/
int sayi=5;
String sonuc="";
if (sayi>0 &&sayi<9) {
    if (sayi==9){sonuc="DOKUZ";
        } else if (sayi==8){sonuc="SEKİZ"; }
         else if (sayi==7){sonuc="YEDİ";}
         else if (sayi==6){sonuc="ALTI"; }
        else if (sayi==5){sonuc="BEŞ"; }
         else if (sayi==4){sonuc="DÖRT"; }
         else if (sayi==3){sonuc="ÜÇ"; }
         else if (sayi==2){sonuc="İKİ";}
         else if (sayi==1){sonuc="BİR"; }
         else sonuc="sifir";
    }else  sonuc="GEÇERSİZ";
        System.out.println("sonuc = " + sonuc);


        int num=4;
        String result=num==9?"dokuz" : num==8?"sekiz": num==7?"YEDİ" : num==6?"ALTI" :
                num==5?"BEŞ": num==4?"DÖRT":num==3?"ÜÇ": num==2?"İKİ":
                        num==1?"BİR":
        num==0 ? "sifir" :"gecersiz";
        System.out.println("result = " + result);







        }
}