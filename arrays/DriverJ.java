// 10. sort an array with values 0,1

class Array01Sort{
    public static void swap(Integer a,Integer b){
        int temp = a;
        a = b;
        b = temp;
    }

    public static void sort(Integer a[]){
        int start=0,end=a.length-1;
        while (start<end) {
            while(a[start]==0){
                start++;
            }
            while(a[end]==1){
                end--;
            }
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }
    public static void display(Integer a[]){
        for (Integer integer : a) {
            System.out.println(integer + " ");
        }
    }
}

public class DriverJ {
    public static void main(String[] args) {
        Integer a[] = {0,1,0,1,0,0,1};
        Array01Sort.sort(a);
        Array01Sort.display(a);
    }
}
