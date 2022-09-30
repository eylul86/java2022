package recap1_2;

public class Q10_day2 {
    public static void main(String[] args) {


/*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/
        String gun = "cuma";
        switch (gun) {
            case "pazartesi":
            case "salı":
                System.out.println("java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("sql dersi");
                break;
            case"persmbe":
                case "cuma" :
                    System.out.println("selenyum");
                    break;
            default:
                System.out.println("İZİN GUNU");
        }

    }
}
