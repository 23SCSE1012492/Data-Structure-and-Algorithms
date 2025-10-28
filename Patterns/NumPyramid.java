public class NumPyramid {
    public static void isNum_Proper_Pyramid(int n){
        int count=1;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        int n=5;
        isNum_Proper_Pyramid(n);
        
    }
}
