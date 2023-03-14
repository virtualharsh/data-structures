// Fizz Buzz -> if given number is divided by 3 print Fizz, if number is divided by 5 print Buzz, if number is divided by both 3 and 5 print Fizz Buzz else print the number itself

class FizzBuzz{

    public static String printAppropirate(int n){
        
        String ans = String.valueOf(n);

        if(n%3==0){
            ans = "Fizz"; 
        }
        if (n % 5 == 0) {
            ans += "Buzz";
        }
        return ans;
    }
}

public class Driver10 {
    public static void main(String[] args) {
        System.out.println(FizzBuzz.printAppropirate(15));
    }
}
