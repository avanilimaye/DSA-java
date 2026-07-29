public class largestoddnum 
{
    public static void main(String[] args) 
    {
        String s="3769832798";
        int n=s.length();
        String largestodd="";
        for(int i=n-1;i>=0;i--)
        {
            int digit=s.charAt(i)-'0';//converted to int
            String a=s.substring(0,i+1);
            //start from backward(with entire num)
            
            if(digit%2!=0)//is odd
            {
                //remove leading zeroes
                int j=0;
                while(j< a.length() && a.charAt(j)=='0')
                {
                    j++;
                    
                } 
                largestodd = a.substring(j);
                System.out.println("largestodd: " + largestodd);
                return;
            }
            
        }
        System.out.println("no odd");
        }
        
}

/*
largestodd: 376983279
*/