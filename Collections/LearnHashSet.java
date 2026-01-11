import java.util.HashSet;
import java.util.Set;
public class LearnHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        
        set.add(5);
        set.add(32);
        set.add(40);
        set.add(2);
        
        System.out.println(set);
        
        set.remove(2);
        System.out.println(set);


        System.out.println(  set.contains(32));
        System.out.println(set.isEmpty());
        set.clear();
        System.out.println(set);
    }   
    
}
