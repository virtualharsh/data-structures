// 7. Find binary of a decimal integer.

class Binary {
    public static String findComplement(int n) {
        StringBuffer binary = new StringBuffer();

        while (n != 0) {
            binary.append(String.valueOf((n%2==0)?1:0));
            n /= 2;
        }
        binary.reverse();
        return binary.toString();
    }
}

public class Driver8 {
    public static void main(String[] args) {
        System.out.println(Binary.findComplement(10));
    }
}
