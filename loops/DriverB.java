// 2. Find whether the number Is prime or not.

class Prime{
    public static boolean isPrime(int n){
        if(n==1 || n==0){
            return false;
        }
        int l = (int) java.lang.Math.ceil(java.lang.Math.sqrt(n));
        for(int i=2 ; i<l ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

public class DriverB {
    public static void main(String[] args) {
        System.out.println(Prime.isPrime(3));
        System.out.println(Prime.isPrime(1));
    }
}
