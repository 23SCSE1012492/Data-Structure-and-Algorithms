import java.util.*;
class FactorialJ{
    public static void Factorial(int fact){
        int num=5;
        for(int i=1;i<=num;i++){
          fact=fact*i; 
        }System.out.println(fact);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        Factorial(fact);  
    }
}