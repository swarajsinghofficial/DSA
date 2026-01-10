import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(15);
        queue.offer(52);
        queue.offer(10);
        queue.offer(21);
        queue.offer(30);
        System.out.println(queue);

        System.out.println(queue.peek());

        queue.poll();
        System.out.println(queue);




        
    }
    
}
