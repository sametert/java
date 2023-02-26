package day3;


public class Methods {
    public static void main(String[] args) {
        printHello();
        print("hola");
        int x = sayiToplayici(5, 7);
        System.out.println(x);
        printNumber(10);
        System.out.println(faktoriyel(5));
        int a = 5;
        
        test(5);

    }

    public static void printHello() {
        System.out.println("Hello");
    }

    public static void print(String yazilacak) {
        System.out.println(yazilacak);    
    }

    public static int sayiToplayici(int sayi1 , int sayi2) {
        return sayi1 + sayi2;
    }

    public static void printNumber(int number1) {
        String sonuc = "";
        for(int i = 0; i < number1; i++) {
            sonuc += i + ", ";
        }

        sonuc = sonuc.substring(0, sonuc.length() - 2);
        System.out.println(sonuc);       
    }

    public static int faktoriyel(int say1) {
        int sonuc = 1;
        for(int i = 1; i < say1; i++) {
            sonuc *= 1;

        }
        return sonuc;
        
    }

    public static void test(int a) {
        a = a+2;
        System.out.println(a);
        
    }

   
    
}
