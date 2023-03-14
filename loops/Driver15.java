// 15. Find the number of digits an integer has.

class Number{
    public static int findLenOfInt(int n){
        int count=0;
        while(n!=0){
            count++;
            n/=10;
        }
        return count;
    }
}

public class Driver15 {
    public static void main(String[] args) {
        System.out.println(Number.findLenOfInt(143));
    }
}
