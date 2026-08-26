import java.util.Arrays;

public class PT2 
{
    public static void main(String[] args) 
    {
        //given a row, return all elements of the pascals triangle for that row
        int r=5;
        int n=r-1;
        int[] ans=new int[r];
        ans[0]=1;//first element is 1
        long value=1;
        for(int i=1;i<=n;i++)
        {
            value=value *(n-i+1);
            value=value/i;

            ans[i]=(int) value;
        }
        System.out.println("row "+r+":"+Arrays.toString(ans));

        
    }
}
/*
row 5:[1, 4, 6, 4, 1]
*/