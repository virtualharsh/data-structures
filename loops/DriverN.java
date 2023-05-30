// 14 find factorial 

public class DriverN{
    public static int fact(int n){
        int fact=1;
        for(int i=n ; i>=2 ; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(DriverN.fact(5));
    }
}