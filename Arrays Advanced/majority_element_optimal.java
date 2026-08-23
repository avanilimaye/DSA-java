public class majority_element_optimal 
{
    /*Uses Moore's voting algorithm which keeps a count ,candidate and current.
    and keep cancelling when current does not match candidate
    The idea is that the majority element will never get cancelled*/

    public static void main(String[] args) 
    {
        int[] nums={5, 8, 5, 3, 5, 8, 5, 5, 3};
        int n=nums.length;
       // int current=0;
        int count=0;
        int candidate=0;
        for(int i=0;i<n;i++)
        {
           if(count ==0)
            //no candidate is currently serving and hecnce current is candidate 
           {
                candidate=nums[i];
           }
           if(candidate==nums[i])
           {
            count++;
           }
           else if(candidate!=nums[i])
           {
            count--;
           }
        }
        System.out.println("Majority:"+candidate);
    }
}
/*
Majority:5
*/