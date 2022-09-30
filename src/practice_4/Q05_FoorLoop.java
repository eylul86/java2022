package practice_4;

public class Q05_FoorLoop {
    public static void main(String[] args) {

// 0-255 e kadar olan harflerin , sayı ve harf değerini ekrana yazdırınız.


        System.out.println("FOR İLE");
        for (int i = 0; i <=255 ; i++) {

            char c = (char) i; //casting yaptık sayı harf karakter için
            System.out.println(i+"-->"+c);


        }

        System.out.println("WHİLE İLE");

        int i = 0;
        while (i <= 255){
            char sembol= (char) i;

            i++;
            System.out.print(i+"-"+sembol);

        }
        System.out.println("do while");
        int a=0;
        do{
            char karakter= (char) a;
            System.out.println(a+" "+karakter);
            a++;
        }while(a<=255);
    }
}
