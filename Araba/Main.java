package Araba;

public class Main {

    public static void main(String[] args) {
        Arac araba = new Arac(0, "Samet", 200);
        // System.out.println(araba.getTekerSayisi() + " " + araba.getArabaSahibi());

        Togg togg = new Togg(6,"Kerim", 500);
        System.out.println("TOGG'un teker sayisi " + togg.getTekerSayisi());
        // System.out.println("Togg 'un max hiz " + togg.getMaxHiz());
        // System.out.println("Togg'un markasi " + togg.getMarka());
        System.out.println(togg.getArabaSahibi());

        Bmw bmw = new Bmw(4, "Ahmet", 275);
        // System.out.println("Bmw 'in teker sayisi " + bmw.getTekerSayisi());
        // System.out.println("Bmw 'un max hiz " + bmw.getMaxHiz());
        // System.out.println("Bmw'un markasi " + bmw.getMarka());

    }
    
}
