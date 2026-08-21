//left rotate by 1
// 12345 will become 23451
import java.util.*;
public class leftrotateby1 
{
    public static void main(String[] args)
    {
        int[] nums={1,2,3,4,5,6};
        int temp=nums[0];//store first element as it will go in last
        //if we do not store it before the rotations, wrong value will be
        for(int i=1;i<nums.length;i++)
        {
            nums[i-1]=nums[i];
        }
        nums[nums.length-1]=temp;
        //assign previous first element to last;
        System.out.println(Arrays.toString(nums));
    }
}
/*
{1,2,3,4,5,6}
[2, 3, 4, 5, 6, 1]
*/