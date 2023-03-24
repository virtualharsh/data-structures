// Find pairs of indexes that gives sum equals to target.
// 	Index should be returned in sorted order
// 	Example:- array => [1,2,3,4,5] and target => 6
// 	Then answer => [ [ 0,4 ] , [ 1,3 ] ]

import java.util.ArrayList;
import java.util.HashMap;


class ArrayPairSum{
    public static ArrayList<Integer[]> findPairSum(Integer a[],Integer target){
        ArrayList<Integer[]> ans = new ArrayList<>();
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int i = 0; i < a.length; i++) {
            if(hm.containsKey(target - a[i])){
                Integer temp[] = {hm.get(target - a[i]),i};
                ans.add(temp);
            }
            hm.put(a[i],i);
        }
        return ans;
    }

    public static void displayAnswer(ArrayList<Integer[]> ans) {
        System.out.print("[");
        for (Integer[] i : ans) {
            System.out.print("[" + i[0] + "," + i[1] + "]");
        }
        System.out.print("]");
    }
}

public class Driver8 {
    public static void main(String[] args) {
        Integer a[] = {10,20,30,40,50};
        int target = 90;
        ArrayList<Integer[]> ans = ArrayPairSum.findPairSum(a, target);
        ArrayPairSum.displayAnswer(ans);
    }
}
