

public class oddcount 
{
    public static void main(String[] args) 
    {
        int arr[]= {1,2,1,1,5,2};
		int n=6;
		int count=0;
        for(int i=0;i<n;i++)
        {
            int a=arr[i];
            if(a%2!=0)
            {
                count++;
            }
        }
        System.out.println("odd count:"+count);
    }
}
/*
odd count:4
*/