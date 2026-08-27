public class all_subarrays 
{
    public static void main(String[] args) 
    {
        //list all subarrays in a given array
        //subarray - contiguous elements
        //int[] nums={2, 3, 5, -2, 7, -4};
        int[] nums={1,2,3,4};
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                for(int k=i;k<=j;k++)
                {
                    System.out.print(nums[k]+" ");
                }
                System.out.println();
            
            }
        }
    }
}
/*
1 
1 2 
1 2 3 
1 2 3 4 
2 
2 3 
2 3 4 
3 
3 4 
4 
*/