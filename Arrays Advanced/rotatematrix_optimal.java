public class rotatematrix_optimal 
{
    public static void main(String[] args) 
    {
        //OPTIMAL -rotate inplace
        /*first transpose the matrix. for matrix transposal,
        diagonal elements stay the same and a[i][j] swaps with 
        a[j][i]*/
        /*after transposing, the rows need to be reversed to get the rotated matrix*/
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        
        //transpose
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                //swap over diagonal
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }

        //reverse rows
        for(int i=0;i<n;i++)
        {
            int left=0;
            int right=n-1;
            while (left<=right) 
            {
                int temp=matrix[i][left];
                matrix[i][left]=matrix[i][right];
                matrix[i][right]=temp;

                left++;
                right--;
            }
        }

        //print rotated matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }

        
    }
}
/*
7       4       1
8       5       2
9       6       3
*/