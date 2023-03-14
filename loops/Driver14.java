// 14 find factorial 

public class Driver14{
    public static int fact(int n){
        int fact=1;
        for(int i=n ; i>=2 ; i--){
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(Driver14.fact(5));
    }
}