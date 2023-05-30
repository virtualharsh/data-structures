// 21. check integer palindrome

class CheckPalindrome {
    public static int findReverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    public static boolean check(int n){
        if(findReverse(n)==n){
            return true;
        }else{
            return false;
        }
    }
}

public class DriverU {
    public static void main(String[] args) {
        System.out.println(CheckPalindrome.check(1551));
    }
}
