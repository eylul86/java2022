package day10_stringManipulation;

public class C03_equals {
    public static void main(String[] args) {

        String str1="Ali Can";
        String str2="Ali CAN";
        String str3="ALİ Can"+"";
        String str4="ALİ CAN";
        String str5=new String("ALİ CAN");

        System.out.println(str1==str2); //false
        System.out.println(str1==str3); //false
        System.out.println(str1.equals(str3)); //true
        System.out.println(str1==str5); // false
        System.out.println(str1.equals(str5)); // true
        System.out.println(str1.equals(str4)); // true
        System.out.println(str3.equals(str5)); // true
        System.out.println(str3==str5); // false
        /*
         String'lerde ayni String olsa bile == herzaman calismaz
         emin olmak isterseniz equals() kullanmalisiniz
         equals() kullandigimizda dikkat edecegimiz TEK SEY Metinlerin bire-bir ayni olmasidir
         */
    }
}


