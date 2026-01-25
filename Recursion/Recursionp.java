import java.util.Scanner;
public class Recursionp {
    public static void Rec(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        Rec(n-1);
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();
        Rec(num);
    }

    
}
