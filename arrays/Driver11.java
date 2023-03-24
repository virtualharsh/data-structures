// 11. sort an array with values 0,1,2

class Array012Sort{
    public static void sort(Integer[] a) {
        int start = 0 , end = a.length-1 , pivot =0;

        while(pivot<end){
            if(a[pivot]==0){
                int temp = a[start];
                a[start] = a[pivot];
                a[pivot] = temp;
                start++;
            }
            if(a[pivot]==2){
                int temp = a[end];
                a[end] = a[pivot];
                a[pivot] = temp;
                end--;
            }
            if(a[pivot]==1){
                pivot++;
            }
        }
    }
    public static void display(Integer a[]){
        for (Integer integer : a) {
            System.out.println(integer + " ");
        }
    }
}

public class Driver11 {
    public static void main(String[] args) {
        Integer a[] = {2,1,2,1,0,1,2};
        Array012Sort.sort(a);
        Array012Sort.display(a);
    }
}
