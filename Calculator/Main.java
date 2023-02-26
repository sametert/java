package Calculator;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Toplama sonucu: " +  calculator.toplama(2, 5,7));
        System.out.println("Çikarma sonucu: " + calculator.toplama(5,2.5));
        System.out.println("Faktoriyel sonucu: " + calculator.faktoriyel(5));

        System.out.println("Islem sayisi " + Calculator.getIslemSayisi());


        Calculator yeniHesapMakinesi = new Calculator();
        System.out.println("Yeni hesap makinesinde toplama sonucu: " + calculator.faktoriyel(4));
        System.out.println("Islem sayisi " + Calculator.getIslemSayisi());

        Kare kare = new Kare(5);
        System.out.println("Karenin cevresi: " + kare.cevre());

        Dikdortgen dikdortgen = new Dikdortgen(5, 10);
        System.out.println("Dikdortgenin cevresi : " + dikdortgen.cevre());
    }

    
}
