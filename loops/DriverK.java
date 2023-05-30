// 11. Find the n to the power m value. 

class Raisebym{
    public static int power(int n,int m){
        if(m==0){
            return 1;
        }
        int ans = 1;
        for(int i=0 ; i<m ; i++){
            ans = ans * n;
        }
        
        return ans;
    }
}

public class DriverK {
    public static void main(String[] args) {
        System.out.println(Raisebym.power(2, 4));
    }
}
