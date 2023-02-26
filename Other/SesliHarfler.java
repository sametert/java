package Other;
import java.util.Scanner;

public class SesliHarfler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen harf giriniz: ");
        char harf = input.nextLine().charAt(0);

        // switch (harf) {
        // case 'a':
        // System.out.println("Girdigin harf kalin seslidir. " + harf);
        // break;
        // case 'I':
        // System.out.println("Girdigin harf kalin seslidir. " + harf);
        // break;
        // case 'o':
        // System.out.println("Girdigin harf kalin seslidir. " + harf);
        // break;
        // case 'u':
        // System.out.println("Girdigin harf kalin seslidir. " + harf);
        // break;
        // default:
        // System.out.println("Girdigin harf ince seslidir. " + harf);
        // break;
        // }

        if (harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u' ||
        harf == 'E' || harf == 'I' || harf == 'O' || harf == 'U') {
            System.out.println("Ince sesli harf");
        } else {
            System.out.println("Kalın sesli harf");
        }

    }
}
