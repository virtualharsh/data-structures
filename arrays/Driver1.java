// 1.	implement all common array operations that includes traversal like finding maximum,minimum, sum , product ,linear search , reverse array.

class ArrayOperation{
    private int max , min,sum;

    public void display(int a[]){
        for(int i=0 ; i<a.length ; i++){
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
    public int getMax(int a[]) {
        max = a[0];
        min = a[0];
        sum = 0;

        for(int i=1 ; i<a.length ; i++){
            sum+=a[i];
            if(a[i]>max)
                max = a[i];
            if(a[i]<min)
                min = a[i];
        }
        return max;
    }
    
    public int getMin(int a[]) {
        this.getMax(a);
        return min;
    }

    public int sum(int[] a){
        this.getMax(a);
        return sum;
    }

    public boolean isAvaliable(int a[],int target) {
        for(int i=0;i<a.length ; i++){
            if(a[i]==target){
                return true;
            }
        }
        return false;
    }
    public void reverse(int a[]){
        for(int i=a.length-1 ; i>=0 ; i--)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}

class Driver1{
    public static void main(String[] args) {
        int a[] = {10,20,15};
        ArrayOperation ob = new ArrayOperation();
        ob.display(a);
        ob.display(a);
        System.out.println("Minimum is " + ob.getMin(a) + "\nMaximum is " + ob.getMax(a));
        System.out.println("sum is " + ob.sum(a));
        System.out.println("Is 20 present " + ob.isAvaliable(a, 20));
        ob.reverse(a);
    }
}