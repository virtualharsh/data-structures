import java.util.LinkedHashSet;


// the hashset is implemented over linked list rather than hashing in array


public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();

        lhs.add(10);
        lhs.add(30);
        lhs.add(40);
        lhs.add(20);
        // will not add 30 coz it contains only unique values
        lhs.add(30);

        // printing the elements but its in unordered
        System.out.println(lhs);
        System.out.println(lhs.contains(20));

    }
}
