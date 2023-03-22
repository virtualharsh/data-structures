// Find duplicate value in array which contains 1 to n-1 values. You can also consider the same problem which doesn't contain 1 to n-1 values.

import java.util.HashSet;

class ArrayDuplicate{

    public static int getDuplicate(Integer a[]) {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if(hs.contains(a[i])){
                return a[i];
            }else{
                hs.add(a[i]);
            }
        }
        return -1;
    }
}

public class Driver5 {
    public static void main(String[] args) {
        Integer a[] = {1,3,2,4,3};
        System.out.print(ArrayDuplicate.getDuplicate(a));
    }
}
