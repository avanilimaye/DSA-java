import java.util.*;

public class rotateleftbyK 
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6};
        int k=3;//rotate nums 3 times left
        for(int i=0;i<k;i++)
        {
            int temp=nums[0];
            for(int j=1;j<nums.length;j++)
            {
                nums[j-1]=nums[j];
            }
            nums[nums.length-1]=temp;
        }
        System.out.println(Arrays.toString(nums));
    }
}
/*
{1,2,3,4,5,6};
k=3;
[4, 5, 6, 1, 2, 3]
*/
