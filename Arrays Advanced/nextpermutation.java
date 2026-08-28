import java.util.Arrays;

public class nextpermutation 
{
    //Find the next biggest permutation of given array
    /*if not found i.e current is the biggest permutation , then 
    return the array reversed*/
    /*APPROACH - find the break point from the right side(since we need to make
    the smallest change) . if breakpoint found , note the indexx and look for the next bigest element
    that is greater than nums[index] but the closest to it. then swap these 2. reverse the entire array
    from that point
    if breakpoint is not found,return the entire reversed arry
     */
    
    public static void main(String[] args) 
    {
        //int[] nums={1, 3, 5, 4, 2};
        int[] nums={5, 4, 3, 2, 1};
        int[] nums_original=Arrays.copyOf(nums, nums.length);;
        
        //next largest is {1,3,2};
        //breakpoint is 2 form which we reversed
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--)
        {
            //start from right becase we need to make the smallest possible change
            if(nums[i]<nums[i+1])
            {
                index=i;
                break;
                //breakpoint found
            }
        }
        //breakpoint found,find next smallest element that will make array a bit largeer
        if(index!=-1)
        {
            for(int i=n-1;i>index;i--)
            {
                if(nums[i]>nums[index])
                {
                    //swap
                    int temp=nums[index];
                    nums[index]=nums[i];
                    nums[i]=temp;
                    break;
                    //numbers have been swapped
                    //reverse the array from that point
                }
            }
           reverse(nums, index + 1, n - 1);
           System.out.println("Array:"+Arrays.toString(nums_original));
            System.out.println("Next permutation:"+Arrays.toString(nums));
            
        }
        else if(index==-1)//breakpoint not found.return revers array entire
        {
            reverse(nums,0,n-1);
            System.out.println("Array:"+Arrays.toString(nums_original));
            System.out.println("Current is the greatest permutation");
            System.out.println("Next permutation:"+Arrays.toString(nums));
        }
        
    }
    public static void reverse(int[] nums,int left,int right)
    {
        while(left<right)
        {
            //swap
            int temp=nums[left];
            nums[left]=nums[right];
            nums[right]=temp;

            right--;
            left++;
        }
    }
}

/*
Array:[1, 3, 5, 4, 2]
Next permutation:[1, 4, 2, 3, 5]

Array:[5, 4, 3, 2, 1]
Current is the greatest permutation
Next permutation:[1, 2, 3, 4, 5]
*/