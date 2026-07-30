/*
 Two strings s and t are isomorphic if the characters
in s can be replaced to get t.
All occurrences of a character must be replaced 
with another character while preserving the 
order of characters. No two characters may map to
the same character, but a character may map to itself.
*/

public class isomorphoc 
{
    public static void main(String[] args)
    {
        String s="egg";
        String t="add";
        int shash[]=new int[256];
        int thash[]=new int[256];
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            //check if they have been visited first 
            if(shash[s1]==0 && thash[t1]==0)
            {
                shash[s1]=t1;
                thash[t1]=s1;
            }

            /*assuming they have been visited,compare to
            see if its the same mapping*/
            if(shash[s1]!=t1 || thash[t1]!=s1)
            {
               System.out.println("not isomorphic");
               return;
            }
            
        }
        System.out.println("is isomorphic");

    }
}
