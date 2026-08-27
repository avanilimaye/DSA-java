public class subarraysum 
{
    public static void main(String[] args) 
    {
        int[] nums={1,2,3,4};
        int n=nums.length;
        int totalsum=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                int sum=0;
                for(int k=i;k<=j;k++)
                {
                    sum=sum+nums[k]; 
                    totalsum=totalsum+nums[k];
                    System.out.print(nums[k]+" ");
                    
                }
                System.out.println("||sum:"+sum);                
            }
            System.out.println();
        }
        System.out.println("totalsum:"+totalsum);
    }
}
/*
1 ||sum:1
1 2 ||sum:3
1 2 3 ||sum:6
1 2 3 4 ||sum:10

2 ||sum:2
2 3 ||sum:5
2 3 4 ||sum:9

3 ||sum:3
3 4 ||sum:7

4 ||sum:4

totalsum:50
*/
