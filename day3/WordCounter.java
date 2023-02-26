package day3;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Bir cümle girin: ");
        int kelimeSayisi = 0;
        String cumle = keyboard.nextLine();
        boolean bosluk = false;


        for(int i = 0; i < cumle.length()-1; i++) {
            if( ('a' <= cumle.charAt(i) && cumle.charAt(i) <= 'z') || ('A' <= cumle.charAt(i) && cumle.charAt(i) <= 'Z')) {
                if( (cumle.charAt(i+1) == ' ') && (bosluk == false)) {
                    if(i == cumle.length() - 2){
                        break;
                    }
                    kelimeSayisi++;
                    bosluk = true;

                }else {
                    bosluk = false;
                }

            }

        }
        kelimeSayisi++;
        System.out.println("Kelime sayisi: " + kelimeSayisi);

        keyboard.close();
        
    }
    
}
