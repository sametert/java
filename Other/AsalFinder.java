package Other;
import java.util.Scanner;

public class AsalFinder {   
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // System.out.println("5 tane sayi giriniz: ");

        // int[] numbers = new int[5];
        // boolean gecerli = false;
        
        // for(int i = 0; i < 5; i++) {
        //     int number = input.nextInt();
        //     numbers[i] += number;
        //     gecerli = true;  
        // }


        // if((numbers[i] % numbers[i] == 0) && (numbers[i] % 1 == 0)) {
        //     System.out.println("Asal sayilar: " + numbers[i]);
        // }



        System.out.print("Kaç tane sayi gireceksiniz?: ");
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
          System.out.print("Sayi giriniz: ");
          int num = input.nextInt();
          if (isPrime(num)) {
            System.out.println(num + " asal sayidir.");
          } else {
            System.out.println(num + " asal sayi değildir.");
          }
        }
      }
      
      public static boolean isPrime(int num) {
        if (num <= 1) {
          return false;
        }
        for (int i = 2; i < num; i++) {
          if (num % i == 0) {
            return false;
          }  
        }
        return true;
      }
    
        

         

  
    
}
