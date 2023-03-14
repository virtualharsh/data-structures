// 2. Find whether the number Is prime or not.


class Prime{
    public static boolean isPrime(int n){
        int l = (int) java.lang.Math.ceil(java.lang.Math.sqrt(n));
        for(int i=2 ; i<l ; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}

public class Driver2 {
    public static void main(String[] args) {
        System.out.println(Prime.isPrime(20));
    }
}
