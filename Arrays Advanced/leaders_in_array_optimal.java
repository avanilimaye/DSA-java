import java.util.*;
public class leaders_in_array_optimal 
{
    /*OPTIMAL - start from rightmost(last element) and move right
    set last as max, add it to the answer array (as last is always leader) and then move right
    ,keeping track of max and adding new max to the list*/
    public static void main(String[] args) 
    {
        int nums[]={1, 2, 5, 3, 1, 2};
        int n=nums.length;
        
        ArrayList<Integer> a=new ArrayList<>();
        int max=nums[n-1];
        a.add(max);

        for(int i=n-2;i>=0;i--)
         //n-2 bcos we have already included max in list
        {
            if(nums[i]>max)
            {
                a.add(nums[i]);
                max=nums[i];
            }                
        }
        Collections.reverse(a);
        System.out.println("Array:"+Arrays.toString(nums));
        System.out.println("Leaders:"+a);
    }
}
/*
Array:[1, 2, 5, 3, 1, 2]
Leaders:[5, 3, 2]
*/
