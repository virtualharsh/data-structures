// find max of 3 numbers

class findMax{
    public static int findMaxOfThree(int a,int b,int c) {
        if(a > b){
            if( a > c){
                return a;
            }else{
                return c;
            }
        }else if( b > c){
            return b;
        }
        return c;
    }
}

public class Driver5 {
    public static void main(String[] args) {
        System.out.println(findMax.findMaxOfThree(105,1000,150));
    }
}
