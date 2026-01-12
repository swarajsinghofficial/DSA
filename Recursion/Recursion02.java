
public class Recursion02 {
    static int count =1;
    public static void rec(){
        
        if( count > 5){
            return;
        }
        System.out.println(count);
        count++;
        rec();
    }

    public static void main(String[] args) {
        rec();
    }
    
}
