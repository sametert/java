import java.util.Scanner;

public class ParaSaymaMakinesi {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir sayı gir");

        int number = keyboard.nextInt();
        int bir, bes, on, yirmibes, elli;
        elli = number / 50;
        number = number % 50;

        yirmibes = number / 25;
        number = number % 25;

        on = number /10;
        number = number % 10;

        bes = number / 5;
        number = number % 5;

        bir = number / 1;
        number = number % 1;
        

        System.out.println("Elli kuruş sayısı : "+ elli );
        System.out.println("Yirmi bes kuruş sayısı : "+ yirmibes );
        System.out.println("On kuruş sayısı : "+ on );
        System.out.println("Bes kuruş sayısı : "+ bes );
        System.out.println("Bir kuruş sayısı : "+ bir );

        keyboard.close();




    }
}
