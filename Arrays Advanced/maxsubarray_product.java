public class maxsubarray_product 
{
    public static void main(String[] args) 
    {
        //find maximum product in the subarray
        //if only single element is present , t hat is the max
        //// BRUTE FORCE - generate all subarrays and calculate their product
        /// 
        /// //if we need to pront the max product subarrray, remember the starting and ending indices of it
        
        int [] nums= {4, 5, 3, 7, 1, 2};
        int n=nums.length;
        int start=0;
        int end=0;
        int maxprod=Integer.MIN_VALUE;
        if(n==1)
        {
            System.out.println(nums[0]);
        }
        for(int i=0;i<n;i++)
        {
            int prod=1;
            for(int j=i;j<n;j++)
            {
                //j is the ending index of the subarray and i is start
                prod=prod * nums[j];
                if(prod>maxprod)
                {
                    maxprod=prod;
                    start=i;
                    end=j;
                }
            }
        }
        // Print the maximum-product subarray
        System.out.print("Subarray: ");
        for(int k = start; k <= end; k++)
        {
            System.out.print(nums[k] + " ");
        }
        System.out.println("\nMax Product:"+maxprod);
        
    }
}/*
Subarray: 4 5 3 7 1 2 
Max Product:840
*/
