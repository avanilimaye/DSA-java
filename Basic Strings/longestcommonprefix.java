public class longestcommonprefix 
{
    public static void main(String[] args) 
    {
        String [] str={"flowers", "flow", "fly", "flight" };
        int n=str.length;
        int minlen=str[0].length();
        for(int i=0;i<n;i++)
        {
            if(str[i].length()<minlen)
            {
                minlen=str[i].length();
            }
        }

        String ans="";
        String temp=str[0];
        boolean match=true;
        for(int i=0;i<minlen;i++)
        {
            char ch=temp.charAt(i);
            for(int j=1;j<n;j++)
            {
                if(str[j].charAt(i)!=ch)
                {
                    match=false;
                    break;
                }
                
            }
            if(!match)
            {
                break;
            }
            ans=ans+ch;
        }
        System.out.println("longest common prefix:"+ans);
    }
    
}
/*
longest common prefix:fl
*/