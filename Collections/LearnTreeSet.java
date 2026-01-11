import java.util.Set;
import java.util.TreeSet;
public class LearnTreeSet {
    public static void main (String [] args){
        Set<Integer> set = new TreeSet<>();

        set.add(150);
        set.add(152);
        set.add(110);
        set.add(100);
        set.add(125);

        System.out.println(set);   //Time complexity: O(log n)


    }
    
}
