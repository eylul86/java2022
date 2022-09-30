package day43__interfaces_iterators;

public class M02_Child implements I01_InterfaceBodyOlan{
    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }
/*parent interfacede abstract olan 3 methodu ımplement ettıgımızde
java itirazını durdurur sonrdan ekledıgımız
default veya statıc keyword ıle tanımladıgımı methodları implements etmememız sorun olusturmadı
 */

    public static void main(String[] args) {
        I01_InterfaceBodyOlan.direksiyon();

        M02_Child object = new M02_Child();
        object.teker();
    }
}
