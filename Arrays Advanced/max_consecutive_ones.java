//given a binary array find max consective ones

public class max_consecutive_ones 
{
    public static void main(String[] args) 
    {
        int arr[]={0,0,0,0,};
        int counter=0;
        int maxcount=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==1)
            {
                counter++;
                if(counter>maxcount)
                {
                    maxcount=counter;
                }
            }
            if(arr[i]==0)
            {
                counter=0;
            }
        }
        System.out.println("Max consecutive 1s:"+maxcount);
    }
}
/*
{1,0,1,1,1,0,0,1}
Max consecutive 1s:3

{0,0,0,0,};
Max consecutive 1s:0


*/