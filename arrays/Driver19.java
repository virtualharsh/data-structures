class Array{
    public static Integer[] rotateArray(Integer a[],int k){
        Integer ans[] = new Integer[a.length];
        k = ( k % a.length )- 1;
        int i=k,j=0;

        while(i<a.length){
            ans[j++] = a[i++];
        }
        i=0;
        while(i<k){
            ans[j++] = a[i++];
        }
        return ans;
    } // one loop for 1-k at last of array and one for all elements from k to a.length,space O(n)

    private static void revArray(Integer a[],int start,int end){
        while(start<end){
            int temp = a[start];
            a[start++]= a[end];
            a[end--]= temp;
            
        }
    }
    public static Integer[] rotateArrayOptimal(Integer a[], int k) {
        k = (k % a.length) - 1 ;
        revArray(a,0,a.length-1);
        revArray(a,0,k);
        revArray(a,k+1,a.length-1);
        return a;
    }
}

public class Driver19{
    public static void main(String[] args) {
        Integer a[] = {1,2,3,4,5};
        int k=3;
        Integer ans[] =  Array.rotateArrayOptimal(a, k);
        for (Integer i : ans) {
            System.out.print(i + " ");
        }
    }
}