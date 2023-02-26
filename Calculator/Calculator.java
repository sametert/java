package Calculator;

public class Calculator {
    private static int islemSayisi = 0;


    //overloading
    public double toplama(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 + sayi2;
    }

    public double toplama(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 + sayi2 + sayi3;
    }

    public double cikarma(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 - sayi2;
    }

    public double cikarma(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 - sayi2 - sayi3;
    }


    public double carpma(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 * sayi2;
    }

    public double carpma(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 * sayi2 * sayi3;
    }

    public double bolme(double sayi1, double sayi2, double sayi3) {
        islemSayisi++;
        return sayi1 / sayi2 / sayi3;
    }


    public double bolme(double sayi1, double sayi2) {
        islemSayisi++;
        return sayi1 / sayi2;
    }




    public double faktoriyel(double sayi) {
        if(sayi == 0) {
            islemSayisi++;
            return 1;
        }

        return sayi * faktoriyel(sayi - 1);

    }

    // public double cevresiniBul() {
    //     islemSayisi++;
    //     return sekil.cevre();
    // }

    public double alaniniBul(Sekil sekil) {
        islemSayisi++;
        return sekil.alan();
    }

    public static int getIslemSayisi() {
        return islemSayisi;
    }


    
}
