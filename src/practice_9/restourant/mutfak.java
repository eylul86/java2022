package practice_9.restourant;

public class mutfak {

    public  String yemekler="adanaKebap, urfaCiger,kusbasi,kusleme";
    public  String araSicak="yaylaCorba,mercimek,dugunCorba,corba";
    public  String tatlilar="baklava, gullac,kazandibi,gullac";
    public  String icecekler="ayran,salgam,kola";



    public mutfak(String adanaKebap, String mercimek, String baklava, String salgam) {
        this.yemekler=adanaKebap;
        this.araSicak=mercimek;
       this.tatlilar=baklava;
        this.icecekler=salgam;





    }

    public mutfak() {

    }


    @Override
    public String toString() {
        return "mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                "\naraSicak='" + araSicak + '\'' +
                "\ntatlilar='" + tatlilar + '\'' +
                "\nicecekler='" + icecekler ;
    }
}
