import java.util.*;
class Prime{
    public static boolean isPrime(int n){
     boolean isPrime=true;
        if (n==2){
          return  true;
        }
        for(int i=2;i<=n-1;i++){
            if (n%i==0){
               //isPrime=false;
                return false;
            }
        }
        return true;  
    }
    public static void main(String[] args) {
        System.out.print(isPrime(5));
        
    }
}