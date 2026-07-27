/*
output the number which is highest occuring in the array
if 2 numbers r occuring the same amount of times, the smaller 
of the 2 has to be outputted
*/
//import java.util.Arrays;
public class highestocc 
{
    public static void main(String[] args) 
    {
        int arr[]={5, 2, 5, 7, 2, 5, 7, 7, 7};
        int n=arr.length;
        /*find the max element in the array and 
        max+1 becomes the length ofthe hash array.*/
        int arrmax=arr[0];
        for(int i=0;i<n;i++)
        {
            if(arr[i]>arrmax)
            {
                arrmax=arr[i];
            }
        }
        int hash[]=new int[arrmax+1];

        //traverse and record frequencies of elemnts in hash arr
        for(int j=0;j<n;j++)
        {
            int a=arr[j];
            hash[a]++;
        }
        /*
        hash={0,0,2,0,0,3,0,3}.
        the index is the element and the value in it is the freq
        */
    //find max freq and element
        int maxfreq=0;
        int maxnum=0;
        for(int k=0;k<hash.length;k++)
        {
                if(hash[k]>maxfreq)
                {
                    maxfreq=hash[k];
                    maxnum=k;
                }
        }
        System.out.println("Max:"+maxnum+" |Occurs:"+maxfreq+" times");
    }
}
    /*

{5, 2, 5, 7, 2, 5, 7, 7};
Max:5 |Occurs:3 times


{5, 2, 5, 7, 2, 5, 7, 7, 7}
Max:7 |Occurs:4 times
*/