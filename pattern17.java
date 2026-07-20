public class pattern17 
{
    public static void main(String[] args)
    {    
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int k=0;k<n-i-1;k++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++)
            {
                System.out.print((char)('A'+j));
            }
            for(int j=i-1;j>=0;j--)
            {
                System.out.print((char)('A'+j));
            }
            System.out.println();
        }
    }
}

/*
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/