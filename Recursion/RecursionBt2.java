import java.util.Scanner;
public class RecursionBt2 {
    public static void RBt2(int i, int n){
        if (i<1){
            return;
        }
        RBt2(i-1,n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number upto which you want to print:");
        int n = sc.nextInt();
        RBt2(n,n);
    }
}
