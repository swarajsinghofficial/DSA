public class pattern06 {
    public static void pattern(int num){
        for(int i = num;i>=1;i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");


            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern06.pattern(5);
    }
    
}
