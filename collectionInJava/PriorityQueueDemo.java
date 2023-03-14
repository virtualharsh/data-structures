import java.util.Comparator;
import java.util.PriorityQueue;

// it maintains a heap that works as a queue with minimum value at top


public class PriorityQueueDemo {
    public static void main(String[] args) {
        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder()); // for maintaining maximum number at top

        pq.offer(10);
        pq.offer(2);
        pq.offer(5);
        pq.offer(15);
        pq.offer(1);

        System.out.println(pq.peek());

        // find k-th largest element (2-nd largest element) 
        
        for(int i=0 ; i< 2 ; i++){
            pq.poll();
        }
        System.out.println(pq.peek());

        // 2nd smallest element
        pq = new PriorityQueue<>();
        pq.offer(10);
        pq.offer(2);
        pq.offer(5);
        pq.offer(15);
        pq.offer(1);
        for (int i = 0; i < 1; i++) {
            pq.poll();
        }
        System.out.println(pq.peek());

    }
}
