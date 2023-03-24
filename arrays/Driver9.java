// Find triplet of indexes that gives sum equals to target

import java.util.ArrayList;
import java.util.HashMap;

class ArrayPairSum {

    public static void displayAnswer(ArrayList<Integer[]> ans) {
        System.out.print("[");
        for (Integer[] i : ans) {
            System.out.print("[" + i[0] + "," + i[1] +  "," + i[2] + "]");
        }
        System.out.print("]");
    }

}

public class Driver9 {
    public static void main(String[] args) {
        Integer a[] = { 10, 20, 30, 40, 50, 60 , 70 , 80};
        int target = 110;
    }
}
