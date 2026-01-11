import java.util.ArrayDeque;
public class ArrDeque {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(12);     //Adds element to the front of the queue (Front or Head)
        adq.offerLast(45);      // Adds element to the end of the queue (Tail or end)
        adq.offer(26);

        System.out.println(adq);

        System.out.println(adq.peek());   //Returns the front (head) of the queue
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast()); // Last element of the queue


        System.out.println(adq.poll());  //Removes the head of the queue
        System.out.println(adq);
        System.out.println(adq.pollFirst());
        System.out.println(adq);
        System.out.println(adq.pollLast());
        System.out.println(adq);

        
    }
    
    
}
