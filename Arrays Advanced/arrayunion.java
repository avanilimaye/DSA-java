import java.util.*;
public class arrayunion 

{
    public static void main(String[] args) 
    {
         int nums1[]={1,2,3,4,5};
        int nums2[]={1,2,7};
        Set<Integer> set1=new TreeSet<>();
        //return union of both sets
        //int n=Math.max(nums1.length,nums2.length);
        for(int i=0;i<nums1.length;i++)
        {
            set1.add(nums1[i]);
        }
        for(int j=0;j<nums2.length;j++)
        {
            set1.add(nums2[j]);
        }

        System.out.println (set1);
        //if return type is array,copy set elements into array
    }
   
}
/*
[1, 2, 3, 4, 5, 7]
*/
