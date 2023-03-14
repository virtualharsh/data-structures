// 3. Find sum of 1-n.

class Sum {
    public static int getSum(int n) {
        int sum = 0;
        for(int i=1 ; i<=n ; i++){
            sum += i ;
        }
        return sum;
    }
}

public class Driver3 {
    public static void main(String[] args) {
        System.out.println(Sum.getSum(5));
    }
}
