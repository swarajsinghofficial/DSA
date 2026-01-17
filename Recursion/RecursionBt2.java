public class RecursionBt2 {
    public static void RBt2(int n){
        if (n<1){
            return;
        }
        System.out.println(n);
        RBt2(n-1);
    }
    public static void main(String[] args) {
        RBt2(5);
    }
}
