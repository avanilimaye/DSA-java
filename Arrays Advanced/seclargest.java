

public class seclargest 
{
    public static void main(String[] args) 
    {
        int [] arr={0,-1,3,5,23,859,2};
        int largest=Integer.MIN_VALUE;
        int sec=Integer.MIN_VALUE;
        if(arr.length<=1)
        {
            System.out.print("-1");
            return;
            //if length is 1 ,secondlargest does not exist
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                sec=largest;//previous larest is current second largest
                largest=arr[i];
            }

            //last element not greater than largest but can be the second largest
            else if(arr[i]<largest && arr[i]>sec)
            {
                sec=arr[i];
            }
        }    
        if(sec==Integer.MIN_VALUE)
        {
            System.out.println("-1");
            return ;
            //for cases where all array elements are the same so there is
            //no second largest
        }
        System.out.println("second largest:"+sec);

    }
    
}
/*
{2,489,627,29,12,904,23};
second largest:627

{2,2,2,2,};
-1

{2}
-1
*/