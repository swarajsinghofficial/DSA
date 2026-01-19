import java.util.*;
public class RecursionSum { 
    public static void Sum(int i, int Sum){          // Parameterised Recursion
        if (i<1){
            System.out.println(Sum);
            return;
        }
        Sum(i-1,Sum +i); 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number upto which you want to add");
        int num = sc.nextInt();
        Sum(num, 0);
        
    }
}
