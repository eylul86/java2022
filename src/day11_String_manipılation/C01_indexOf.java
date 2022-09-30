package day11_String_manipılation;

public class C01_indexOf {
    public static void main(String[] args) {


        String str = "Java ogrenmek cok guzel";
        //herhangı bır strıng yada char'ın ılk kullanıldıgı ındexı bıze dondurur

        System.out.println(str.indexOf('g')); //6
        System.out.println(str.indexOf("r")); //7
        System.out.println(str.indexOf("j"));//-1   kucuk j yok
        System.out.println(str.indexOf("mek")); //  blok olarak dusunur ılk harfın ındexını verır


//eger istedıgımız ındexden sonrasını kontrl etmek ıstersek
// aynı methodu 2 parametrelı  olarak kullanabılırız

        System.out.println(str.indexOf("g", (6 + 1))); //yazılan ındexden baslar
// yukaridaki str'da 2. ve 3. e'nin indexlerini bulun
        // 2.ci e'yi bulabilmek icin 1.e'nin index'ine ihtiyacim var
        int ilke = str.indexOf("e");
        int ikincie = str.indexOf("e", ilke + 1);
        // eger 2. e varsa 3.e'nin olup olmadigini
        // ve varsa index'ini yazdiralim
        if (ikincie == -1) {
            System.out.println("verilen str'da 2.e yok");
        } else {
            int ucuncue = str.indexOf("e", ikincie + 1);
            if (ucuncue == -1) {
                System.out.println("verilen str'da 3. e yok");
            } else {
                System.out.println("verilen str'daki 3.e'nin index'i : " + ucuncue);
            }


        }
    }}
