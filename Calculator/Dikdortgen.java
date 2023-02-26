package Calculator;

public class Dikdortgen extends Sekil{
    int kenar, kenar2;

    public Dikdortgen(int kenar, int kenar2) {
        super();
        this.kenar = kenar;
        this.kenar2 = kenar2;
    }

    public int cevre() {
        return (kenar + kenar2) * 2;
    }

    public int alan() {
        return kenar * kenar2;
    }
}
