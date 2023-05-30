// 18. Find hamming weights of an integer

class Number{
    public static int findHamming(int n) {
        int count=0;

        while(n!=0){
            if(n%2==1){
                count++;
            }
            n/=2;
        }
        return count;
    }
}

public class DriverR {
    public static void main(String[] args) {
        System.out.println(Number.findHamming(10));
    }
}
