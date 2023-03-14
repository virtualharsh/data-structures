import java.util.LinkedList;
import java.util.Queue;

// offer and poll doesn't throw exception where add and remove throws exceptions
// also the add method doesn't return any value where offer method returns boolean value

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<Integer>();

        // offer method is to enqueue
        q.offer(10);
        q.offer(30);
        // add method also enqueue at last
        q.add(40);
        q.offer(30);
        
        System.out.println(q);
        // peek element gives first element / front which is to be deleted
        System.out.println(q.peek());

        // remove and poll both dequeue the elements
        System.out.println(q.remove());
        System.out.println(q.poll());
        System.out.println(q.remove());
    }
}
