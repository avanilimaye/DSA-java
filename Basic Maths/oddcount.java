

public class oddcount 
{
    public static void main(String[] args) 
    {
        int n=76543211;
        int count=0;
        while(n>0)
        {
            int lastdigit=n%10;
            // we r assesing every remainder 
            //then reducing the number by 1 digit by doing n/10
            if(lastdigit%2!=0)
            {
                count++;
            }
            n=n/10;

        }
        System.out.print("odd count:"+count);
    }
}
/*
odd count:5
*/