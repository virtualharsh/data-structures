// 12. Find how many times 7 number repeats in an integer

class Number{
    public static int count7(int n){
        int counter =0;
        while(n!=0){
            if(n%10==7){
                counter++;
            }
            n/=10;
        }
        return counter;
    }
}

public class DriverL {
    public static void main(String[] args) {
        System.out.println(Number.count7(1771));
    }
}
