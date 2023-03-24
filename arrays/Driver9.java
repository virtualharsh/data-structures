// Find triplet of indexes that gives sum equals to target

import java.util.ArrayList;
import java.util.HashMap;

class ArrayPairSum {
    public static Integer[][] findPairSum(Integer a[],Integer start, Integer target) {
        ArrayList<Integer[]> ans = new ArrayList<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = start; i < a.length; i++) {
            if (hm.containsKey(target - a[i])) {
                Integer temp[] = { hm.get(target - a[i]), i };
                ans.add(temp);
            }
            hm.put(a[i], i);
        }
        Integer temp[][] = new Integer[ans.size()][2];
        ans.toArray(temp);
        return temp;
    }

    public static ArrayList<Integer[]> findTriplet(Integer a[],Integer target){
        ArrayList<Integer[]> ans = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            Integer[][] pairSumAns = findPairSum(a,i+1,target-a[i]);
            if(pairSumAns.length!=0){
                for (Integer[] j : pairSumAns) {
                    Integer toAdd[] = {i,j[0], j[1]};
                    ans.add(toAdd);
                }
            }
        }
        return ans;
    } // o(n*n)

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
        Integer a[] = { 80,10,20,30,40,50,70,60};
        int target = 110;
        ArrayList<Integer[]> ans = ArrayPairSum.findTriplet(a, target);
        ArrayPairSum.displayAnswer(ans);
    }
}
