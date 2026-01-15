public class RecursionBacktracking {
    public static void RecBT(int i,int n){
        if (i<n){
            return;
        }
        RecBT(i-1,n);
        System.out.println(i);         //We have printed i after the function call. Its an ex of Recursion through backtracking
    }
    public static void main(String[] args) {
        RecBT(5,1);
    }
    
}
