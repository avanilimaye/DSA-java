
import java.util.*;
public class stringrev 
{
    public static void main(String[] args) 
    {
        //here we are given input in form of list so use size,get,set
        //if in form of array then do like normal array reverse
    
        List<Character> s = new ArrayList<>();
        //adding input as hello
        s.add('h');
        s.add('e');
        s.add('l');
        s.add('l');
        s.add('o');

        int n=s.size();
        int i=0;
        int j=n-1;
        while(i<=j)
        {
            char temp=s.get(i);
            s.set(i,s.get(j));
            s.set(j,temp);

            i++;
            j--;
        }
        System.out.println(s);
    }
   
}
