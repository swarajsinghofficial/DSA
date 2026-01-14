import java.util.Scanner;
public class RecursionP3 {
    public static void RecP3(int n){
        if (n<1){
            return;
        }
        
        System.out.println(n);
        RecP3(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        RecP3(n);
        
        
    }
    
}
