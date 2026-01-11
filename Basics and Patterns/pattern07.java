public class pattern07 {
    public static void pattern(int n){
        for(int i=n;i<=1;i--){
            for (int j=n;j<=i;j--){
                System.out.print("*");
            }
        }System.out.println();
    }
    public static void main(String[] args) {
       
        pattern(5);
        
    }
}
