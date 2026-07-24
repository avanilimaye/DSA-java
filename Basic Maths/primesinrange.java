/* given n , we have to find number of prime numbers in range 
1 to n, n included
 */
class primesinrange 
{
    public static void main(String[] args)
    {
        primesinrange obj = new primesinrange();
        obj.primecal();
    }
    public void primecal() //Primeupton
    {
        int n=33;
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(isprime(i))
            {
                count++;
            }
        }
        System.out.println("Primes in range 1 to "+n+":"+count);
    }
    private boolean isprime(int n)
    {
        if(n<=1)
        {
            return false;
        }
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                return false;//not prime
            }
        }
        return true;
    }   
    
}
/*
Primes in range 1 to 20:8
*/