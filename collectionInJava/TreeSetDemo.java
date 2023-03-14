import java.util.TreeSet;

// Implements set ( unique values ) in ordered format using BST

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(30);
        ts.add(20);
        // this won't be added
        ts.add(10);

        System.out.println(ts);
    }
}
