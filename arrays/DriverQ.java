import java.util.HashSet;

class Array{
    public static int findNumberOfPairsToTarget(Integer a[],int target){
        int count=0;
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<a.length;i++){
            if(hs.contains(target - a[i])){
                count++;
            }
            hs.add(a[i]);
        }
        return count;
    }
}

public class DriverQ {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        int target = 6;
        System.out.println(Array.findNumberOfPairsToTarget(a, target));
    }
}
