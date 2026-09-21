public class count_inversions 
{
    //make a pair , left element should be greater than right element
    //return  number of such pairs from given array
    /*extreme brute force - keep i and j loop , j=i+1 , keep a counter
    if elements at i> el at j , count++ . return count - 
    O(N^2)*/
    public static void main(String[] args) 
    {

        int arr[]={2, 3, 7, 1, 3, 5};
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    count++;
                    System.out.println("["+arr[i]+","+arr[j]+"]");
                }
            }
        }
        System.out.println("count:"+count);
    }
}
/*
[2,1]
[3,1]
[7,1]
[7,3]
[7,5]
count:5
 */