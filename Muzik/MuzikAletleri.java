package Muzik;

public class MuzikAletleri {

    int price;
    String muzikName;
    String ogrenmeZorlugu;
    int ogrenmeZamani;
    String sahibi;

    // public MuzikAletleri() {

    // }

    public MuzikAletleri(int price , String muzikName, String ogrenmeZorlugu , int ogrenmeZamani , String sahibi) {
        this.price = price;
        this.muzikName = muzikName;
        this.ogrenmeZorlugu = ogrenmeZorlugu;
        this.ogrenmeZamani = ogrenmeZamani;
        this.sahibi = sahibi;
    } 

    public void zorluk() {
        System.out.println("Ogrenme zorlugu " + ogrenmeZorlugu);
    }


    public void ana() {
        System.out.println("Ana method");
    }
    


    
    
}
