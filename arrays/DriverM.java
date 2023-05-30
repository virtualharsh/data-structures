class Array{
    public static boolean isSorted(Integer a[]){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;
    }
}
public class DriverM {
    public static void main(String[] args) {
        Integer a[] = { 0, 1, 2, 4, 5 , 3 };
        System.out.println(Array.isSorted(a));
    }
}
