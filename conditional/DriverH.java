// find whether given dimensions (in angle) is triangle or not

class Triangle{
    public static boolean isTriangle(int x,int y,int z) {
        if((x+y+z)==180){
            return true;
        }
        return false;
    }
}

public class DriverH {
    public static void main(String[] args) {
        System.out.println(Triangle.isTriangle(20, 50, 100));
    }
}
