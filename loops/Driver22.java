// find 9's and 10's complement of given integer

class Complimentint{
    public static int find9sComplement(int n){
        String nines = "";
        int originalN = n;
        while(n!=0){
            nines+="9";
            n/=10;
        }
        int ans = Integer.valueOf(nines);
        return ans-originalN;
    }
    
    public static int find10sComplement(int n) {
        String nines = "";
        int originalN = n;
        while (n != 0) {
            nines += "9";
            n /= 10;
        }
        int ans = Integer.valueOf(nines);
        return (ans - originalN) + 1;
    }
}

public class Driver22 {
    public static void main(String[] args) {
        System.out.println("9's complement of 888 is " + Complimentint.find9sComplement(888));
        System.out.println("10's complement of 888 is " + Complimentint.find10sComplement(888));
    }
}
