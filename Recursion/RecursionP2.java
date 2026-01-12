import java.util.Scanner;
public class RecursionP2 {
    public static void Print(int i, int num){
        if(i>num){
            return;
        
        }
        System.out.println(i);
        Print(i+1,num);
    }
    public static void main(String[] args) {
        System.out.print("Enter any no:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Print(1,num);
    }
    
}
