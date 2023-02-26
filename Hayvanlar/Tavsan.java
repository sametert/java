package Hayvanlar;

public class Tavsan extends Hayvan{

    public Tavsan (int ayakSayisi) {
        super(ayakSayisi, "Tavsan");
    }
    
    @Override
    public void sesCikar()  {
        System.out.println("Bilmiyorumm ");
    }
}
