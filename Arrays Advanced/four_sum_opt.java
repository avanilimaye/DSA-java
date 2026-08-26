import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class four_sum_opt 
{
    public static void main(String[] args) 
    {
        int[] nums={1, -2, 3, 5, 7, 9};
        int target=7;
        int n=nums.length;
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int k=j+1;
                int l=n-1;

                //duplicate i condition
                if(i>0 && nums[i]==nums[i-1])
                {
                    continue;
                }
                //duplicate j condition
                if(j>i+1 && nums[j]==nums[j-1])
                {
                    continue;
                }
                while(k<l)
                {
                    int sum=nums[i]+nums[j]+nums[k]+nums[l];
                    if(sum==target)
                    {
                        List<Integer> row=new ArrayList<>();
                        row.add(nums[i]);
                        row.add(nums[j]);
                        row.add(nums[k]);
                        row.add(nums[l]);
                        ans.add(row);
                        k++;
                        l--;

                        //duplicate k condition
                        while(k<l && nums[k]==nums[k-1])
                        {
                            k++;
                        }
                         //duplicate l condition
                         //l moved left
                        while(k<l && nums[l]==nums[l+1])
                        {
                            l--;
                        }
                    }
                    else if(sum>target)
                    {
                        l--;
                    }
                    else if(sum<target)
                    {
                        k++;
                    }
                }
                
            }
        }
        System.out.println("Target:"+target);
        System.out.println(ans);
    }
}
/*
Target:7
[[-2, 1, 3, 5]]
*/
