// 7. Find binary of a decimal integer.

class Binary{
    public static String findBinary(int n){
        StringBuffer binary = new StringBuffer();

        while(n!=0){
            binary.append(String.valueOf(n%2));
            System.out.println(n);
            n/=2;
        }
        binary.reverse();
        return binary.toString();
    }
    public static int findReverse(int n) {
        int rev = 0;

        while (n != 0) {
            rev = rev * 10 + (n % 10);
            n /= 10;
        }
        return rev;
    }
    // public static int findBinary(int n) {
    //     int binary=0;

    //     while (n != 0) {
            
    //         binary = (binary*10) + n%2;
    //         n /= 2;
    //     }
        
    //     return findReverse(binary);
    // }
}

public class Driver7 {
    public static void main(String[] args) {
        System.out.println(Binary.findBinary(8));
    }
}
