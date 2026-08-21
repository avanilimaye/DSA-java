import java.util.*;
public class largestelement 
{
    public static void main(String[] args) 
    {
        int [] arr={-100};
        int largest=Integer.MIN_VALUE;
        if(arr.length<=1)
        {
            System.out.println("largest:"+arr[0]);
            return;
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest=arr[i];
            }
        }
        System.out.println("largest:"+largest);
        }
    
}
/*
int [] arr={0,1,5,-3,7,9,100};
largest:100

int [] arr={-15,-2,-6,-200,-1};
largest:-1

int [] arr={-100};
largest:-100
*/