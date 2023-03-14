//  max of two numbers

class findMax {
    public static int findMaxOfTwo(int a, int b) {
        if(a>b){
            return a;
        }
        return b;
    }
}

public class Driver4 {
    public static void main(String[] args) {
        System.out.println(findMax.findMaxOfTwo(5, 10));
    }
}
