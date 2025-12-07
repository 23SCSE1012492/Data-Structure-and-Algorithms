import java.util.*;
public class SearchKeyIndex {
    public static boolean search(int matrix[][],int key) {
        for (int i=0;i<matrix.length;i++) {
            for (int j = 0; j <matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("key found at"+"("+ i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("not found");
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int matrix[][]=new int[3][3];
        int m=3;
        int n=3;
        int key=4;


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
        search(matrix,key);

    }
}


