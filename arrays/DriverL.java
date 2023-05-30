class LastOccurrence {

    public static int getLastOccurance(Integer[] a,int n) {
        int ans=-1;
        for(int i=a.length-1; i>=0 ; i--){
            if(a[i]==n){
                return i;
            }
        }
        return ans;
    }

}
public class DriverL {
    public static void main(String[] args) {
        Integer a[] = { 0, 2, 1, 2, 4, 2, 5 };
        int ans = LastOccurrence.getLastOccurance(a,2);
        System.out.println(ans);
    }
}
