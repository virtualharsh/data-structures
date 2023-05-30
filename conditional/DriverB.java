// problem defination : to find whether the year is leap or not
// logic : the year is multiple of 400 , the year is multiple of 4 and not of 100

class leap{
    public static boolean isLeap(int n){
        if(n%400==0){
            return true;
        }else{
            if(n%4==0){
                if(n%100==0){
                    return false;
                }else{
                    return true;
                }
            }
        }
        return false;
    }
}

public class DriverB {
    public static void main(String[] args) {
        System.out.println(leap.isLeap(400));
    }
}
