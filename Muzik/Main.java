package Muzik;

public class Main {
    public static void main(String[] args) {

        MuzikAletleri muzikAletleri = new MuzikAletleri(100, " ", "yari zorluk", 12, "Samet");
        // muzikAletleri.zorluk();

        Saz saz = new Saz(150,"Saz","basit", 6, "Gazi Ertürk");
        System.out.println(saz.muzikName);
        saz.zorluk();
        saz.ana();

        Keman keman = new Keman(200,"Keman","zor",24,"Samet");
        keman.zorluk();

        
    }
    
}
