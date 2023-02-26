package OOP;

public class Classes {
    public static void main(String[] args) {
        CustomerManager customerManager;
        CustomerManager customerManager2 = new CustomerManager();
        customerManager = customerManager2;

        customerManager.Add();
        // customerManager.Remove();
        // customerManager.Update();

        customerManager2.Add();
        // customerManager2.Remove();
        // customerManager2.Update();

        //back sent e ulaşmak
        // CustomerManager.backSent();

        // value type
        // int sayi1 = 10;
        // int sayi2 = 20;
        // sayi2 = sayi1;
        // System.out.println(sayi1 + " " +sayi2);

        // sayi1 = 30;
        // System.out.println(sayi2);
        // System.out.println(sayi1);

        // reference type
        // int[] sayilar1 = new int[]{1,2,3};
        // int[] sayilar2 = new int[]{4,5,6};

        // sayilar2 = sayilar1;
        // sayilar1[0] = 10;

        // System.out.println(sayilar2[0]);

        // DortIslem dortIslem = new DortIslem();
        // int result = dortIslem.Carp(3, 4);
        // int sonuc  = dortIslem.Bolme(12, 3);
        // System.out.println(result);
        // System.out.println(sonuc);

    }

}


