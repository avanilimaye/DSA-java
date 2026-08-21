
/*BRUTRE FORCE-pick elements which are non zero and place
them in another array. since arrays aer initlized with null,
other spaces will naturally be 0*/
/*OPTIMAL - // Use two pointers: i traverses the array, while j
tracks the next position for a non-zero element.
Move non-zero elements to the front using j;
zeros are automatically pushed to the end
 */
import java.util.*;
public class zeroestoend 
{
    //using brute force
    public static void main(String[] args) 
    {
        int[] nums={1,0,2,3,0,0,4,5,0,6};
        int index=0;
        int answer[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=0)
            {
                answer[index]=nums[i];
                index++;
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
/*
1,0,2,3,0,0,4,5,0,6};
[1, 2, 3, 4, 5, 6, 0, 0, 0, 0]
*/
