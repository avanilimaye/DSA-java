import java.util.*;
public class arrayintersection 
{
    public static void main(String[] args) 
    {
        int nums1[]={1,2,2,3,4,5,6,8};
        int nums2[]={1,1,2,2,7,8};
        int n=Math.max(nums1.length,nums2.length);
        int visited[]=new int[n];
        ArrayList<Integer> a1=new ArrayList<>();

        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++)
            {
                if(nums1[i]==nums2[j] && visited[j]==0)
                {
                    a1.add(nums1[i]);
                    visited[j]=1;
                    break;
                }
            }
        }
        System.out.println(a1);
    }
}
