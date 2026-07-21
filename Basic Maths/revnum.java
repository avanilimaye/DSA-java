

public class revnum 
{
    public static void main(String[] args) 
    {
        int n=6823;
        int rev=0;
        while(n>0)
        {
            int lastdigit=n%10;//remainder
            rev=rev*10 + lastdigit;
            n=n/10; //reduce working number
        }
        System.out.print("reverse:"+rev);
    }   
}
/*
reverse:3286
*/