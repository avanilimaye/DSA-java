
import java.util.*;
public class selectionsort 
{
    public static void main(String[] args) 
    {
        int arr[]={2,54,1,98,287,24,65};
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
        int min=i;
        for(int j=i+1;j<n;j++)
        {
            if(arr[j]<arr[min])
            {
                min=j;
            }                
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;

    }
    System.out.println(Arrays.toString(arr));
    }
    
}
/*
[1, 2, 24, 54, 65, 98, 287]

select smallest and swap position
*/