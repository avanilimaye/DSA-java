import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class three_sum_opt 
{
    //keep one element fixed at i , and other 2 do like 2 sum optimal
    //here if we do brute , we will need 3 nested loops O(n^3) which will give time error
    //i != j, i != k, and j != k ||nums[i] + nums[j] + nums[k] == 0., avoid duplicates

    public static void main(String[] args) 
    {
        int [] nums={2, -2, 0, 3, -3, 5};
        Arrays.sort(nums);
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++)
        {           
            int j=i+1;
            int k=n-1;
            
            //duplicate i condition
            if(i>0 && nums[i]==nums[i-1])
            {
                continue;
            }
            while(j<k)
            {
                int sum=nums[i]+nums[j]+nums[k];
                if(sum==0)
                {
                    ArrayList<Integer> rows=new ArrayList<>();
                    rows.add(nums[i]);
                    rows.add(nums[j]);
                    rows.add(nums[k]);
                    ans.add(rows);
                    j++;
                    k--;
                    //duplicate j condition
                    while(j<k && nums[j]==nums[j-1])
                    {
                        j++;
                    }
                    //duplicate k condition
                    while(j<k && nums[k]==nums[k-1])
                    {
                        k--;
                    }
                }
                else if (sum>0)
                {
                    k--;
                }
                else if(sum<0)
                {
                    j++;
                }
                
            }
            
        }
        for(int i=0;i<ans.size();i++)
        {
            System.out.println(ans.get(i));
        }        

    }
}
/*
[-3, -2, 5]
[-3, 0, 3]
[-2, 0, 2]
*/
