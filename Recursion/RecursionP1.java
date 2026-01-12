import java.util.*;
public class RecursionP1 {
    public static void name(int i, String naam){
        if (i==0){
            return;
        }
        System.out.println(naam);
        name(i-1, naam);
    }
     
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String naam = sc.nextLine();
        name(5, naam);
    }
}
