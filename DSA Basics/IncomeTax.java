import java.util.*;
class IncomTax{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Income:");
        int a=sc.nextInt();
System.out.print("amount at which 20% taxes are compulsory:");
        int b=sc.nextInt();
        System.out.print("amount at which 30% taxes are compulsory");
        int c=sc.nextInt();
        if (a<=b){
            System.out.println("no taxes applied");
        }else if(a>=b && a<=c){
            System.out.println("20% taxes are: "+(a/100)*20);
        }else{
            System.out.println("30% taxes are: "+(a/100)*30);
        }
    }
}