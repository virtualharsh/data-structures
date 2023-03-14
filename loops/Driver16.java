// 16. Find maximum of n numbers without using array.

import java.util.Scanner;

public class Driver16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int max = -1;

        System.out.print("Enter the number you want to enter :");
        int n = sc.nextInt();
        System.out.println();

        for(int i=1 ; i<=n ; i++){
            System.out.print("Enter " + i + " value :");
            int temp = sc.nextInt();

            if(temp>max){
                max = temp;
            }
        }
        
        System.out.println("\n maximum is " + max);
        sc.close();
    }
}
