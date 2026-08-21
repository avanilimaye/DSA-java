import java.util.*;

public class removeduplicates_brute 
{
    public static void main(String[] args) 
    {
        int[] nums={0, 0, 3, 3, 5, 6};
        Set<Integer> set1=new TreeSet<>();
        for(int i=0;i<nums.length;i++)
        {
            set1.add(nums[i]);
        }
        System.out.println(set1);
      
    }
}
/*
{0, 0, 3, 3, 5, 6}
[0, 3, 5, 6]
*/