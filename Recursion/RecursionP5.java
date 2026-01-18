import java.util.Scanner;
public class RecursionP5 {
    public static void BackTrack(int i, int n){
        if(i>n){
            return;
        }
        BackTrack(i+1,n);
        System.out.println(i);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        RecursionP5.BackTrack(1,num);
        
    }
    
}
