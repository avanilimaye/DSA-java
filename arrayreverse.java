
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        int[] arr={2,4,6,8,10,12,14,16};
        int i=0;
        int n=arr.length;
        int j=n-1;
        while(i<=j)
        {
            //till i and j cross each other
            //switch i and j
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        }        
        System.out.println(arr);
        System.out.println(Arrays.toString(arr));//to print in array format
        //else can just use loop
        //just printing array wil give garbage values/hashcode
        /*for(int k=0;k<n;k++)
        {
            System.out.print(arr[k]+"\t");
        }*/
    }
}