// 6. sum and product of digit

class OperateDigits {
    
    public static int findSum(int n) {
        int sum = 0;

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }

    public static int findProduct(int n) {
        int product = 1;

        while (n != 0) {
            product *= (n % 10);
            n /= 10;
        }
        return product;
    }
}

public class Driver6 {
    public static void main(String[] args) {
        System.out.println(OperateDigits.findSum(154));
        System.out.println(OperateDigits.findProduct(154));
    }
}
