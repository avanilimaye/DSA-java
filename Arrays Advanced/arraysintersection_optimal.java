import java.util.*;
public class arraysintersection_optimal 
{
    //OPTIMAL - 2 POINTERS APPROACH. IF PAOR MATCH,ADD TO ARRAYLIST
    public static void main(String[] args) 
    {
        int[] nums1={1,1,2,3,3,4,5,5,7};
        int[] nums2={1,1,2,3,4,4,5,7,8};
        ArrayList<Integer> a=new ArrayList<>();
        
        int i=0;int j=0;
        while(i<nums1.length && j<nums2.length)
        {
            if(nums1[i]==nums2[j])
            {
                a.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]>nums2[j])
            {
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                i++;
            }
        }
        System.out.println(a);
        
    }
}
