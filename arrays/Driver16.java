import java.util.Arrays;

class Array {
    public static int findKthSmallest(Integer a[], int k) {
        if (k > a.length || k < 0)
            return -1;
        Arrays.sort(a);
        return a[k-1];
    }
}

public class Driver16 {
    public static void main(String[] args) {
        Integer a[] = { 10, 20, 30, 40, 50 };
        System.out.println(Array.findKthSmallest(a, 2));
    }
}
