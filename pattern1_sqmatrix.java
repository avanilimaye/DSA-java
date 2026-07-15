package Pattern_problems;
//take input n and print a square matrix n by n of stars

public class pattern1_sqmatrix 
{
    public static void main(String[] args)
    {
        int n=5;
        for (int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
             System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
/* O/P
*****
*****
*****
*****
*****
*/