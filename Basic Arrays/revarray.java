//reverse given array

import java.util.Arrays;

public class revarray 
{
    public static void main(String[] args) 
    {
        int arr[]={1,2,3,4,5};
        int n=5;//arr.len
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;

            i++;
            j--;
        }
        
        System.out.println(Arrays.toString(arr));
    }
}
/*
int arr[]={1,2,3,4,5};
[5, 4, 3, 2, 1]
*/