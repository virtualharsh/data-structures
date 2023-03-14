import java.util.HashSet;

public class HashsetDemo {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(10);
        hs.add(30);
        hs.add(40);
        hs.add(20);
        // will not add 30 coz it contains only unique values
        hs.add(30);

        // printing the elements but its in unordered
        System.out.println(hs);
        System.out.println(hs.contains(20));

    }
}
