import java.util.Arrays;

public class rearrange_array_optimal 
{
    //OPTIMAL
    /*brute force would be to sort them into a positive and a negetive array
    and then merge them ,index alternating */
    public static void main(String[] args) 
    {
        int[] nums={1,2,3,-7,-8,-3};
        //traverse and place in result array
        int pos=0;//since starting of result needs to be positive leeemnt
        int neg=1;//alternate

        int result[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<0)
            {
                result[neg]=nums[i];
                neg=neg+2;//+2 because alternate
            }
            if(nums[i]>=0)
            {
                result[pos]=nums[i];
                pos=pos+2;//+2 because alternate
            }
        }
        System.out.println("Result:"+Arrays.toString(result));
    }
}
/*
Result:[1, -7, 2, -8, 3, -3]

*/