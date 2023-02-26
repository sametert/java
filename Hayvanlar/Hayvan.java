package Hayvanlar;

public class Hayvan {
    public int ayakSayisi;
    public String hayvanTuru;

    public Hayvan(int ayakSayisi, String hayvanTuru) {
        this.ayakSayisi = ayakSayisi;
        this.hayvanTuru = hayvanTuru;
    }

    public void sesCikar()  {
        System.out.println("Hayvan sesi ");
    }
}
