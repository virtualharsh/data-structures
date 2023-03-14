import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();

        s.push(10);
        s.push(20);
        s.push(30);

        // print the top we use peek property
        System.out.println(s.peek());

        System.out.println(s.pop());
        System.out.println(s.peek());
    }
}
