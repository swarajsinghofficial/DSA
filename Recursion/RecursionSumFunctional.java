import java.util.Scanner;
public class RecursionSumFunctional {
    public static int FunctionalRecursion(int n){
        if(n ==0){
            return 0;                    
        }
        return n + FunctionalRecursion(n-1);    //This code implements Functional Recursion
                                                // FunctionalRecursion(0); return 0 then it backtracks to FunctionalRecursion(1); that returns n + 0 i.e 1
                                                //then F(2) - 1+2 : 3 then F(3): 3 + 3 - 6 which is the sum of n numbers from 1 to 3
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        System.out.println(FunctionalRecursion(n));

    }
    
}
