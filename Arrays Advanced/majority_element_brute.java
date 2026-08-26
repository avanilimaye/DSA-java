import java.util.*;
public class majority_element_brute 
{
    public static void main(String[] args) 
    {
        int [] nums={1,3,2,7,3,3,4,6,3,4,3,3,3};
        for(int i=0;i<nums.length;i++)
        {
            int counter=0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==nums[j])
                {
                    counter++;
                }
            }
            if(counter>nums.length/2)
            {
                System.out.println("majority:"+nums[i]);
                return ;
            }
        }
        System.out.println("no majority");
    }
}
/*
majority:3
*/