// 9. Find number factors of a number.

class Numbers{
    public static int findNumberOfFactors(int n) {
        if(n==0 || n==1){
            return n;
        }
        int counter=2;
        int limit = (int)java.lang.Math.sqrt(n);
        for(int i=2 ; i<=limit ; i++){
            if(n%i==0){
                if(n/i==i){
                    counter++;
                    continue;
                }
                counter+=2;
            }
        }
        return counter;
    }
}


public class DriverI {
    public static void main(String[] args) {
        System.out.println(Numbers.findNumberOfFactors(16));
    }
}
