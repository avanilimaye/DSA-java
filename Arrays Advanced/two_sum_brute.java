import java.util.Arrays;

public class two_sum_brute 
{
    public static void main(String[] args) 
    {
        //BRUTE
        int [] nums={1, 6, 2, 10, 3};
        int target=7;
        //return indexes of elements that sum the target
        int [] ans=new int[2];
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target)
                {
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        System.out.println("Target:"+target);
        System.out.println("indexes of sum elements:"+Arrays.toString(ans));
        System.out.println("Element 1:"+nums[0]);
        System.out.println("Element 2:"+nums[1]);

    }
}
/*
Target:7
indexes of sum elements:[0, 1]
Element 1:1
Element 2:6
*/
