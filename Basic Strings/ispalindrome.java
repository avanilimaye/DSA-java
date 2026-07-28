

public class ispalindrome 
{
    public static void main(String[] args) 
    {
        String s="a2b2a";
        int n=s.length();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println(s+" not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println(s+" is palindrome");
    }
}
/*
abbabba is palindrome
abbbba is palindrome
abmbbba not palindrome
a2b2a is palindrome
*/