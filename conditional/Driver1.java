// Problem Defination : Find whether the number is odd or even

class PositiveNegative {
    public static boolean isPositive(int n){
        if(0<n){
            return true;
        }else{
            return false;
        }
    }
}

public class Driver1 {
    public static void main(String[] args) {
        System.out.println(PositiveNegative.isPositive(5));
        System.out.println(PositiveNegative.isPositive(-5));
    }
}
