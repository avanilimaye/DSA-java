public class rotatematrix_brute 
{
    public static void main(String[] args) 
    {
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
        int n=matrix.length;
        int [][]ans=new int[n][n];
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                ans[j][n-i-1]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(ans[i][j]+"\t");
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
