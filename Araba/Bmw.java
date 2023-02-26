package Araba;

public class Bmw extends Arac{
    private final String marka = "Bmw";
    public Bmw(int tekerSayisi , String arabaSahibi,double maxHiz) {
        super(tekerSayisi,arabaSahibi, maxHiz);
    }

    public String getMarka() {
        // marka = "Audi";  final verdin hata
        return marka;
    }
    
    @Override
    public String getArabaSahibi() {
        return "Bu Bmw'in sahibi: " + super.getArabaSahibi();
    }
}
