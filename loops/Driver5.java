// 5. reverse the digits

class RevDig{
    public static int findReverse(int n){
        int rev=0;

        while(n!=0){
            rev = rev * 10 + (n%10);
            n/=10;
        }
        return rev;
    }
}

public class Driver5 {
    public static void main(String[] args) {
        System.out.println(RevDig.findReverse(154));
    }
}
