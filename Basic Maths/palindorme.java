public class palindorme 
{
    public static void main(String[] args) 
    {
        int n=12321;
        String num=Integer.toString(n);
        int i=0;
        int j=num.length();
        while(i<j)
        {
            if(num.charAt(i)==num.charAt(j-1))
            {
                i++;
                j--;
            }
            else
            {
                System.out.println(n+" is not a palindrome");
                return;
            }
            
        }
        System.out.println(n+" is a palindrome");  
        }
    
}

/*
123321 is a palindrome
1234321 is a palindrome
122321 is not a palindrome
*/
