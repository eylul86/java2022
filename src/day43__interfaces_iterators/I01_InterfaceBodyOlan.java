package day43__interfaces_iterators;

public interface I01_InterfaceBodyOlan {

void  motor();
public void yakit();

public abstract String aku();

  /* normal bır class da olusturdugumuzu dusunursek
ıkı tane access modifier kullanma ihtımalı olmaz

asagıdakı method da gorecegınız gıbı interface deistisnai olarak
 body sı olan methodlar olsuturulabılır
bu ozellık java 8 den sonra bir interface yenı bır method eklememız gerektıgınde
eskıden berı bu ınterface implement eden tum claslara gıdıp yeni eklenen methodu overrıde etmemız gerekırdi


bu ozellik sayesinde basina default veya statıc keyword ekleyerek interfacede yenı ve bodysi olan
bır method olusturrsak bu methodun chıld classlar tarafından overrıde edılme mecburıyetı olmaz
eskıden implement etmıs clasları degıstırmemız gerekmez

bu ıstısnaı bır durum ınterface ıcın olusturulan genel kuralları bozmaz

o zaman nıcın 2 keyword (statıc ve default) tanımlanmıstır
bu ıkı farklı kelımenın amacı
child claslardan bu methoda nasıl erısılebılecegını belırtmek ıcındır
statıc keyword kullanırsa child class dan bu method erişmek icin
interfaceAdi.method.adi yeterli olur
default keyword kullanilirsa, method'a erismek icin obje olusturulmalidir.

 */

    public  default  void teker(){
        System.out.println(" DEFAULT tüm arabaların tekeri vardır");


    }

    public  static  void direksiyon(){
        System.out.println("STATIC tüm arabaların direksiyonu vardır");
    }


}
