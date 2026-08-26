public class PT1
{
    public static void main(String[] args) 
    {
        int r=4;
        int c=2;
        //formula 
        /*
        value=(r-1) C (c-1)
        nCr=n! / (n-r)! r!
        therefore ,n=r-1,k=c-1
        */
       int n=r-1;
       int k=c-1;
       long ans=1;
       for(int i=0;i<k;i++)
       {
            ans=ans* (n-i);
            ans=ans/(i+1);
       }
       System.out.println("Value at ["+r+","+c+"]:"+(int)ans);
    }
}
/*
Value at [4,2]:3
*/