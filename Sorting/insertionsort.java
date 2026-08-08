import java.util.Arrays;

public class insertionsort 
{
    public static void main(String[] args) 
    {
        int arr[]={7,4,657,32,769,3,8,54};
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            int key=arr[i];
            int j=i-1;
            while(j>=0 && arr[j]>key)
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
        System.out.println(Arrays.toString(arr));
    }
}
/*

[3, 4, 7, 8, 32, 54, 657, 769]
*/