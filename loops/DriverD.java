// 4. find GCD of 2 numbers

class GCD {
    public static int getGCD(int a,int b) {
        int min = (a>b)?a:b;
        int gcd = 1;
        for(int i=2 ; i<=min ; i++){
            if(a%i==0 && b%i==0)
                gcd = i;
        }
        return gcd;
    }
}

public class DriverD {
    public static void main(String[] args) {
        System.out.println(GCD.getGCD(20,100));
    }
}
