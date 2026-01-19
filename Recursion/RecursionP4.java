import java.util.Scanner;
public class RecursionP4 {
    public static void Backtrack(int i, int n){
        if (i<n){
            return;
        }
        Backtrack(i-1,n);
        System.out.println(i);
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Backtrack(5,num);

        
    }
    
}
