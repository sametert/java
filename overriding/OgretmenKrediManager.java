package overriding;

public class OgretmenKrediManager extends BaseKrediManager {
    public double hesapla(double tutar) {
        return (tutar * 2.50);
    }
    
    
}
