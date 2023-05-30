class Array {
    public static boolean isSortedDec(Integer a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class DriverN {
    public static void main(String[] args) {
        Integer a[] = { 5,4,3,2,1,5 };
        System.out.println(Array.isSortedDec(a));
    }
}
