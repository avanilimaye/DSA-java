import java.util.*;
public class leaders_in_array_brute 
{
    //leaders in array - all elements to their right are smaller than them
    //eg - [1,5,2,2] - 5 isthe leader and the 2 at the end as well
    //BRUTE - compare linear search
    public static void main(String[] args) 
    {
        int nums[]={33,75,4,100,97,34,55,3};
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int bool=0;
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[j]>nums[i])//elements bigger than it exist on right
                {
                    bool=1;
                    break;
                }
            }  
            if(bool==0)
            {
                a.add(nums[i]);
            }          
        }
        System.out.println("Array:"+Arrays.toString(nums));
        System.out.println("Leaders:"+a);
        
    }
}
/*
Array:[33, 75, 4, 100, 97, 34, 55, 3]
Leaders:[100, 97, 55, 3]
*/