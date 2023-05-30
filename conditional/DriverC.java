// Find the number is odd or even

class OddEven{
    public static boolean isOdd(int n){
        if(n%2==0){
            return false;
        }
        return true;
    }
    
    public static boolean isEven(int n) {
        if((n&1)==1){
            return false;
        }
        return true;
    }
}

public class DriverC {
    public static void main(String[] args) {
        System.out.println(OddEven.isOdd(5));
        System.out.println(OddEven.isEven(5));
    }
}
