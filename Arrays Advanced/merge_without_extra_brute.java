import java.util.Arrays;

public class merge_without_extra_brute 
{
    //2 arrays are given 
//merge without usinf extra space
//BRUTE - merge function of merge sort
    public static void main(String[] args) 
    {
        int[] nums1={-5, -2, 4, 5, 5};
        int[] nums2= {-3, 1, 8};
        int n=nums1.length;
        int m=nums2.length;
        int k=m+n;
        int nums3[]=new int[k];
        int i=0;//pointer of nums1
        int j=0;//pointer of nums2
        int index=0;//index of nums3
        
        while(i<n && j<m)
        {
            if(nums1[i]>nums2[j])
            {
                nums3[index]=nums2[j];
                index++;
                j++;
            }
            else if(nums1[i]<nums2[j])
            {
                nums3[index]=nums1[i];
                index++;
                i++;
            }
            else//if equal
            {
                nums3[index]=nums2[j];
                index++;
                j++;
                nums3[index]=nums1[i];
                index++;
                i++;
            }
        //after this while loop, one of the arrays will be exhausted
        //the other should be copy pasted as is
        }
        while(i<n)
        {
            nums3[index]=nums1[i];
            index++;i++;
        }
        while(j<m)
        {
            nums3[index]=nums2[j];
            index++;j++;
        }
        //copy nums3 back to nums1
        //here , just print nums3
        System.out.println("Array1:"+Arrays.toString(nums1));
        System.out.println("Array2:"+Arrays.toString(nums2));
        System.out.println("Merged Array:"+Arrays.toString(nums3));
    }

}
/*
Array1:[-5, -2, 4, 5, 5]
Array2:[-3, 1, 8]
Merged Array:[-5, -3, -2, 1, 4, 5, 5, 8]
*/
