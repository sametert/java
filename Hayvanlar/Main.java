package Hayvanlar;

public class Main {
    public static void main(String[] args) {

        Hayvan[] ciftlik =  new Hayvan[10];
       
       
        // Hayvan[] ciftlik = new Hayvan[]{new Koyun(4), new Tavsan(4), new Kedi(4)};

        // for(Hayvan cift : ciftlik) {
        //     System.out.println("hayvan türü " + cift.hayvanTuru);
        //     System.out.println("Ayak sayisi " + cift.ayakSayisi);
        // }

        ciftlik[0] = new Koyun(4);
        System.out.println("Bu hayvanin türü " + ciftlik[0].hayvanTuru);

        ciftlik[1] = new Tavsan(4);
        System.out.println("Bu hayvanin ayak sayisi " + ciftlik[1].ayakSayisi);

        ciftlik[2] = new Kedi(4);
        System.out.println("Bu hayvanin ayak sayisi " + ciftlik[2].ayakSayisi);


     for(int i = 0 ; i < ciftlik.length; i++) {
        if(ciftlik[i] != null) {
            ciftlik[i].sesCikar();
        }
     }

    }
}
