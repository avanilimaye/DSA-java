public class maxsum_subarray_kadanes 
{
    public static void main(String[] args) 
    {
        //OPTIMAL - KADANES ALGO
        //keep track of sum . if sum goes below 0 , reset it to 0
        //here we are also keeping track of max subarray not just sum
        int[] nums={2, 3, 5, -2, 7, -4};
        int n=nums.length;
        
        //to track max sum subarray
        int start = 0;      // current subarray's start
        int ansStart = 0;   // maximum subarray's start
        int ansEnd = 0;     // maximum subarray's end

        int sum=0;
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            sum=sum+nums[i];
            //store new sum value if sum>maxsum
            if(sum>maxsum)
            {
                maxsum=sum;

                ansStart = start;
                ansEnd = i;
            }
            //reset is sum<0
            if(sum<0)
            {
                sum=0;

                start = i + 1;
            }
        }
        System.out.println("maxsum:"+maxsum);
        System.out.print("Max subarray: ");
        for (int i = ansStart; i <= ansEnd; i++) 
        {
            System.out.print(nums[i] + " ");
        }
    }
}
/*
maxsum:15
Max subarray: 2 3 5 -2 7 
*/