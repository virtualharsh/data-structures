// 10. Print the number of common factors, 2 integer number shares.

class Numbers{
    public static int findNumberOfFactors(int a,int b) {
        int counter = 1;
        int min = (a>b)?a:b;
        if(a==0 || b==0)
            return 0;

        for(int i=2 ; i<=min ; i++){
            if(a%i==0 && b%i==0){
                counter++;
            }
        }
        return counter;
    }
}

public class Driver10 {
    public static void main(String[] args) {
        System.out.println(Numbers.findNumberOfFactors(25, 50));
    }
}