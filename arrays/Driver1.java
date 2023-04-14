// 1.	Implement all common array operations that includes traversal like finding maximum, minimum, sum, product, linear search, reverse array, insert/delete at last, insert/delete at specific location.(do all this solution in single class and try to reuse the loop for function).

import java.util.HashSet;

class ArrayOperation{
    public Integer a[];
    public static final int INT_MAX = 2147483647,INT_MIN= -2147483648;
    private int secondMax,secondMin;
    public int size,max,min,product,sum,length;
    private HashSet<Integer> searchSet;

    ArrayOperation(int len){
        // bind the array
        a = new Integer[len];
        // set initial values to array properties
        setInitialValues(len);
    }

    private void setInitialValues(int len){
        // initail values to properties
        this.size = 0;
        this.length = len;
        this.max = INT_MIN;
        this.secondMax = INT_MAX + 1;
        this.min = INT_MAX - 1;
        this.secondMin = INT_MAX;
        this.sum = 0;
        this.product = 1;
        
        // create instance of hashset for O(1) search operations
        searchSet = new HashSet<Integer>();
    }

    public boolean insertLast(Integer element){
        if(size==length){
            return false;
        }

        // check if element to be added is max
        if(element>max){
            secondMax = max ;
            max = element;
        }else if(element > secondMax){
            secondMax = element;
        }

        // check if element to be added is max
        if(element < min){
            secondMin = min;
            min = element;
        }else if(element < secondMin){
            secondMin = element;
        }
        sum += element;
        product *= element;
        a[size++] = element;
        this.searchSet.add(element);
        return true;
    }

    public int deleteLast(){
        if(size==-1){
            return -1;
        }
        size = size - 1;
        int elementToDelete = a[size];
        searchSet.remove(elementToDelete);
        
        // check if element to be deleted is max of array
        if(elementToDelete==max || elementToDelete == secondMax){
            resetMinMax();
        }
        // check if element to be deleted is min of array
        if(elementToDelete==min || elementToDelete==secondMin){
            resetMinMax();
        }

        sum -= elementToDelete;
        product/= elementToDelete;
        
        return a[size];
    }

    private void resetMinMax(){
        this.max = INT_MIN;
        this.secondMax = INT_MAX + 1;
        this.min = INT_MAX - 1;
        this.secondMin = INT_MAX;
        for (int i = 0; i < size; i++) {
            if(a[i] > max ){
                secondMax = max;
                max = a[i];
            }else if(secondMax > a[i]){
                secondMax = a[i];
            }

            if (a[i] < min) {
                secondMin = min;
                min = a[i];
            } else if (secondMin < a[i]) {
                secondMin = a[i];
            }
        }
    }

    public boolean insertAtPosition(Integer element,Integer position){
        if(position > length || position < 0){
            return false;
        }else if(size==length){
            return false;
        }else if(position>size){
            return false;
        }

        for(int i=size-1;i >= position ; i--){
            a[i+1] = a[i];
        }
        a[position] = element;

        // check if element to be added is max
        if (element > max) {
            secondMax = max;
            max = element;
        } else if (element > secondMax) {
            secondMax = element;
        }

        // check if element to be added is max
        if (element < min) {
            secondMin = min;
            min = element;
        } else if (element < secondMin) {
            secondMin = element;
        }
        sum += element;
        product *= element;
        this.searchSet.add(element);

        size++;
        return true;
    }

    public boolean deleteAtPosition(int position){
        if(position>size || position>length || position<0){
            return false;
        }

        int elementToDelete = a[position];
        System.out.println(" element getting deleted is " + elementToDelete);
        searchSet.remove(elementToDelete);
        // check if element to be deleted is max of array
        if (elementToDelete == max || elementToDelete == secondMax) {
            resetMinMax();
        }
        // check if element to be deleted is min of array
        if (elementToDelete == min || elementToDelete == secondMin) {
            resetMinMax();
        }

        sum -= elementToDelete;
        product /= elementToDelete;

        for(int i=position+1 ; i<size ; i++){
            a[i-1] = a[i];
        }
        size--;
        
        return true;
    }

    public void reverse(){
        int start=0,end=size-1;
        while(start<end){
            int temp = a[start];
            a[start++] = a[end];
            a[end--] = temp;
        }
    }

    public int getMax(){
        return max;
    }
    
    public int getMin() {
        return min;
    }
    
    public int getSum() {
        return sum;
    }
    
    public int getProduct() {
        if(product==1){
            return 0;
        }
        return product;
    }

    public int getCapacity(){
        return length;
    }

    public int getSize(){
        return size;
    }

    public boolean containElement(int searchElement){
        if(searchSet.contains(searchElement))
            return true;
        else
            return false;
    }

    public void displayArray(){
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }
}

class Driver1{
    public static void main(String[] args) {
        ArrayOperation ob = new ArrayOperation(7);
        
        System.out.println("max:" + ob.getMax());
        System.out.println("min:" +ob.getMin());
        System.out.println("sum:" +ob.getSum());
        System.out.println("product:" +ob.getProduct());
        ob.insertAtPosition(5,1);
        ob.displayArray();

        ob.deleteAtPosition(1);
        ob.displayArray();
        System.out.println("max:" + ob.getMax());
        System.out.println("min:" + ob.getMin());
        System.out.println("sum:" + ob.getSum());
        System.out.println("product:" + ob.getProduct());

    }
}