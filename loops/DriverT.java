// 20. Find how many notes would be required to get target.

public class DriverT {
    public static void main(String[] args) {
        int target = 1515;
        
        System.out.println("target to get is " + target);
        System.out.println();
        System.out.println("we will require " + target/100 + " of 100 notes");
        target %= 100;
        System.out.println("we will require " + target / 10 + " of 10 notes");
        target %= 10;
        System.out.println("we will require " + target / 2 + " of 2 coins");
        target %= 2;
        System.out.println("we will require " + target / 1 + " of 1 coins");
        target %= 1;
        System.out.println();
    }
}
