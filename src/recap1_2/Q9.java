package recap1_2;

public class Q9 {
    public static void main(String[] args) {
        /*
Final notu tanimlayin, Nested Ternary ile cozunuz
'A'  ->  "Gayet Basarili"
'B'  ->  "Basarili"
'C'  ->   "Ha gayret"
bu notlar disindakilere de Digerleri.. yazdiriniz
 */



        char finalNotu='B';
        String result=finalNotu=='A'? "gayet basarılı" :finalNotu=='B'? "Basarili" :finalNotu=='C'? "Ha gayret" : "diğerleri..";
        System.out.println("result = " + result);



    }

}
