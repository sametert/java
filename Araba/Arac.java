package Araba;

public class Arac {
    private int tekerSayisi;
    private String arabaSahibi;
    private double maxHiz;

    public double getMaxHiz() {
        return this.maxHiz;
    }

    public void setMaxHiz(double maxHiz) {
        this.maxHiz = maxHiz;
    }

    public Arac(int tekerSayisi , String arabaSahibi, double maxHiz) {
        this.tekerSayisi = tekerSayisi;
        this.arabaSahibi = arabaSahibi;
        this.maxHiz = maxHiz;
    }

    public Arac(int tekerSayisi ,  double maxHiz) {
        this.tekerSayisi = tekerSayisi;
        this.maxHiz = maxHiz;
    }



    public String getArabaSahibi() {
        return this.arabaSahibi;
    }

    public void setArabaSahibi(String arabaSahibi) {
        this.arabaSahibi = arabaSahibi;
    }

   

    public int getTekerSayisi() {
        return this.tekerSayisi;
    }

    public void setTekerSayisi(int tekerSayisi) {
        this.tekerSayisi = tekerSayisi;
    }


    
}
