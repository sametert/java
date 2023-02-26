package Araba;

public class Togg extends Arac{

    private final String marka = "TOGG";
    public Togg(int tekerSayisi , String arabaSahibi , double maxHiz) {
        super(tekerSayisi,arabaSahibi, maxHiz);
    }

    public String getMarka() {
        // marka = "Audi";  final verdin hata
        return marka;
    }

    @Override
    public String getArabaSahibi() {
        return "Bu Togg'un sahibi: " + super.getArabaSahibi();
    }
    
}
