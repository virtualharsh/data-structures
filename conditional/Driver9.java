// find whether given angles of triangle makes equilateral or scalene or isosceles triangle

class Triangle {

    public static String findTypeOfTriangle(int x, int y, int z) {
        if(x==y){
            if(y==z){
                return "equilateral";
            }
            return "isosceles";
        }else if(x==z || y==z){
            return "isosceles";
        }
        return "scalene";
    }
    
}

public class Driver9 {
    public static void main(String[] args) {
        System.out.println(Triangle.findTypeOfTriangle(100, 40, 40));
    }
}
