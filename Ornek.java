public class Ornek {

    public static void main(String[] args) {
       int fakt = allNumbers(5);
       System.out.println(fakt);
       System.out.println("hello world");

       int dogum = birthdayYear(2001);
       System.out.println(dogum);
    }
    

    
public static int allNumbers(int num) {
    if(num < 1){
        return 1;
    }else {
        return num * allNumbers(num -1);   
    }
}


public static int birthdayYear(int year){
    return 2023 - year;
}
}

