
public class checksorted 
{
    public static void main(String[] args) 
    {
        int arr[]={2,3,4,5,6,8,7};
        int n=7;
        for(int i=0;i<n-1;i++)
        {
            int a=arr[i];
            int b=arr[i+1];
            if(a>b)
            {
                System.out.println("unsorted");
                return;
            }            
        }
        System.out.println("sorted");
        
    }
}
/*
int arr[]={2,3,4,5,6,8,7}; unsorted
int arr[]={2,3,4,5,6,7,8};sorted

*/