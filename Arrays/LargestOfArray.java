import java.util.*;
public class LargestOfArray {
    public static int islargest(int num[]) {
        int Largest=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            if(num[i]>Largest){
                Largest=num[i];
                
            }
        }return Largest;
        
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6};
        System.out.println(islargest(num));
        
        
        
    }
    
}
