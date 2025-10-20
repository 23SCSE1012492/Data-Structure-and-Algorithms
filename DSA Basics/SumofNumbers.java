import java.util.Scanner;
public class SumofNumbers {
    public static int isSum(int n) {
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum = sum + lastDigit;
            n /= 10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int n = 24;
        System.out.println("sum is: " + isSum(n));
    }
}
        

