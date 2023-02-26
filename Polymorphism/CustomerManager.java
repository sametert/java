package Polymorphism;

public class CustomerManager {

    private BaseLogger baseLogger;

    public CustomerManager(BaseLogger baseLogger) {
        this.baseLogger = baseLogger;
    }

    public void add() {
        System.out.println("Müsteri eklendi");
        //bu datayı kim ekledi. bu müşteriyi kim ekledi
        //bu sistem bağımlı bir sistemdir. Biz database bağımlı olduk. Bir classın içinde başka bir classı new lemememiz lazım. Bunun yerine yukarda yapıyorum.
       
        // DataBaseLogger dataBaseLogger = new DataBaseLogger();
        // dataBaseLogger.log("Log message");
       

        this.baseLogger.log("Loglandi");
    }
    
}
