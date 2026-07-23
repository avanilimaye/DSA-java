public class biggestdigit 
{   
    public static void main(String[] args) 
    {         
        int n=12362840;
        int biggest=0;
        while(n>0)
        {
            int lastdigit=n%10;
            if(lastdigit>biggest)
            {
                biggest=lastdigit;
            }
            n=n/10;
        }
        System.out.println("biggest:"+biggest);
        
    }
}
/*
biggest:8
*/