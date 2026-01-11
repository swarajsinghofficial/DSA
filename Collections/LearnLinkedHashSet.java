import java.util.LinkedHashSet;
import java.util.Set;
public class LearnLinkedHashSet {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet<>();
        set.add(25);
        set.add(65);
        set.add(24);
        set.add(74);
        set.add(23);

        System.out.println(set);

        set.remove(65);
        System.out.println(set);

        System.out.println(set.contains(23));

        System.out.println();

        System.out.println(set.isEmpty());

        set.clear();
        System.out.println(set);
    }
    
}
