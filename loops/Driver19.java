// 19. Check if given number is in power of 2 or not.

class Number{
    public static int  powerOf2(int n) {
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
}

public class Driver19 {
    public static void main(String[] args) {
        System.out.println(Number.isInPowerOf2(6));
    }
}
