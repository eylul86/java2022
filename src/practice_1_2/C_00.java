package practice_1_2;

import java.util.Scanner;

public class C_00 {
    public static void main(String[] args) {




                Scanner scan=new Scanner(System.in);
                System.out.print("Lutfen bir cümle yaziniz : ");
                String str= scan.nextLine();
                System.out.print("Lutfen herhangi bir harf giriniz : ");
                char harf=scan.next().toLowerCase().charAt(0);
                if (str.indexOf(harf)==-1){
                    System.out.println("Girdiginiz harf, yazdiginiz cumlede kullanilmamistir");
                }else {
                    System.out.println("Girdiginiz harf, yazdiginiz cumlede kullanilmistir");
                }
            }
        }

