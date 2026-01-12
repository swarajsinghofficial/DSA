
public class Recursion01 {
    public static void f(){
        System.out.println("1");
        f();   // When a function calls itself -Recursion
        
    }
    public static void main(String[] args) {
        f();
    }
    
}
