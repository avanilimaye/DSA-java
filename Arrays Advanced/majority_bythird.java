import java.util.ArrayList;
import java.util.List;

public class majority_bythird 
{
    public static void main(String[] args) 
    {
        //CANDIDATE IF count>N/3
        //use MOORES VOTING but with 2 candidates
        //in the second pass crosschecl=k count
        int c1=-1;
        int count1=0;
        int c2=-1;
        int count2=0;
        int[] nums={1, 2, 1, 1, 3, 2,2};
        int n=nums.length;
        //for N/3 , we can have 2 majority candidates
        //FIRST PASS - MORRES VOTING WITH 2 CANDIDATEs
        for(int i=0;i<n;i++)
        {
            if(nums[i]==c1)
            {
                count1++;
            }
            else if(nums[i]==c2)
            {
                count2++;
            }
            //when count is 0,current is candate
            else if(count1==0)
            {
                c1=nums[i];
                count1++;
            }
            else if(count2==0 && count1!=0)
            {
                c2=nums[i];
                count2++;
            }
            else if(nums[i]!=c1 && nums[i]!=c2)
            {
                count1--;
                count2--;
            }

            //c1 and c2 obtained now crosscheck
        }

        //SECOND PASS - COUNT ACTUAL
        count1=0;
        count2=0;
        for(int i=0;i<n;i++)
        {
            if(nums[i]==c1)
            {
                count1++;
            }
            else if(nums[i]==c2)
            {
                count2++;
            }
        }
        //add valid candidates
        List<Integer> candidates=new ArrayList<>();
        if(count1>n/3)
        {
            candidates.add(c1);
        }
        if(count2>n/3)
        {
            candidates.add(c2);
        }
        System.out.println(candidates);

    }
}
/*
[1, 2]
 */