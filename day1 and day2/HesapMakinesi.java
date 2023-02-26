import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1, number2;
        System.out.println("İki tane sayı girin: " );
        number1 = scan.nextInt();
        number2 = scan.nextInt();
        int islem;
        System.out.println("İslemi girin(1: toplama, 2: cikarma, 3:çarpma, 4:bölme): ");
        islem = scan.nextInt();

        int sonuc = 0;

        // switch (islem) {
        //     case 1:
        //         sonuc = number1 + number2;
        //         break;

        //     case 2:
        //         sonuc = number1 - number2;
        //         break;

        //     case 3:
        //         sonuc = number1 * number2;
        //         break;

        //     case 4:
        //         sonuc = number1 / number2;
        //         break;
        // }

        // System.out.println("Sonuç " + sonuc);

        if(islem == 1) {
            sonuc = number1 + number2;
        }else if(islem == 2) {
            sonuc = number1 - number2;
        }else if(islem == 3) {
            sonuc = number1 * number2;
        }else if(islem == 4) {
            sonuc = number1 / number2;
        }

        System.out.println("Sonuç " + sonuc);

    }
}
