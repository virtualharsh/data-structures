import java.util.ArrayList;
import java.util.HashSet;

class ArrayIntersection {
    
    private static boolean seqSearch(Integer a[], int target) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static ArrayList<Integer> bruteForce(Integer a[], Integer b[]) {
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (seqSearch(b, a[i])) {
                ans.add(a[i]);
            }
        }
        return ans;
    }

    private static boolean binarySearch(Integer arr[], int key) {
        int first = 0;
        int last = arr.length;
        int mid = (first + last) / 2;
        while (first <= last) {
            if (arr[mid] < key) {
                first = mid + 1;
            } else if (arr[mid] == key) {
                return true;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        return false;
    }

    public static ArrayList<Integer> findIntersection(Integer a1[],Integer a2[]){
        ArrayList<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<a1.length ; i++){
            if(binarySearch(a2, a1[i])){
                ans.add(a1[i]);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> getIntersectHashing(Integer a[],Integer b[]){
        HashSet<Integer> hs = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();
        for(Integer i:a){   
            hs.add(i);
        }
        for(Integer i:b){
            if(hs.contains(i)){
                ans.add(i);
            }
        }
        return ans;
    }

    public static ArrayList<Integer> getIntersectTwoPointers(Integer a[],Integer b[]){
        ArrayList<Integer> ans = new ArrayList<>();

        int i=0,j=0;
        while(i<a.length && j<b.length){
            if(a[i]==b[j]){
                ans.add(a[i]);
                i++;
                j++;
            }else if(a[i]<b[j]){
                i++;
            }else{
                j++;
            }
        }
        return ans;
    }
}

public class Driver6 {
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5,7};
        Integer b[] = {5,6,7};
        ArrayList<Integer> ans = ArrayIntersection.getIntersectTwoPointers(a, b);
        for (Integer i : ans) {
            System.out.print( i + " ");
        }
    }
}
