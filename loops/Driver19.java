// 19. Check if given number is in power of 2 or not.
// optimal logic is to find hamming weight of n and if it's 1 return true

class Number{
    public static int powerOf2(int n) {
        int ans = 1;

        for(int i=1 ; i<=n ; i++){
            ans = ans * 2;
        }
        return ans;
    }

    public static boolean isInPowerOf2(int n) {
        int ans= 1;
        for(int i=1 ; ans<=n ; i++){
            ans = powerOf2(i);
            if(ans==n){
                return true;
            }
        }
        return false;
    }

    public static int findHamming(int n) {
        int count = 0;

        while (n != 0) {
            if (n % 2 == 1) {
                count++;
            }
            n /= 2;
        }
        return count;
    }

    public static boolean optimalPowerOf2(int n){
        int hamming = findHamming(n);
        if(hamming==1){
            return true;
        }
        return false;
    }
}

public class Driver19 {
    public static void main(String[] args) {
        System.out.println(Number.isInPowerOf2(6));
    }
}
