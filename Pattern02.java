public class Pattern02 {
    public static void Pattern(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int n =7;
        Pattern(n);
    }
    
}
