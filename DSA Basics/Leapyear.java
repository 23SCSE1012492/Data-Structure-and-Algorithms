import java.util.*;
class tusif{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Year");
        int  year=sc.nextInt();
        boolean a=(year%4)==0;
        boolean b=(year%100)!=0;
        boolean c=(year%400)==0;
        if(a&&(b||c)){
            System.out.println("leap year");
        }
        else{
            System.out.println("Not leap year");
        }
    }
}
