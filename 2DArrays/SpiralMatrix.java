public class SpiralMatrix {
    public static void isSpiralMatrix(int matrix[][]) {
        int startrow=0;
        int startcols=0;
        int endrow=matrix.length-1;
        int endcols=matrix[0].length-1;
        while(startrow<=endrow && startcols<=endcols){
            //Top
            for(int j=startcols;j<=endcols;j++){
                System.out.print(matrix[startrow][j]+" ");
            }
            //Right
            for(int i=startrow+1;i<=endrow;i++){
                System.out.print(matrix[i][endcols]+" ");
            }
            //Bottom
            for(int j=endcols-1;j>=startcols;j--){
                //condition for m*n matrix not only n*n
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");
            }
            //Left
            for(int i=endrow-1;i>=startrow+1;i--){
                //condition for m*n matrix not only n*n
                if(startcols==endcols){
                    break;
                }
                System.out.print(matrix[i][startcols]+" ");
            }
            startcols++;
            startrow++;
            endcols--;
            endrow--;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        int matrix[][]= {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        isSpiralMatrix(matrix);
    }
}
