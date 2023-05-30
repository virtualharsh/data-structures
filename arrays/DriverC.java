// 3.	Find unique value in odd size array. Every other element is present twice in array only a single value there with 1 occurrence. Return that value.
import java.util.HashSet;

class ArrayFindUnique {
    public static int findUnique(Integer[] a) {
        int unique=0;
        for(int i=0 ; i<a.length ;i++){
            unique = unique ^ a[i];
        }
        return unique;
    }
    
    public static int findUniqueWithHashSet(Integer[] a) {
        HashSet<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < a.length; i++) {
            if(hs.contains(a[i])){
                hs.remove(a[i]);
            }else{
                hs.add(a[i]);
            }
        }
        Integer temp[] = new Integer[hs.size()];
        hs.toArray(temp);
        return temp[0];
    }
}

public class DriverC {
    public static void main(String[] args) {
        Integer a[] = {10,20,25,20,10};
        System.out.print(ArrayFindUnique.findUniqueWithHashSet(a));
    }
}
