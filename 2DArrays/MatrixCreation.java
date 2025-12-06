import java.util.*;
public class MatrixCreation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int m=matrix.length;
        int n=matrix[0].length;

        System.out.print("enter matrix:");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }

        System.out.println("Matrix form is:");
        for (int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
