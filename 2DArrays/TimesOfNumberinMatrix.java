public class TimesOfNumberinMatrix {
    public static int timesRepeated(int matrix[][],int key) {
        int count7=0;
        int n=matrix.length;
        int m=matrix[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++) {
                if (key == matrix[i][j]) {
                    count7++;
                }
            }
        }
        System.out.println("Number of 7's: "+ count7);
        return -1;
    }
    public static void main(String[] args) {
        int matrix[][]={
                {4,7,8},
                {8,8,7}
        };
        int key=7;
        timesRepeated(matrix,key);
    }
}
