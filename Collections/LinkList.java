import java.util.LinkedList;
public class LinkList {
    public static void main(String[] args) {
          LinkedList<Integer> list= new LinkedList<>();
          list.add(45);
          list.add(18);
          list.add(74);
          list.add(32);
          System.out.println(list);
          list.offer(69);
          System.out.println(list);

          list.set(2,73);
          System.out.println(list);

          list.pollLast();
          System.out.println(list);
        
    }
  
    
   

}
