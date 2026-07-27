/* sum of highest and lowest frequecies
 */

public class highestlowestsum 
{
    public static void main(String[] args) 
    {
        int[] arr={1,2,2,3,3,3,1,3,2,1,2,3,2,1,3,3,3,2,1,1};
        int n=arr.length;

        //find max element for hash array length
        int arrmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arrmax)
            {
                arrmax=arr[i];
            }
        }

        int hash[]=new int[arrmax+1];

        //find frequency
        for(int j=0;j<n;j++)
        {
            int a=arr[j];
            hash[a]++;
        }

        //find min and max
        int minfreq=Integer.MAX_VALUE;
        int maxfreq=0;
        for(int k=0;k<hash.length;k++)
        {
            if(hash[k]>maxfreq)
            {
                maxfreq=hash[k];
            }
            if(hash[k]<minfreq && hash[k]!=0)
            {
                //0 is not counted as minimum here
                minfreq=hash[k];
            }
        }

        System.out.println("Minimum freq:"+minfreq);
        System.out.println("Maximum freq:"+maxfreq);
        System.out.println("Sum:"+(minfreq+maxfreq));

    }
}
/*
int[] arr={1,2,2,3,3,3,1,3,2,1,2,3,2,1,3,3,3,2,1,1};
Minimum freq:6
Maximum freq:8
Sum:14

*/