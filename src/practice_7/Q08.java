package practice_7;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Q08 {


    public static void main(String[] args) {
        List<String> databaseIsimler = new ArrayList<>();
        databaseIsimler.add("Enes");
        databaseIsimler.add("Ismail");
        databaseIsimler.add("AbdulBaki");
        databaseIsimler.add("Emre");
        databaseIsimler.add("Melisa");
        databaseIsimler.add("Oguz");
        System.out.println("databaseIsimler = " + databaseIsimler);
        Scanner scan = new Scanner(System.in);
        System.out.println("kullanmak istediginiz username i giriniz :");
        String username = scan.nextLine().trim();
        boolean usernameVarmi = databaseIsimler.contains(username);
        if(usernameVarmi){
            System.out.println("bu kullanici adi zaten alinmis");
        }else System.out.println("bu kullanici adini kullanabilirsiniz");
        if(usernameVarmi){
            int randomSayi = new Random().nextInt(100);
            username = username + "" + randomSayi;
            System.out.println("yeni kullanici adiniz :" + username);
            databaseIsimler.add(username);
            System.out.println("databaseIsimler = " + databaseIsimler);
        }else{
            System.out.println("yeni kullanici adiniz :" + username);
        }
    }
}


