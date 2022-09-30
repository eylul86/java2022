package grupCalısması;

public class Arrays_uzun_isim {
    public static void main(String[] args) {


String [] isimler={"buket","songül","ela","safiye","sati","süreyya","mustafa"};

uzunIsim(isimler);

    }

    private static void uzunIsim(String[] isimler) {

 String uzunIsim=isimler[0];
 String kisaIsim=isimler[0];

        for (int i = 1; i < isimler.length ; i++) {

            if (isimler[i].length()>=uzunIsim.length()) {
                uzunIsim=isimler[i];

                //esitlık koymadan once sureyya uzun kelıme esitlık
                // koyunca yenı kelıme uzun oluyor

            }if (isimler[i].length()<kisaIsim.length()) {
                kisaIsim=isimler[i];
            }

        }
        System.out.println("kisaIsim = " + kisaIsim);
        System.out.println("uzunIsim = " + uzunIsim);
    }
}
