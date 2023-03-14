import java.util.Deque;
import java.util.ArrayDeque;

public class DoubleEndedQueue {
    public static void main(String[] args) {
        Deque<Integer> dq = new ArrayDeque<>();

        // The double ended queue operates in both the end of queue

        dq.offerFirst(10);
        dq.offerLast(30);
        dq.offerLast(40);
        
        dq.offerFirst(15);

        System.out.println(dq); // 15,10,30,40

        System.out.println(dq.peekFirst()); // 15
        System.out.println(dq.peekLast()); // 40
         
        // we can poll at first and last similarly
    }
}
