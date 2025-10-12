import java.util.*;
public class IsPalindrome {
    
    public static boolean ispalindrome(int n) {
        int reverse=0;
        int original=n;
        int lastInt;
        while(n!=0){
             lastInt=n%10;
            reverse=reverse*10+lastInt;
            n/=10;
        }
        if(reverse==original){
            return true;
        }
        return false;
       
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter n: ");
        int n=sc.nextInt();
        //palindrome(n);
        if(ispalindrome(n)){
            System.out.println("is palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        
    }  
}
