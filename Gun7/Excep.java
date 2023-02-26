package Gun7;

public class Excep {

    public static void main(String[] args) {
        // int x = 5/0;

        try {
            //normal kodu yaz. Çalıştırmayı deniyor.
            int x = 5/0;
            // System.out.println("devam");

            int[] array = new int[5];
            array[6] = 2;
        } catch (ArithmeticException e) {
            System.out.println("aritmetik hata");
            // TODO: handle exception
            // System.out.println("Hata verdi");
            System.out.println(e.getMessage());  //hatanın mesajı
        }catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
    
}
