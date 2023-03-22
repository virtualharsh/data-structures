// Find unique value in odd size array. Every other element is present twice in array only a single value there with 1 occurrence. Return that value.

import java.util.HashMap;
import java.util.HashSet;

class ArrayUniqueOccurances{

    public static boolean isUniqueInOccurance(Integer a[]){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<a.length ; i++){
            if(hm.containsKey(a[i])){
                hm.replace(a[i], hm.get(a[i])+1);
            }else{
                hm.put(a[i],1);
            }
        }
        HashSet<Integer> hs = new HashSet<>();
        for(Integer i : hm.values()){
            if(hs.contains(i)){
                return false;
            }
            hs.add(i);
        }
        return true;
    } 
}
public class Driver4 {
    public static void main(String[] args) {
        Integer a[] = { 10,10, 20, 25, 20 , 10 , 20 };
        System.out.print(ArrayUniqueOccurances.isUniqueInOccurance(a));
    }
}
