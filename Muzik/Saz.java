package Muzik;

public class Saz extends MuzikAletleri{
    
    public Saz(int price , String muzikName, String ogrenmeZorlugu , int ogrenmeZamani , String sahibi) {
        super(price, muzikName, ogrenmeZorlugu, ogrenmeZamani, sahibi);
    }

    
    @Override
    public void zorluk() {
        System.out.println("Ogrenme zorlugu " + super.ogrenmeZorlugu);
    }


}
