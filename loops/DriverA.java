// 1. print Fibonacci series up to n numbers.

class Feb{
    public static void printFeb(int n){
        int a=0,b=1,c=0;
        for(int i=0 ; i<n ; i++){
            System.out.print(c + " ");
            c = a + b;
            a = b;
            b = c;
        }
    }
}

public class DriverA{
    public static void main(String[] args) {
        Feb.printFeb(7);
    }
}