public class pattern18 
{
    public static void main(String[] args) 
    {
        int n=6;
        for(int i=0;i<n;i++)
        {
            for(int j=n-i-1;j<n;j++)
            {
                System.out.print((char)('A'+j)+" ");
            }
            System.out.println();
        }
    }
}
/*
F 
E F 
D E F 
C D E F 
B C D E F 
A B C D E F 
*/