public class missingnumber 
{
    //OPTIMAL
    //brute force would be to linear search using i and j
    public static void main(String[] args) 
    {
        //given numbers 0 to N, find the number missing among them
        int[] nums=c//3 missing
        int n=nums.length;
        int sum= n*(n+1)/2;//sum of n natural nos
        int sum1=0;
        for(int i=0;i<n;i++)
        {
            sum1=sum1+nums[i];
        }
        int missing=sum-sum1;
        System.out.println("missing:"+missing);
    }    
}
/*
{0,1,2,4,5};
missing:3

*/
