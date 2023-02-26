package Other;
public class AkademiArrays {
    public static void main(String[] args) {
        // String ogrenci1 = "Samet";
        // String ogrenci2 = "Engin";
        // String ogrenci3 = "Mustafa";

        // System.out.println(ogrenci1 + " " + ogrenci2 + " " + ogrenci3);

        // String[] ogrenciler = new String[2];
        // ogrenciler[0] = "Samet";
        // ogrenciler[1] = "Meltem";
        // ogrenciler[2] = "Furkan";


        // String[] colors = {"blue" , "orange","pink" , "purple"};
        

        // System.out.println(ogrenciler);
        
        //foreach loop
        // for(String ogrenci : ogrenciler) {
        //     System.out.println(ogrenci);
        //     // System.out.println(ogrenciler[0]);
        // }

        // for(int i = 0; i < ogrenciler.length ; i++) {
        //     System.out.println(ogrenciler[i]);
        // }



        //uygulama
        double[] myList = {1.2 , 9.3 , 4.3 , 5.6};
        double toplam = 0;
        double max = myList[0];

        for (double list : myList) {
            // System.out.println(list); 
            // toplam += list;
            
            if(max < list) {
                max = list;
                
            }
        }
       
        System.out.println("En büyük sayi : " + max);
        // System.out.println(toplam);   

        // for(int i = 0; i < myList.length ; i++) {
        //     toplam += myList[i];
        // }
        // System.out.println("Sayilarin toplami : " + toplam);

        



        

    }
}
