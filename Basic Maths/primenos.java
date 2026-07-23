public class primenos 
{
    public static void main(String[] args) 
    {
        int n=350;
        if(n<=1)
        {
            return;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                System.out.println(n+":not prime");
                return;
            }
            else
            {
                System.out.println(n+":prime");
                return;
            }
        }
        
    }
}
/*
350:not prime
357:prime
*/
