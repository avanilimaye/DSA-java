public class pattern20 
{
    public static void main(String[] args) 
    {
        int n=5;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            for(int k=i;k<n;k++)
            {
                System.out.print("  ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.print("*");
            }
            for(int k=n-i;k<n;k++)
            {
                System.out.print("  ");
            }
            for(int j=i+1;j<=n;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

/*
*        *
**      **
***    ***
****  ****
****  ****
***    ***
**      **
*        *
*/