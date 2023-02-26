import java.util.Scanner;

public class MailFinder {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Bir metin girin: ");
        String metin = keyboard.nextLine();
        // System.out.println("Girdigimiz metin : " + metin);

        for(int i = 0;  i < metin.length(); i++) {
            
            if(metin.charAt(i) == '@') {
                int k,j;
                for(k = i; k >= 0; k--) {
                    // System.out.println(k);
                    if(metin.charAt(k) == ' ') {
                        // System.out.println(k);
                        break;
                    }
                }

                for(j = i; j< metin.length(); j++) {
                    // System.out.println(j);
                    if(metin.charAt(j) == ' ') {
                        // System.out.println(j);
                        break;
                    }
                }

                System.out.println(metin.substring(k+1, j));
                break;
                
            }

        }
        
    }
}
