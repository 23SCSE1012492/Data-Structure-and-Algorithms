import java.util.*;
public class TransposeMatrix {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;
        System.out.print("Enter matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix form is: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int transpose[][]=new int[m][n];
        for(int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose matrix is:");
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
}
