// 12. Find how many times 79 number repeats in an integer

class Number {
    public static int count79(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 100 == 79) {
                counter++;
            }
            n /= 10;
        }
        return counter;
    }
}

public class Driver13 {
    public static void main(String[] args) {
        System.out.println(Number.count79(1771079));
    }
}
