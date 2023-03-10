package overriding;

public class Main {
    
    public static void main(String[] args) {

        // OgretmenKrediManager ogretmenKrediManager = new OgretmenKrediManager();
        // System.out.println(ogretmenKrediManager.hesapla(1000));
        

        // BaseKrediManager baseKrediManager = new BaseKrediManager();
        // System.out.println(baseKrediManager.hesapla(1000));

        BaseKrediManager[] baseKrediManagers = new BaseKrediManager[]{new TarimKrediManager(), new OgretmenKrediManager()};

        for(BaseKrediManager baseKrediManager : baseKrediManagers) {
            System.out.println(baseKrediManager.hesapla(1000));
        }
    }
}
