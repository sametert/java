package Hayvanlar;

public class Kedi extends Hayvan{

    public Kedi(int ayakSayisi) {
        super(ayakSayisi, "Koyun");
    }

    @Override
    public void sesCikar()  {
        System.out.println("Miyavvv ");
    }

}
