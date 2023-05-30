import java.util.Arrays;

class Array{
    public static int findKthLargest(Integer a[],int k){
        if(k>a.length || k<0)
            return -1;
        Arrays.sort(a);
        return a[a.length - k];
    }   
}   

public class DriverO {
    public static void main(String[] args) {
        Integer a[] = { 10,20,30,40,50 };
        System.out.println(Array.findKthLargest(a, 2));
    }
}
