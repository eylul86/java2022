package grupCalısması;

public class Arrays_max_rakam {
    public static void main(String[] args) {


        int []sayilar={44,7,31,33,90};

        maxSayi(sayilar);

    }

    private static void maxSayi(int[] sayilar) {

        int max=sayilar[0];
        for (int i = 1; i < sayilar.length ; i++) {

            if (sayilar[i] > max) {
                max=sayilar[i];
            }

        }
        System.out.println("max="+max);
    }
}
