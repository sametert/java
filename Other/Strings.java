package Other;
public class Strings {
    public static void main(String[] args) {
        String metin = "Hello World";

        // System.out.println((char)(metin.charAt(0)));

        // System.out.println(metin.startsWith("H"));
        // System.out.println(metin.startsWith("e"));

        // System.out.println(metin.endsWith("d"));

        // char[] karakterler = new char[6];
        // karakterler[0] = '.';

        // metin.getChars(0, 5, karakterler, 1);

        // System.out.println(karakterler);


        String yeniMetin = metin.substring(2,5);
        int yeni  = metin.indexOf("W");
        int yeni2 = metin.codePointAt(0);
        

        System.out.println(yeni);
        System.out.println(yeniMetin);
        System.out.println(yeni2);



        
    }
    
}
