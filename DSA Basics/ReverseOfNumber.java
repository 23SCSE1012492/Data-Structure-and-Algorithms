public class ReverseOfNumber {
    public static void main(String[] args) {
     
        int a=123456789;
        int reverse=0;
        while(a>0){
            int lastdigit=a%10;
            reverse=(reverse*10+lastdigit);
            System.out.print(lastdigit +" ");
            a=a/10;
        }
    }
    
}
