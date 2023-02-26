public class WhileLoop {
    public static void main(String[] args) {
        
        // int x = 0;
        // while (x <= 10) {
        //     System.out.println(x);
        //     x++;
        // }

        // for (int i = 1; i <= 10 ; i++) {     //çarpım tablosu
        //     for (int j = 1; j <= 10; j++) {
        //         System.out.println(i*j);
        //     }
        // }

        int y = 0;         //Koşul yanlış olsa bile döngü her zaman en az bir kez yürütülür.
        do {
            System.out.println(y);
            y++;
        } while (y <= 10);
       
    }
}
