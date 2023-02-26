package Polymorphism;

public class Main {

    public static void main(String[] args) {
        // EmailLogger emailLogger = new EmailLogger();

        // emailLogger.log("Baglanti kuruldu");

        // int[] dizi = new int[]{2,3,4,5};

        // for(int arr : dizi) {
        //     System.out.println(arr);
        // }


        /* I. ORNEK
        BaseLogger[] loggers = new BaseLogger[]{new FileLogger(), new EmailLogger(), new DataBaseLogger(), new ConsoleLogger()}; //tak çalıştır (plug and play)

        for(BaseLogger logger : loggers) {
            logger.Log("Log mesaji");
        }
        */

        CustomerManager customerManager = new CustomerManager(new ConsoleLogger());
        customerManager.add();
    }
    
}
