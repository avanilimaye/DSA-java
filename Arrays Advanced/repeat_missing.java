import java.util.Arrays;

public class repeat_missing 
{
    public static void main(String[] args) 
    {
        //MATH APPROACH
        //One Repeat element in array and one missing
        //return [repeat,missing]
        int[] nums={1, 2, 3, 6, 7, 5, 7};
        long n=nums.length;
        
        long nums_sum=0;//actual aray sum
        long nums_ss=0;//sum of sqayres of array
        long exp_sum=n*(n+1)/2;
        long exp_ss=n*(n+1)*(2*n+1)/6;
        
        for(int i=0;i<n;i++)
        {
            nums_sum=nums_sum+(long)nums[i];
            nums_ss=nums_ss+ (long)nums[i]*nums[i];
        }
        
        long sumdiff=nums_sum-exp_sum;//x-y
        long ssdiff=nums_ss-exp_ss;//x2- y2

        long xplusy=ssdiff/sumdiff;//x+y;

        long repeat=(xplusy+sumdiff)/2;
        long missing=repeat-sumdiff;
        int repeat_missing[]=new int[2];
        repeat_missing[0]=(int)repeat;
        repeat_missing[1]=(int) missing;


        System.out.println("Array:"+Arrays.toString(nums));
        System.out.println("Repeat,missing:"+Arrays.toString(repeat_missing));

    }
}
/*
Array:[1, 2, 3, 6, 7, 5, 7]
Repeat,missing:[7, 4]
*/
