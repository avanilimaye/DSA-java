public class rotatestring 
{
    public static void main(String[] args) 
    {
        String s="abcde";
        String goal="cdeba";
        int n=s.length();
        int g=goal.length();
        if(n!=g)
        {
            
            return;

        }
        String s2=s+s;
        if(s2.contains(goal))
        {
            System.out.println("contains goal");
        }
        System.out.println("does not contain goal");
    }
}
