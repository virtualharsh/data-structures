// 17. Find second maximum of n numbers without using array.

import java.util.Scanner;

public class Driver17 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int max = -1, secondMax = -2;

        System.out.print("Enter the number you want to enter :");
        int n = sc.nextInt();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter " + i + " value :");
            int temp = sc.nextInt();

            if (temp > max) {
                secondMax = max;
                max = temp;
            }else if(temp > secondMax){
                secondMax = temp;
            }
        }

        System.out.println("\nSecond maximum is " + secondMax);
        sc.close();
    }
}
