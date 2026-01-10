import java.util.PriorityQueue;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(12);
        pq.offer(15);
        pq.offer(20);
        pq.offer(35);
        System.out.println(pq);
        

        pq.poll();
        System.out.println(pq);

        System.out.println(pq.peek());


        pq.poll();
        System.out.println(pq);
    }
    
}
