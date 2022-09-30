package day04_dataCasting;

public class C04_ExpilicitNarrowing {
    public static void main(String[] args) {

        int sayi1=-132;
                byte sayi2= (byte) sayi1;
        System.out.println(sayi2);

                //geniş data turundeki degeri dar data türündekı variable a
        //atamak ısterseniz java sızın genıs data turundeki degerin
        //dar data turunun sınırlarına uyup uymayacagını
        // calıstırana kadar bılemz
        // ama java rısk almaz
        //rıskı sıfıra ındrmek ıcın  sorumlulugu kabuk etmenızı bekler
        //degerin öune parantes ıcınde data turunu yaz

        int rakam=130;
        short rakam2=(short) rakam;
        System.out.println(rakam2);
        byte rakam3=(byte)rakam2;
        System.out.println(rakam3);

        //int veri turunde bır degıskenı adım adım narrowıng yapın





    }
}
