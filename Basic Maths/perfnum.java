
/*
A perfect number is a number whose proper divisors 
(excluding the number itself) add up to the number 
itself.
Example 

Input: n = 6
Explanation: Proper divisors of 6 are 1, 2, 3.
1 + 2 + 3 = 6.
*/
public class perfnum 
{
    public static void main(String[] args) 
    {               
        int n=496;
        int sum=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {                
                sum=sum+i;                
            }
        }        
        if(sum==n)
        {
            System.out.println(n+" is a perfect number");
        }
        else
        {
            System.out.println(n+" is not a perfect number");
        }
}
}
/*
496 is a perfect number
*/