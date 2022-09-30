package day09_ternary;



public class C06_SwitchCase {

    public static void main(String[] args) {


        /*kullanıcıdan deger alın haftiöi yada haftasonu oldugunu yazdırın*/


        String input = "pazartesi";

        switch (input) {

            case "pazartesi":

                System.out.println("HAFTAİÇİ");
                break;
            case "salı":

                System.out.println("HAFTAİÇİ");
                break;

            case "carsambai":

                System.out.println("HAFTAİÇİ");
                break;
            case "persembe":

                System.out.println("HAFTAİÇİ");
                break;

            case "cuma":

                System.out.println("HAFTAİÇİ");
                break;
            case "cumartesi":

                System.out.println("HAFTASONU");
                break;
            case "pazar":

                System.out.println("HAFTASONU");
                break;
            default:
                System.out.println("gecerli gün giriniz");}




                switch (input) {

                    case "pazartesi":
                        case "salı":
                            case "carsambai":

                                case "persembe":
                                    case "cuma":

                        System.out.println("HAFTAİÇİ");
                        break;
                    case "cumartesi":

                        case "pazar":

                        System.out.println("HAFTASONU");
                        break;
                    default:
                        System.out.println("gecerli gün giriniz");}


                }


        }

