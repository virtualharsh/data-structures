// find max of 4 numbers

class findMax {
    public static int findMaxOfFour(int a, int b, int c,int d) {
        if(a>b){
            if(a>c){
                if(a>d){
                    return a;
                }else{
                    return d;
                }
            }else{
                if(c>d){
                    return c;
                }else{
                    return d;
                }
            }
        }else if(b > c){
            if(b>d){
                return b;
            }else{
                return d;
            }
        }else if(c>d){
            return c;
        }
        return d;
    }
}


public class DriverF {
    public static void main(String[] args) {
        System.out.println(findMax.findMaxOfFour(50,600,700,40));
    }
}
