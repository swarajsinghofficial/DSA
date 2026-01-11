import java.util.*;
public class Factorial {
	public static void fact(int num){
        int fact =1;
        for(int i=num; i>=1;i--){
            fact=fact*i;

        }
        System.out.println(fact);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Factorial.fact(num);

    }
}
