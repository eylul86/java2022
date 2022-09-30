package practice_1_2;

import java.util.Scanner;

public class Q_12If {
    public static void main(String[] args) {

        /*
        Print "Lutfen is unvaninizi girin
        jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
        Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
        Eger jobTitle  qa ise print is unvaniniz Quality Analyst
        test data: qa ise print Quality Analyst
        dev ise print Developer
        ba ise print Business Analyst
        pm ise print Project Manager
       */
        System.out.println("lütfen iş unvanınızı giriniz");


     Scanner scan=new Scanner(System.in);
     String jobTitle= scan.nextLine().toLowerCase();

        if (jobTitle.equals("qa")) {
            System.out.println("Quality Analyst");

       } else if (jobTitle.equals("de")) {
            System.out.println("development");
        }else if (jobTitle.equals("ba")) {
            System.out.println("Business Analyst");
        }else if (jobTitle.equals("pm")){
            System.out.println("Project Manager");
        }else
            System.out.println("yanlıs giriş yaptınız");



        switch (jobTitle){
            case "qa" :
                System.out.println("Quality Analyst");
                break;
            case "dev":
                System.out.println("Development");
                break;
            case "ba":
                System.out.println("Business Analyst");
                break;
            case "pm":
                System.out.println("Project Manager");
                break;
            default:
                System.out.println("yanlıs giriş yaptınız");
                break;

        }

    }
}
