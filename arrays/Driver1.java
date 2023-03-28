// 1.	Implement all common array operations that includes traversal like finding maximum, minimum, sum, product, linear search, reverse array, insert/delete at last, insert/delete at specific location.(do all this solution in single class and try to reuse the loop for function).

class ArrayOperation{
    public Integer a[];
    private int max , min ,sum = 0, startPointer,endPointer, product = 1;

    ArrayOperation(int size){
        a = new Integer[size];
        startPointer = -1;
        endPointer= -1;
    }
    
    private void changeProperties(){
        if(endPointer==-1){
            return ;
        }
        max = a[0];
        min = a[0];
        sum = 0;
        product =1;
        for(int i=startPointer ; i<endPointer ; i++){
            if(a[i]>max){
                max = a[i];
            }
            if(a[i]<min){
                min = a[i];
            }
            sum += a[i];
            product *= a[i];
        }
    }

    private void resetProperties(){
        max = 0;
        min =0;
        product=1;
        sum=0;
    }

    public void display(){
        System.out.println( "max:" + max  + " min:" + min + " sum:" + sum + " product:" + product);
        int i = startPointer;
        while(i<endPointer){
            System.out.print(a[i] + " ");
            i++;
        }
        System.out.println();
    }

    public int getMax(){
        return max;
    }

    public int getMin(){
        return min;
    }

    public int getSum(){
        return sum;
    }

    public int getProduct(){
        if(startPointer==-1){
            return 0;
        }
        return product;
    }
}

class Driver1{
    public static void main(String[] args) {
        ArrayOperation ob = new ArrayOperation(7);
        
    }
}