import java.util.Arrays;
public class anagram 
{
    public static void main(String[] args) 
    {
        String s="anagram";
        String t="nagaram";
        //anagram is rearranging characters
        if(s.length()!=t.length())
        {
            System.out.println("not anagram");
            return;
        }

        //convert to character arrays
        //sort them using inbuilt
        //check if sorted ones match
        //if yes them its an anagram
        char [] s1=s.toCharArray();
        char [] t1=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);

        //convert back to string to compare
        String s2=new String(s1);
        String t2=new String(t1);
        for(int i=0;i<t2.length();i++)
        {
            if(s2.charAt(i)!=t2.charAt(i))
            {
                System.out.println("not anagram");
                return;
            }

        }
        System.out.println("is anagram");
    }
}
