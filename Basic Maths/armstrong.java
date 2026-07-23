/*
An armstrong number is a number which is equal to the
sum of the digits of the number, raised to the power
of the number of digits.
eg ]
Input: n = 153
Explanation: Number of digits : 3.
1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
Therefore, it is an Armstrong number.
*/


public class armstrong 
{
    public static void main(String[] args) 
    {
        
    
        int n=153;
        int n2=n;/*here we will need n to compare after so 
        make copy and modify it instead*/
        int sum=0;
        String num=Integer.toString(n);
        int l=num.length();
        while(n2>0)
        {
            int lastdigit=n2%10;
            int d=1;
            for(int i=1;i<=l;i++)
            {
                d=d*lastdigit;
            }
            sum=sum+d;
            n2=n2/10;
        }
        if(sum==n)
        {
            System.out.println(n+" is an Armstrong number");
        }
        else
        {
            System.out.println("not an armstrong number");
        }
   
}
}

/*
153 is an Armstrong number
*/
