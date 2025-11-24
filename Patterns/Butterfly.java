public class Butterfly {
    public static void isButterfly(int n) {
        //First Half
        for (int i=1;i<=n;i++){
            //for star
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            //for space
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            //for star
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //2nd Half Inverted of upper 
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                    System.out.print("* ");
            }
            for (int j=1;j<=2*(n-i);j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) {
        int n=4;
        isButterfly(n);
        
    }
    
}
