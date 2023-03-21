// 2.	Write a code that swaps every alternate index element in an array.
//  	If array = [10,20,30,40,50] => output array => [20,10,40,30,50]
//  	If array = [10,20,30,40,50,60] => output array => [20,10,40,30,60,50]


class ArraySwapAlternate{
    public static void swapAlternate(Integer a[]){
        try{
            for(int i=0 ; i<a.length ; i+=2){
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }catch(ArrayIndexOutOfBoundsException e){}
    }
}

public class Driver2 {
    public static void main(String[] args) {
        Integer a[] = new Integer[6];
        // Integer a[] = new Integer[5];
        int c = 10;
        for (int i = 0; i < a.length; i++) {
            a[i] = c;
            c+=10;
        }
        ArraySwapAlternate.swapAlternate(a);
        Integer swapped[] = a.clone();
        for (Integer i : swapped) {
            System.out.print(i+" ");
        }
    }
}
