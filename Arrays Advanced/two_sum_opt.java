import java.util.Arrays;
public class two_sum_opt 
{
    public static void main(String[] args) 
    {
        //using 2 pointer approach
        /*Sort the array ,start from start+end sum .if sum is smaller,move start ahead
        if sum is gretaer move last back . if equal,return 
         */
        int [] nums={1, 6, 2, 10, 3};
        int target=7;
        int n=nums.length;
        int p1=0;
        int p2=n-1;
        int[][]arr=new int[n][2];//stores original values and indices
        for(int i=0;i<n;i++)
        {
            arr[i][0]=nums[i];
            arr[i][1]=i;
        }
        Arrays.sort(arr,(a,b)->Integer.compare(a[0],b[0]));
        int[] ans=new int[2];//return indices for sum elements
        while(p1<p2)
        {
            int sum=arr[p1][0]+arr[p2][0];
            if(sum==target)
            {
                ans[0]=arr[p1][1];
                ans[1]=arr[p2][1];
                break;
            }
            else if(sum>target)
            {
                p2--;
            }
           else if(sum<target)
            {
                p1++;
            }
        }
        System.out.println(Arrays.toString(ans));
        
    }
}
