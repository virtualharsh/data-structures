import java.util.HashSet;

class Array {
    public static int findFirstRepeatingElement(Integer a[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (hs.contains(a[i])) {
                return a[i];
            }
            hs.add(a[i]);
        }
        return -1;
    }
}

public class DriverR {
    public static void main(String[] args) {
        Integer a[] = { 1, 2, 3, 4, 2 };
        System.out.println(Array.findFirstRepeatingElement(a));
    }
}
