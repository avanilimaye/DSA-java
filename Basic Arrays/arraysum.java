
public class arraysum 
{
    public static void main(String[] args) 
    {
        int arr[]={3,5,7,8,9};
        int n=5;//arraylength//pre provided
        int sum=0;
        for (int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        System.out.println("arraysum:"+sum);
    } 
}
/*
arraysum:32
*/